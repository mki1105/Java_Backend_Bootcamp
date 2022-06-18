package examjava4;

public class switch_0330_01 {

	public static void main(String[] args) {
		// switch 제어문, 괄호 안에 들어가는게 정수여야 한다.
		int n =3 ;
	switch(n) { //어떤 상수케이스와 매치가 되는가(선로변환기, 흐름을 그쪽으로 가져가 시작한다)
	case 1 : // 각 케이스별로 시작위치
		System.out.println("1");
		break; // switch, for, while 문에서 파괴하다의 개념으로 사용
	case 2 :
		System.out.println("2");
	case 3 :
		System.out.println("3");
		default : //메치할 실행값이 없을 때 진행되는 것, else if와 비슷
		System.out.println("default");
		
	}
	
	}

}
