package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Member;
import spring.MemberDao;

public class MainForMemberDao {

	private static MemberDao memberDao;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		memberDao = ctx.getBean("memberDao", MemberDao.class);

		selectAll();
		updateMember();
		insertMember();
		selectAll();

		ctx.close();
	}

	private static void selectAll() {
		System.out.println("------selelctAll");
		int total = memberDao.count();

		System.out.println("전체 데이터 : " + total);
		List<Member> members = (List<Member>) memberDao.selectAll();
		for (Member m : members) {
			System.out.println(m.getId() + ":" + m.getEmail() + ":" + m.getName());
		}
	}
	// 이메일 검색해서 암호 랜덤으로 변경하기
	private static void updateMember() {
		System.out.println("--------updateMember");
		Member member = memberDao.selectByEmail("test1@mail");
		String oldPw = member.getPassword();
		String newPw = Double.toHexString(Math.random());
		member.changePassword(oldPw, newPw);

		memberDao.update(member);
		System.out.println("암호 변경 :" + oldPw + " > " + newPw);

	}
	
	private static void insertMember() {
		System.out.println("----------insertMember");
		SimpleDateFormat dateaFormat = new SimpleDateFormat("MMddHHmmss");
		String prefix = dateaFormat.format(new Date());

		Member member = new Member(prefix + "@test.com", prefix, prefix, new Date());
		memberDao.insert(member);
		System.out.println(member.getId() + "데이터 추가");
	}
}
