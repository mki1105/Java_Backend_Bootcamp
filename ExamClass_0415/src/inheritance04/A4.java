package inheritance04;

public class A4 extends A2, A3{ //���߻�� (�ڹٿ��� X)
	A4(){
		//super(100); //�θ��� ������ ����(������� ������ ����Ʈ ������ ����)
		System.out.println("A4()");
	}
	void methodA4() { 
		System.out.println("methodA4()"); 
		//this.
		//super.
	}
	
} 