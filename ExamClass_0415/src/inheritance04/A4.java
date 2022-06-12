package inheritance04;

public class A4 extends A2, A3{ //다중상속 (자바에서 X)
	A4(){
		//super(100); //부모의 생성자 지정(명시하지 않으면 디폴트 생성자 지정)
		System.out.println("A4()");
	}
	void methodA4() { 
		System.out.println("methodA4()"); 
		//this.
		//super.
	}
	
} 