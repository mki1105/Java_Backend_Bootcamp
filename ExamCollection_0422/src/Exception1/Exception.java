package Exception1;

import java.util.Scanner;
/*
 *  try { } : 예외가 발생되는 영역
 *  catch() {} : 발생된 예외를 잡아 처리하는 영역
 *  finally { } : 예외 발생 여부와 관계 없이 무조건 실행되는 영역(자원 해제 용도)

 *  throw : 예외 객체를 던지는 키워드
 *  throws : 메서드에서 발생되는 예외를 명시(예외 전가)
 */

public class Exception {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수 입력:");
		int n1 = in.nextInt(); //InputMismatchException
		System.out.print("수 입력:");
		int n2 = in.nextInt(); //InputMismatchException
		
		int ret = n1 / n2; //ArithmeticException
		System.out.println("결과:" + ret);
	}
}




