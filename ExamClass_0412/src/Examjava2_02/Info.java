package Examjava2_02;

	public class Info {
		String name;
		int age;
		
		/*
		 * 생성자(Constructor)
		 * - 클래스명과 동일한 이름의 멤버 메서드
		 * - 객체 생성 시 반드시 호출 (ex. new Info(); )
		 * - 인자가 없는 생성자(Default Constructor)
		 * - 반환 자료형 선언이 없음
		 * - 디폴트 생성자는 생성자를 하나도 정의하지 않으면 JVM이 알아서 호출
		 * - 오버로딩 가능(객체 생성하는 방법을 다양하게 제공)
		 * - 객체의 초기화 목적이다!
		 */
		Info(){
			System.out.println("Info()");
		}
		Info(String n, int a){
			System.out.println("Info(String, int)");
			name = n;
			age = a;
		}

}
