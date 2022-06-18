package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import examspring01.MemberDao;
import examspring01.MemberInfoPrinter;
import examspring01.MemberPrinter;

@Configuration
public class ConfigPartSub {
//MemberDao 객체를 참조함
	@Autowired
	private MemberDao memberDao;
	
	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
		//infoPrinter.setMemberDao(configPart1.memberDao());
		infoPrinter.setMemberPrinter(printer());
		return infoPrinter;
	}
	
}
