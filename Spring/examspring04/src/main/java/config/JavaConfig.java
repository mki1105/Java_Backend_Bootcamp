package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import examspring01.MemberDao;
import examspring01.MemberInfoPrinter;
import examspring01.MemberPrinter;
import examspring01.MemberRegisterService;
// 해당 클래스가 스프링 설정으로 사용된다는 것을 명시
// Bean과 메서드 이름을 이용하여 스프링 컨테이너가 사용할 bean객체를 설정
// 자바 설정에서는 bean객체를 직접 생성
// 의존 객체 주입도 자바객체를 직접 주입
// 자바코드를 통해 설정을 해도 싱글톤 패턴을 유지
@Configuration
public class JavaConfig {

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

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setMemberPrinter(printer());
		return infoPrinter;
	}
}
