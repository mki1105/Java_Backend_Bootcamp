package examjava4;

public class switch_0330_02 {

	public static void main(String[] args) {
		// switch 제어문, 괄호 안에 들어가는게 정수여야 한다.
		/* String은 클래스타입의 자료형으로(객체지향) 참조와 객체라는 개념이 있다. ex: Scanner 앞에 new가 들어가는 이유는
		 * 객체를 생성하라는 뜻(붕어빵을 찍어낸다는 개념), 식별할 수 있어야 하기 때문에 객체를 만들라는 뜻. 사용해야 되니까 in을 활용.
		 *  byte, int, char, long, float 기본자료형(primitive-값이 담기는 그대로 들어가는 것)
		 *  각각 개체마다 가지는 식별값이 있다, 모든 객체는 hashcode라는 값이 있다(객체를 식별하는 값)
		 *  추가로 문자열 String을 사용할 수 있다. 상수 문자열은 쌍따옴표로 묶자. if와 switch와 차이점은 처리할 양이 많을 때
		 *  스위치가 내부적으로 훨씬 빠르다. 단순선택도구로 활용
		 */ 
		char n = 'B'; //65 == 'A' 아스키코드 // String n = "문자열"(문자 한개는 숫자지만 문자 여러개는 숫자가 아님)
		switch(n) { //어떤 상수케이스와 매치가 되는가(선로변환기, 흐름을 그쪽으로 가져가 시작한다)
			case 65 : // 각 케이스별로 시작위치
				System.out.println("A");
				break; // switch, for, while 문에서 파괴하다의 개념으로 사용
			case 'B' :
				System.out.println("B");
				break;
			case '가' :
				System.out.println("가");
				
			default : //메치할 실행값이 없을 때 진행되는 것, else if와 비슷
			System.out.println("default");

	}
	}
}
