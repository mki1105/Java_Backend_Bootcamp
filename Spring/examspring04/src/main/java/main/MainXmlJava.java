package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import examspring01.MemberInfoPrinter;
import examspring01.MemberRegisterService;
import examspring01.RegisterRequest;
// xml파일을 사용하기 때문에 GenericXmlApplicationContext클래스 사용하여 스프링 컨테이너 생성
public class MainXmlJava {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:main-conf.xml");

		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);

		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("mki1105@naver.com");
		regReq.setName("김민경");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);

		infoPrinter.printMemberInfo("mki1105@naver.com");
		
		((GenericXmlApplicationContext)ctx).close();
	}
}
