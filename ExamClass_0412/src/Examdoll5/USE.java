package Examdoll5;
/* 
 * 
 */
public class USE {
	public static void main(String[] args) {
		SpeekingDoll sd = new SpeekingDoll("AA"); //���� ����

		//���͸� ����
		Battery bat = new Battery(100, "AA");
		
		sd.insertBattery(bat);
		
		//sd.message = "�޸� �˶��"; //����ʵ� ���� ���� X
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.rec("�޸� �˶��"); //������ ���� ��� ���
		sd.speek();

		Battery bat2 = new Battery(100, "AA");
		//Battery tmp = sd.insertBattery(bat2);
		
		Battery tmp = sd.removeBattery();
		System.out.println("���� ���͸�:" + tmp.getCap());
		sd.insertBattery(bat2);
		
		sd.speek();
	
	}
}


