package Examdoll2;
/* 
 * 
 */
public class Use {
	public static void main(String[] args) {
		SpeekingDoll sd = new SpeekingDoll(); //���� ����

		//���͸� ����
		Battery bat = new Battery();
		bat.insertType("AA");
		bat.insertCap(100);
		
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

		Battery bat2 = new Battery();
		bat2.insertType("AA");
		bat2.insertCap(50);
		
		//Battery tmp = sd.insertBattery(bat2);
		
		Battery tmp = sd.removeBattery();
		System.out.println("���� ���͸�:" + tmp.�뷮);
		sd.insertBattery(bat2);
		
		sd.speek();
	
	}

}
