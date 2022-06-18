package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfig;
import examspring01.MemberInfoPrinter;
import examspring01.MemberRegisterService;
import examspring01.RegisterRequest;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		//xml설정과 이 부분만 다름
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);

		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("mki1105@naver.com");
		regReq.setName("김민경");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);

		infoPrinter.printMemberInfo("mki1105@naver.com");
	}
}
