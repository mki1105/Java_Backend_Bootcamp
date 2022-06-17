package examspring01;

import java.util.Date;
// 클래스 한개(기능한개)의 핵심 메서드만 사용하는 것으로 설계의 차이임.
public class MemberRegisterService {
	private MemberDao memberDao; // dao 받음
	// new 하는건 좋지 않음. 결합도가 높아져 dao 수정할 때 전부 수정해야 함.
	// 직접생성하는 것보다 di
	public MemberRegisterService(MemberDao memberDao) { // 전달되는 대상으로
		this.memberDao = memberDao; // 주입하자
	}
	
	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
			if(member != null) { // 이메일이 존재하면
				throw new AlreadyExistingMemberException(
						"dup email" + req.getEmail());
			}
			// 예외발생이 아니면 insert 하자
			Member newMember = new Member(
					req.getEmail(),
					req.getPassword(),
					req.getName(),
					new Date());
			memberDao.insert(newMember);
	}
	
}
