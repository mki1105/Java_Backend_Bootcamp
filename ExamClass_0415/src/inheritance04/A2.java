package inheritance04;

public class A2 extends A{ //A를 상속하여 A2를 정의
	A2(){
		//super(100); //부모의 생성자 지정(명시하지 않으면 디폴트 생성자 지정)
		System.out.println("A2()");
	}
	void methodA2() { 
		System.out.println("methodA2()"); 
		//this.
		//super.
	}
}