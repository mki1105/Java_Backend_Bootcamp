package Examjava2_03;

//�̸��� ���̸� �����ϴ� Ŭ����
/*
* ��ü �ʱ�ȭ ���
* 1. ���� �ʱ�ȭ
* 2. ��� �ʱ�ȭ
* 3. ������ �ʱ�ȭ
*/
public class Info {
	String name = "�̸�����"; //���� �ʱ�ȭ
	int age = 10;	//���� �ʱ�ȭ
	
	{	//��� �ʱ�ȭ
		for(int i = 0; i < 10; i++) {
			age += i;
		}
	}
	
	Info(){
		System.out.println("Info()");
	}
	Info(String n, int a){
		System.out.println("Info(String, int)");
		name = n;
		age += a;
	}
	
	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}

}
