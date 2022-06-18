package Examdoll3;

public class Battery {
	Battery battery;
	String bType;
	String message;
	
	void SpeekingDoll(String t){
		bType = t;
		message = "녹음하세요.";
	}
	
	//배터리 삽입
	Battery insertBattery(Battery b) {
		if(!b.battery.equals(bType)) {
			System.out.println("배터리 타입 오류!");
			return null;
		}
		Battery bTmp = removeBattery();
		battery = b;
		return bTmp;
	}
	
	// 배터리 제거
	Battery removeBattery() {
		Battery bTmp = null;
		if(battery != null) {
			bTmp = battery;
		}
		return bTmp;
	}
	
	//녹음
	void rec(String msg) {
		System.out.println("rec()" + battery.bType);
		if(battery == null)
			return;
		int w = battery.plus(12);
		if(w == 12) {
			message = msg;
		}
	}
	
	//출력
	void speek() {
		System.out.println("speek()");
		int w = battery.plus(15);
		if(w == 15)
			System.out.println("message:" + message);
		else
			System.out.println("...");
	}

}
