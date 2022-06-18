package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import examspring01.MemberDao;
import examspring01.MemberPrinter;
import examspring01.MemberRegisterService;

@Configuration
public class JavaSubConf {

	@Autowired
	public MemberDao memberDao;
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}



}
