package Examclass01;
// 클래스 : 객체를 정의해 놓은 것(자료형)
// 관련 있는 속성과 행위를 묶음(멤버)으로 관리
// 
public class Ex03 {

		public static void main(String[] args) {
			//한 명의 이름과 나이를 저장
			Info info1 = null;
			info1 = new Info(); //객체 생성하고 info1참조변수로 참조
			
			info1.name = "홍길동";
			info1.age = 20;
			
			System.out.println(info1.name);
			System.out.println(info1.age);
		}
	}
