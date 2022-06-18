package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import examspring01.MemberDao;
import examspring01.MemberInfoPrinter;
import examspring01.MemberPrinter;

@Configuration
public class ConfigPart2 {
//MemberDao 객체를 참조함
	@Autowired
	private ConfigPart1 configPart1; // configpart1 객체를 의존 주입 받도록 지정
	
	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		//infoPrinter.setMemberDao(memberDao);
		infoPrinter.setMemberDao(configPart1.memberDao());
		infoPrinter.setMemberPrinter(printer());
		return infoPrinter;
	}
	
}
