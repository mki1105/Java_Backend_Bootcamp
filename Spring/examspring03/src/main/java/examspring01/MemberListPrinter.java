package examspring01;

import java.util.Collection;

public class MemberListPrinter {
	// 두 개 이상의 의존 객체를 생성자로 주입 받도록 작성	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		for(Member m : members) {
			printer.print(m);
		}
			
	}
}
