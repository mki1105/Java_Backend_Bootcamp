package inheritance07;

public class Exam01 {
	public static void main(String[] args) {
		A ob = new A();
		A2 ob1 = new A2();
		ob1.methodA();	//�θ� ���ǵ� �Ϲ� �޼���
		ob1.methodA2(); //�ڽĿ� ���ǵ� �Ϲ� �޼���
		ob1.methodAA(); //�ڽĿ� ���ǵ� �޼���(�������̵� �Ǿ� ����)
		System.out.println();
		
		//���� Ŭ���� ������ �ڽ� ��ü�� ������ �� �ִ�.(up-casting)
		A a = ob1;
		
		System.out.println(a);
		System.out.println(ob1);
		
		a.methodA(); //AŬ������ ���ǵ� �޼���
		//a.methodA2(); //�ڽĿ� ���ǵ� �Ϲ� �޼��� ȣ�� �Ұ�
		a.methodAA(); //�������� �ڽ��� �޼���
	}
}