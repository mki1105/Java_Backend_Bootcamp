package Examdoll4;

public class SpeekingDoll {
	private Battery battery;
	private String bType;
	private String message;
	public static final int REC_W = 12; //���
	public static final int SPK_W = 15; //���
	
	
	public SpeekingDoll(String t){
		bType = t;
		message = "�����ϼ���.";
	}
	
	//���͸� ����
	public Battery insertBattery(Battery b) {
		if(!b.getType().equals(bType)) {
			System.out.println("���͸� Ÿ�� ����!");
			return null;
		}
		Battery bTmp = removeBattery();
		battery = b;
		return bTmp;
	}
	
	//���͸� ����
	public Battery removeBattery() {
		Battery bTmp = null;
		if(battery != null) {
			bTmp = battery;
		}
		return bTmp;
	}
	
	//����
	public void rec(String msg) {
		System.out.println("rec()" + battery.getCap());
		if(battery == null)
			return;
		int w = battery.plus(REC_W);
		if(w == REC_W) {
			message = msg;
		}
	}
	
	//���
	public void speek() {
		System.out.println("speek()");
		int w = battery.plus(SPK_W);
		if(w == SPK_W)
			System.out.println("message:" + message);
		else
			System.out.println("...");
	}

}
