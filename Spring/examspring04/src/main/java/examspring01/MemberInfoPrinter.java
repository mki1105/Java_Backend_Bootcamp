package examspring01;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	@Autowired
	private MemberDao memDao;
	private MemberPrinter printer;
	// memberDao 객체를 주입하고 있는데 MemberDao형태의 객체를 얻어오려면
	// 설정 파일이 서로 다르기 때문에 일반적인 호출방법으로 불가능함
	// Dao 객체를 얻어오기 위해 필드를 만들어 외부 설정파일에서 만든 객체를
	// 자동 주입 받은 후 다른 의존 주입에 사용하도록 설정되어 있음
	
	// set 메서드들에 @Autowired 적용 = 자바코드를 통한 설정에서 자동주입 사용
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	@Autowired
	public void setMemberPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			System.out.println("정보없음!\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}
