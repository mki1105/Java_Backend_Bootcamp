package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigPart1;
import config.ConfigPart2;
import config.JavaConfig2;
import examspring01.MemberInfoPrinter;
import examspring01.MemberRegisterService;
import examspring01.RegisterRequest;

public class MainTwoConfs {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(ConfigPart1.class, ConfigPart2.class);
		
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		// 별도의 클래스 정의(command 객체라고 부름 - 명령객체)
		RegisterRequest regReq = new RegisterRequest();
		
		regReq.setEmail("mki1105@naver.com");
		regReq.setName("김민경");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);

		infoPrinter.printMemberInfo("mki1105@naver.com");
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
}
