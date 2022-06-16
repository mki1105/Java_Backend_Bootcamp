package exam01;

import java.util.Scanner;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericXmlApplicationContext("appContext.xml");

		Calculator cal = ctx.getBean("Calculator", Calculator.class);
		// Calculator count = ctx.getBean("ㅐㅐㅐclass);
		Scanner scan = new Scanner(System.in);
		// 연산자 입력
		System.out.println("연산자 입력");
		String cal2 = scan.nextLine();
		// 수2개 입력
		System.out.println("첫 번째 수 입력");
		int num1 = scan.nextInt();
		System.out.println("두 번째 수 입력");
		int num2 = scan.nextInt();
		int result = 0; // 결과
		if (cal2.equals("+")) {
			System.out.println("result =" + cal.add(num1, num2));
		} else if (cal2.equals("-")) {
			System.out.println("result =" + cal.min(num1, num2));
		} else if (cal2.equals("*")) {
			System.out.println("result =" + cal.mul(num1, num2));
		} else if (cal2.equals("/")) {
			System.out.println("result =" + cal.div(num1, num2));
		}	
	}
}
