package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import examspring01.MemberDao;
import examspring01.MemberRegisterService;

@Configuration
public class ConfigPart1 {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
}
