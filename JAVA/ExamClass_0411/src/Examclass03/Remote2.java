package Examclass03;

public class Remote2 {
	// TV�� �����ؾ� ��. �������� TV�� ����Ѵٴ� ���� ǥ��
	public static void main(String[] args) {
		TV tv = new TV(); //TV��ü ����
		tv.brand = "�Ｚ";
		
		Remote rc = new Remote(); //������ ��ü����
		rc.powerOn(); //�� Ʋ������?
		rc.chUp();
		rc.chDw();
		rc.volUp();
		rc.volUp();
	
		
	}
	
}
