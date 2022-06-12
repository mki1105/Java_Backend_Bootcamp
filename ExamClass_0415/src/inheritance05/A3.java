package inheritance05;

public class A3 extends A2{ //A2를 상속하여 A3를 정의
	A3(){
		//super(100); //부모의 생성자 지정(명시하지 않으면 디폴트 생성자 지정)
		System.out.println("A3()");
	}
	void methodA3() { 
		System.out.println("methodA3()"); 
		//this. 나 자신 + 조상
		//super. 조상
	}
}