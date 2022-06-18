package Exception4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	/*
	 * try { } : 예외가 발생되는 영역 catch(try에서 발생된 예외객체 참조) {} : 발생된 예외를 잡아 처리하는 영역
	 * finally { } : 예외 발생 여부와 관계 없이 무조건 실행되는 영역(자원 해제 용도)
	 * 
	 * throw : 예외 객체를 던지는 키워드 throws : 메서드에서 발생되는 예외를 명시(예외 전가)
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 0, ret = 0;
		try {
			System.out.print("수 입력:");
			n1 = in.nextInt(); // InputMismatchException
			System.out.print("수 입력:");
			n2 = in.nextInt(); // InputMismatchException
			ret = n1 / n2; // ArithmeticException
			System.out.println("나눗셈 종료");
		}
//			catch(Exception e) {
//				System.out.println("모든 예외");
//			} //범위가 넓은(상위 예외클래스 타입) Exception을 먼저 선언하면 안됨!
		catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음 : " + e.getMessage());
		}
		System.out.println("결과:" + ret);
	}
}
