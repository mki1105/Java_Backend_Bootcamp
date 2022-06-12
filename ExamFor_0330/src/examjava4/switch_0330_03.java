package examjava4;
	import java.util.Scanner;

public class switch_0330_03 {

	public static void main(String[] args) {
		// 정수 두개를 입력받아 사칙연산을 하는 계산기 만들기
		Scanner key = new Scanner(System.in);
		System.out.println("연산자를 입력하시오.");
		String n = key.nextLine(); // 한글자 가져오는걸로 사용, nextLine은 개행관련 문제
		/* char oper = in.nextLine().charAt(0); char도 정수, 문자를 표현할 때 사용
		 * "" 는 String 문자열, 문자열에 붙이면 됨.
	 	 * in.nextLine(); 개행 읽어서버림
		 */ 
		System.out.println("첫 번째 숫자를 입력하시오.");
		int a = key.nextInt();
		System.out.println("두 번째 숫자를 입력하시오.");
		int b = key.nextInt(); //int ret =0;
		
		switch (n) {
		case "+": //
			System.out.println("결과는? " + (a+b));break;
		case "-":
			System.out.println("결과는? " + (a-b));break;
		case "*":
			System.out.println("결과는? " + (a*b));break;
		case "/":
			System.out.println("결과는? " + (a/b));break;
		default :System.out.println("연산자가 아닙니다.");
		}
	}

}
