package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUpdateTransaction {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("appctx.xml");
		
		ChangePasswordService changePasswordService = ctx.getBean("changePasswordService", ChangePasswordService.class);
		
		String email = "mki1105@naver.com";
		changePasswordService.changePassword(email, "4567", "1234"); 
		//비밀번호가 변경이 되던 안되던 트랜잭션 동작 확인
		//autocommit - false
		//update~
		//autocommit - true
		
	}
		
}
