package inheritance05;

public class A3 extends A2{ //A2�� ����Ͽ� A3�� ����
	A3(){
		//super(100); //�θ��� ������ ����(������� ������ ����Ʈ ������ ����)
		System.out.println("A3()");
	}
	void methodA3() { 
		System.out.println("methodA3()"); 
		//this. �� �ڽ� + ����
		//super. ����
	}
}