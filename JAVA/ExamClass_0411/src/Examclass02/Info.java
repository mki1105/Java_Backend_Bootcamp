package Examclass02;
// Ŭ���� : ��ü�� ������ ���� ��(�ڷ���)
// ���� �ִ� �Ӽ��� ������ ����(���)���� ����
public class Info{
	String name; //��� �ʵ�(�Ӽ�)
	int age;	//��� �ʵ�(�Ӽ�)
	
	void printInfo() { //��� �޼���(����)
		System.out.println("[" + name + "," + age + "]");
	}
	String infoToString() {
		return "Info[name=" + name +", age="+ age + "]";
	}
}
