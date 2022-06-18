package inheritance06;

public class Exam01 {
	public static void main(String[] args) {
		A2 ob1 = new A2();
		ob1.methodA(); //부모 메서드 사용
		ob1.methodAA(); //생성된 객체(자식)에 정의된 메서드 사용
		
		A ob2 = new A();
		ob2.methodAA(); 
	}

}