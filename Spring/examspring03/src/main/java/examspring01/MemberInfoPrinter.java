package examspring01;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/* set으로 시작하는 프로퍼티 설정 메서드를 통해 의존객체를 주입하는 방법 
 * 설정메서드를 사용하기 위한 조건?
 * - 메서드 이름이 set으로 시작해야 함.
 * - set뒤에는 프로퍼티 이름의 첫 글자를 대문자로 치환한 이름을 사용함.
 * - 한 개의 파라미터를 가지고, 이 때 파라미터의 타입은 프로퍼티의 타임
 * 이메일을 전달받아 전달받은 이메일 주소와 일치하는 회원의 정보를 출력하는 클래스
 */
public class MemberInfoPrinter {
	@Autowired
	private MemberDao memDao;
	private MemberPrinter printer;
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	@Autowired
	@Qualifier("sysout")
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
