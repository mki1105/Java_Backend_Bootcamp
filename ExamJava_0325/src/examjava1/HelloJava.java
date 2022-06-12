package examjava1;//파일이 속한 클래스를 명시, 한줄 주석

/* 는 멀티라인 주석
 * 
 * 
 */
// 다른 패키지의 클래스를 선언 -import
// public class는 파일 이름과 동일해야 함.
// main이라는 메소드 안에 작성, 실행되는 곳
//대문자로 시작하는 것은 클래스(그룹,묶음)
//System 다음 . 은 참조연산으로 클래스의 멤버를 지칭하기 위한 것(멤버 연산자)
//out은 클래스로 만들어진 실체를 객체라고 함.(PrintStream 실체로 만들어진)
//PrintStrea의 정의됐던 기능, println (메서드 이름) 출력하고 라인을 바꾸라는 뜻.
// "쌍따옴표는 문자열을 나타냄, 작성하고 있는 것들이 전부 문자이기 때문에 "" 안에 구분하기 위해 묶어주기
//쌍따옴표로 묶는 것들은 String.

public class HelloJava {
	public static void main(String[]arg) {
		System.out.println("hi~");
		System.out.println("호호");
		System.out.println(33);
 	}
}
