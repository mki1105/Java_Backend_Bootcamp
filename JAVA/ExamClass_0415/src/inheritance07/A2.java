package inheritance07;


public class A2 extends A{ //A�� ����Ͽ� A2�� ����
	A2(){
		System.out.println("A2()");
	}
	void methodA2() { 
		System.out.println("methodA2()"); 
	}
	
	//���� Ŭ������ ���ǵ� �޼��带 �ڽĿ��� ������(Override)
	/*
	 * �θ��� �޼���� signature�� ����
	 * ���� ������ ������ �� ����(��κ� �����ϰ� ����)
	 */
	@Override //������̼�
	void methodAA() {
		System.out.println("�ڽĿ��� ������ methodAA()");
	}
}
