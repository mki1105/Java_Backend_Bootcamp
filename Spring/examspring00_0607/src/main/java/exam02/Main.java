package exam02;

import java.util.Scanner;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericXmlApplicationContext("appContext.xml");
		// 의존객체를 가지는
		Calculator count = ctx.getBean("CountCalculator", CountCalculator.class);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("연산자 입력");
			String cal2 = scan.nextLine();

			System.out.println("첫 번째 수 입력");
			int num1 = scan.nextInt();
			System.out.println("두 번째 수 입력");
			int num2 = scan.nextInt();

			switch (cal2) {
			case "+":
				System.out.println("add 연산횟수 : " + count.add(num1, num1));
				break;
			case "-":
				System.out.println("min 연산횟수 : " + count.min(num1, num1));
				break;
			case "*":
				System.out.println("mul 연산횟수 : " + count.mul(num1, num1));
				break;
			case "/":
				System.out.println("div 연산횟수 : " + count.div(num1, num1));
				break;
			}
			System.out.println(count.toString());

		}
	}
}


//	public class Main {
//		public static void main(String[] args) {
//			ApplicationContext ctx = 
//					new ClassPathXmlApplicationContext("appContext3.xml");
//			
//			CountCalculator calc = ctx.getBean("calc", CountCalculator.class);
//			
//			System.out.println(calc.add(1, 2));
//			System.out.println(calc.min(12, 2));
//			System.out.println(calc.mul(9, 2));
//			System.out.println(calc.div(32, 3));
//			System.out.println(calc.mul(9, 2));
//			System.out.println(calc.div(32, 3));
//			
//			System.out.println("횟수");
//			System.out.println(calc.getAddCount());
//			System.out.println(calc.getMinCount());
//			System.out.println(calc.getMulCount());
//			System.out.println(calc.getDivCount());
			

