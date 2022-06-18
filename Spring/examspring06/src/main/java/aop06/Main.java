package aop06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop06.xml");

		Person p1 = ctx.getBean("programmer", Person.class);
		Person p2 = ctx.getBean("progamer", Person.class);

		int useT1 = p1.usingComputer("1234"); // 스프링이 함수를 호출하기 전에 부팅앤로그인 메서드를 호출 시키고 다음동작 진행
		System.out.println("------------------");
		int useT2 = p2.usingComputer("4321");

		System.out.println(p1.getClass().getName() + " 이용시간 : " + useT1);
		System.out.println(p2.getClass().getName() + " 이용시간 : " + useT2);

	}

}
