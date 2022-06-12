package Examjava10_0408;
//메소드 (method)
/* 자주 사용할 코드를 정의해두고 필요할 때 호출(call)해서 사용
 * -구조
 * [접근제한] [예약어] 반환자료형 메서드명(매개변수들..) [throws 예외클래스]{
 * 	문장;
 * 	문장;
 * 	[return; or return 반환값;]
 *  void가 있으면 return 적지 않아도 된다.
 *  반환자료형에는 primitive(int, double 등)/class
 * } 매개변수는 값을 전달받기 위한 
 */
public class Exammethod_01 {
	
	public static void printAvg() { //반환자료형 메서드명(매개변수),
		System.out.println("평균은 콘솔에 출력..");
		return ;
	}
	public static int add(int n1, int n2) { //매개변수 2개 2칸 준비가 되어있음. 어떤 값을 전달해줘야 사용이 가능.
		int ret = n1 + n2;
		return ret;
	}
// n1, n2 메모리 영역이 다르지만 값은 같다. add에서 호출되었으면 main은 잠시 멈춤
// 동작 다 끝나면(함수호출하면) add는 없어지고 main영역에서 진행이 된다. 중괄호 안에서만 사용되는 변수는 지역변수. 
// 자료형만 다른 동일한 기능의 메서드를 정의할 때
// 메서드 명을 동일하게 정의할 수 없음(오버로딩이 제공되지 않는)
// 메서드 이름에 자료형을 표현
// 자바는 오버로딩 제공
	/* 메서드 오버로딩이란 동일한 이름의 메서드를 정의할 수 있다.
	 * - 매개변수(parameter)의 타입/개수/선언된 순서(여러개일경우)  인자를 받는 변수가 파라미터.
	 * 매서드 호출 시 전달되는 인자(argument)의 자료형에 따라 호출 할 메서드를 구분. 
	 */
	
	public static void main(String[] args) {
		System.out.println("code..");
		System.out.println("code..");
		printAvg();
		System.out.println("code..");
		System.out.println("code..");
		System.out.println("code..");
		printAvg();
		
		int n1 = 10;
		int n2 = 20;
		int result =add(n1, n2);
		System.out.println(result);
	}
}

