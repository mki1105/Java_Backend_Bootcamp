package inheritance05;

public class A4 extends A3{ //���ڻ��
	A4(){
		//super(100); //�θ��� ������ ����(������� ������ ����Ʈ ������ ����)
		System.out.println("A4()");
	}
	void methodA4() { 
		System.out.println("methodA4()"); 
		//this. �� �ڽ� + ����
		//super. ����
	}
}