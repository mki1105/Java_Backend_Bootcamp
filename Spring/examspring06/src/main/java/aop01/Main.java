package aop01;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Proxy(new Programmer());
		// new Programmer가 Person delegate로 참조
		Person p2 = new Proxy(new Progamer());
		// 알고 보니까 중간에 proxy가
		// 핵심기능이 동작하기 전에 proxy가 동작을 한다. 스프링이 알아서 해줌.
		int useT1 = p1.usingComputer("1234");
		System.out.println("-------------------");
		int useT2 = p2.usingComputer("4321");

		System.out.println(p1.getClass().getName() + " 이용시간 : " + useT1);
		System.out.println(p2.getClass().getName() + " 이용시간 : " + useT2);
	}
}
