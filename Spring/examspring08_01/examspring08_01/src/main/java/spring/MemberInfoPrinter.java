package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	
public class MemberInfoPrinter {
	
	@Autowired
	private MemberDao memberDao;
	private MemberPrinter memberPrinter;
	
	public void setMemDao(MemberDao memberDao) {
		System.out.println("setMemDao(MemberDao)");
		this.memberDao = memberDao;
	}
	
	@Autowired
	public void setMemberPrinter(MemberPrinter memberPrinter) {
		System.out.println("setMemberPrinter(MemberPrinter)");
		this.memberPrinter = memberPrinter;
	}
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		memberPrinter.print(member);
		System.out.println();
	}
}
