package inheritance07;

public class Exam01 {
	public static void main(String[] args) {
		A ob = new A();
		A2 ob1 = new A2();
		ob1.methodA();	//부모에 정의된 일반 메서드
		ob1.methodA2(); //자식에 정의된 일반 메서드
		ob1.methodAA(); //자식에 정의된 메서드(오버라이딩 되어 있음)
		System.out.println();
		
		//조상 클래스 참조는 자식 객체를 참조할 수 있다.(up-casting)
		A a = ob1;
		
		System.out.println(a);
		System.out.println(ob1);
		
		a.methodA(); //A클래스에 정의된 메서드
		//a.methodA2(); //자식에 정의된 일반 메서드 호출 불가
		a.methodAA(); //재정의한 자식의 메서드
	}
}