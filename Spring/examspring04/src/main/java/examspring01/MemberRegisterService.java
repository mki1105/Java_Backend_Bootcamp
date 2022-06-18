package examspring01;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

// 클래스 한개(기능한개)의 핵심 메서드만 사용하는 것으로 설계의 차이임.
public class MemberRegisterService {
	// @Resource(name = "memberDao")
	private MemberDao memberDao; // dao 받음

	@Autowired
	// @Autowired 생성자에는 적용불가
	// @Resource는 생성자에는 적용 불가(따라서 디폴트 생성자 필요)
	public MemberRegisterService(MemberDao memberDao) { // 전달되는 대상으로
		this.memberDao = memberDao; // 주입
	}
	
	public MemberRegisterService() {
		/*
		 * @Resource를 통한 의존 자동 주입은 생성자에 설정할 수 없으므로
		 * 디폴트 생성자가 없으면 예외가 발생된다.
		 */
	}

	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) { // 이메일이 존재하면
			throw new AlreadyExistingMemberException("dup email" + req.getEmail());
		}
		// 예외발생이 아니면 insert 하자
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}

}
