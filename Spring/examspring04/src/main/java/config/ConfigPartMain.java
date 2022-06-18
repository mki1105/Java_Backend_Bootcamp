package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import examspring01.MemberDao;
import examspring01.MemberRegisterService;
// Configuration 이 적용되어 스프링 설정에 사용될 것.
// Import 어노테이션을 선언하며 ConfigPartSub클래스에 설정된 Bean객체도 스프링 설정에 포함
@Configuration
@Import(ConfigPartSub.class )// 다른 자바설정 파일을 포함하도록 지정
public class ConfigPartMain {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
}
