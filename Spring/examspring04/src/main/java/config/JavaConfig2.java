package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import examspring01.MemberDao;
import examspring01.MemberInfoPrinter;
import examspring01.MemberPrinter;
import examspring01.MemberRegisterService;
// 자동 주입을 확인하기 위해 의존 주입을 하지 않는 자바설정 코드 작성
//Configuration을 적용하면 스프링은 Bean으로 생성
@Configuration
public class JavaConfig2 {
	//@Autowired가 지정된 필드나 메서드에 자동주입을 적용
	@Bean 
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}

	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	// MemberInfoPrinter 객체를 생성하고 set을 호출하지 않는다. 수정
	@Bean
	public MemberInfoPrinter infoPrinter() {
		//MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		//infoPrinter.setMemberDao(memberDao());
		//infoPrinter.setMemberPrinter(printer());
		//return infoPrinter;
		return new MemberInfoPrinter();
	}
}
