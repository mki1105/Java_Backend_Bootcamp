package inheritance07;


public class A2 extends A{ //A를 상속하여 A2를 정의
	A2(){
		System.out.println("A2()");
	}
	void methodA2() { 
		System.out.println("methodA2()"); 
	}
	
	//조상 클래스에 정의된 메서드를 자식에서 재정의(Override)
	/*
	 * 부모의 메서드와 signature가 동일
	 * 접근 제한이 좁아질 수 없음(대부분 동일하게 정의)
	 */
	@Override //어노테이션
	void methodAA() {
		System.out.println("자식에서 정의한 methodAA()");
	}
}
