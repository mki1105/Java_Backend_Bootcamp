package Examdoll2;

public class Battery {
	int �뷮; // ���͸� �뷮
	String ����; //���͸� ���� ���ڿ�
	
	void insertCap(int cap) { //���͸� ���Կ뷮 ������ cap ������ �ޱ�
		�뷮 = cap;
	}
	
	void insertType(String t) { // ���͸�Ÿ�� ���ڿ� t�� �ޱ�
		���� = t;
	}
	
	int plus(int w) { // ���͸� ���뷮 plus�� ������ w�� �ޱ�
		if(�뷮 - w > 0) { //	���� ���� �ִ� �뷮���� ��뷮�� ���� ũ�� 
			�뷮 -= w; // �뷮���� ��뷮�� ���� �뷮�� ������Ű��
			return w; // w��뷮 ��ȯ
		}else { // �׷��� ������
			int tmp = �뷮; // �� �뷮�� tmp�� �����ϰ�
			�뷮 = 0; // ���͸� �뷮�� 0�� �Ǹ�
			return tmp; //tmp����� ��ȯ
		}
		//return�� ����� ��ȯ

   }
}