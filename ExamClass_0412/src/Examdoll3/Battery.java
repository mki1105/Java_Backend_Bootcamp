package Examdoll3;

public class Battery {
	Battery battery;
	String bType;
	String message;
	
	void SpeekingDoll(String t){
		bType = t;
		message = "�����ϼ���.";
	}
	
	//���͸� ����
	Battery insertBattery(Battery b) {
		if(!b.battery.equals(bType)) {
			System.out.println("���͸� Ÿ�� ����!");
			return null;
		}
		Battery bTmp = removeBattery();
		battery = b;
		return bTmp;
	}
	
	// ���͸� ����
	Battery removeBattery() {
		Battery bTmp = null;
		if(battery != null) {
			bTmp = battery;
		}
		return bTmp;
	}
	
	//����
	void rec(String msg) {
		System.out.println("rec()" + battery.bType);
		if(battery == null)
			return;
		int w = battery.plus(12);
		if(w == 12) {
			message = msg;
		}
	}
	
	//���
	void speek() {
		System.out.println("speek()");
		int w = battery.plus(15);
		if(w == 15)
			System.out.println("message:" + message);
		else
			System.out.println("...");
	}

}
