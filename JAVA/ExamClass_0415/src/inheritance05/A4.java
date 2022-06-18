package inheritance05;

public class A4 extends A3{ //일자상속
	A4(){
		//super(100); //부모의 생성자 지정(명시하지 않으면 디폴트 생성자 지정)
		System.out.println("A4()");
	}
	void methodA4() { 
		System.out.println("methodA4()"); 
		//this. 나 자신 + 조상
		//super. 조상
	}
}