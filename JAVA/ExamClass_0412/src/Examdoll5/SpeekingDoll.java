package Examdoll5;

public class SpeekingDoll {
	private Battery battery;
	private String bType;
	private String message;
	public static final int REC_W = 12; //���
	public static final int SPK_W = 15; //���
	
	
	public SpeekingDoll(String bType){
		this.bType = bType;
		message = "�����ϼ���.";
	}
	
	//���͸� ����
	public Battery insertBattery(Battery battery) {
		if(!battery.getType().equals(bType)) {
			System.out.println("���͸� Ÿ�� ����!");
			return null;
		}
		Battery bTmp = removeBattery();
		this.battery = battery;
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
	public void rec(String message) {
		System.out.println("rec()" + battery.getCap());
		if(battery == null)
			return;
		int w = battery.plus(REC_W);
		if(w == REC_W) {
			this.message = message;
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
