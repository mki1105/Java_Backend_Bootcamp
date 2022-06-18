package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import examspring01.MemberDao;
import examspring01.MemberPrinter;
import examspring01.MemberRegisterService;

@Configuration
@ImportResource("classpath:sub-conf.xml")
public class JavaMainConf {

	@Autowired
	public MemberDao memberDao;

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

}
