package assembler;

import examspring01.ChangePasswordService;
import examspring01.MemberDao;
import examspring01.MemberRegisterService;

/*
 * 조립기능 객체를 생성하고 의존 객체를 주입해주는 기능을 제공
 * 또한 특정 객체를 필요로 하는 곳에 객체를 제공할 수 있음.
 * 
 * 
 */
public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() { // dao가 필요해서 주입
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao); //의존 객체 주입
		pwdSvc = new ChangePasswordService(memberDao); //의존 객체 주입
		// xml에서 bean으로 
	}
	//필요한 곳에 반환
	public MemberDao geMemeberDao() {
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
	
}
