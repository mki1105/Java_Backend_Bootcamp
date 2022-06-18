package Examdoll2;

public class SpeekingDoll {
	Battery battery; // �������� ������ �������� �����ؾ� ��.
	String bType = "AA"; // ���ڿ� ���͸� Ÿ��
	String message; // ���ڿ� �޽���
	
	//���͸� ����
	Battery insertBattery(Battery b) { //���͸� ������ b�� �ܺο��� ���� ���޹ް�,���ο��� ����� 
		if(!b.����.equals(bType)) { //������ ���͸��� Ÿ���� �ƴϸ�!
			System.out.println("���͸� Ÿ�� ����!"); //������� ���!
			return null; //?? 
		}
		Battery bTmp = removeBattery(); // ���͸������Ѱ� tmp�� ����
		battery = b;
		return bTmp; // �ƹ��͵� ���� ������ ���͸��� �־��ֶ�� ��
	} //return�� ����� ��ȯ
	
	//���͸� ����
	Battery removeBattery() { //������ �����ϴ� ���
		Battery bTmp = null; // bTmp��������, null�� ����, null���� ���͸� ������� ����, �ƹ��͵� ����.
		if(battery != null) { //���� ���͸��� ���� ������
			bTmp = battery; // ���͸��� ������� ����?
		}
		return bTmp; //�ƴϸ� ���͸� ������ null�� ��ȯ�ȴ�.
	}
	
	//�����ϴ� ���
	void rec(String msg) { // ������ �޽����� �ܺο��� ���� ���޹޾� ����
		System.out.println("rec()"	+ battery.�뷮); //������ �뷮 ���
		if(battery == null) // ���͸� ���� ������
			return;	// �ƹ��͵� ����?
		int w = battery.plus(12); //������  ��뷮 w������ ���͸� 12�� �ʱ�ȭ
		if(w == 12) { // ���� 12�� ������
			message = msg; // ���ڿ� msg�� �޽����� ����
		}
	}
	//����ϴ� ���
	void speek() {
		System.out.println("speek()");
		int w = battery.plus(15); //������ ��뷮 w������ ���͸� ���·� 15�� �ʱ�ȭ
		if(w == 15) //����ϴ� �뷮�� 15��
			System.out.println("message: " + message); 
		else
			System.out.println("...");
	}
}
