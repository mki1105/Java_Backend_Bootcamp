package Examclass03;
/* ���͸�
 * �Ӽ�(�ʵ�) : ������, ������, �뷮, ����
 * ���(�޼���) : ������()
 */
public class Battery {
	// �Ӽ�(��)
	String type; //������ ����
	int cap; //�뷮
	
	// ���(�޼���) - �ܺο� ���⸦ �����ϴ� ���, ���� �ִ� ��ŭ
	int elec(int use) { //int���� ��ȯ, (�ʿ��� �� ��ŭ�� �ʿ�����)
		if(cap - use <= 0) {//���� �ִ� �뷮���� ��ŭ�� ���ְڴ��� ����
			return 0; // ������ �뷮�� ����.
		}else { // �װ� �ƴϸ�
			cap -= use; // �뷮���� ��뷮�� ���ذ�
			return use; // ��뷮�� �־��ָ� �� ǥ��.
		}	//return�� ����� ��ȯ
	}
}