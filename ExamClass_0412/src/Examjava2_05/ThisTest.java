package Examjava2_05;
//�̸� �ڿ� ��ȣ ������ �޼���, this�� �� ������ ��ü, �� ��ü�� �Լ�, �ش� Ŭ������ ���� �ִ�, �����ڸ� ������ ��
class Test{
	int a;
	Test(/*Test this*/) {
		this(0);
		System.out.println(this);
		System.out.println("Test()");
	}
	Test(/*Test this*/int a) {
		System.out.println(this);
		this.a = a;
		System.out.println("Test(int)");
	}
	void method(/*Test this*/) {
		System.out.println("method()�� ȣ���� ��ü:" + this);
		this.a = 200;
	} 
	
	void method2(Test THIS) {
		System.out.println(THIS);
	}
}

public class ThisTest {
	public static void main(String[] args) {
		Test ob1 = new Test();
		Test ob2 = new Test(10);
		
		System.out.println("ob1:" + ob1);
		System.out.println("ob2:" + ob2);
		
		ob1.method(/*ob1*/);
		//ob1.method2(ob1);

		ob2.method(/*ob2*/);
		
		ob1.a = 100;
	}

}
