package Examdoll4;

public class SpeekingDoll {
	private Battery battery;
	private String bType;
	private String message;
	public static final int REC_W = 12; //상수
	public static final int SPK_W = 15; //상수
	
	
	public SpeekingDoll(String t){
		bType = t;
		message = "녹음하세요.";
	}
	
	//배터리 삽입
	public Battery insertBattery(Battery b) {
		if(!b.getType().equals(bType)) {
			System.out.println("배터리 타입 오류!");
			return null;
		}
		Battery bTmp = removeBattery();
		battery = b;
		return bTmp;
	}
	
	//배터리 제거
	public Battery removeBattery() {
		Battery bTmp = null;
		if(battery != null) {
			bTmp = battery;
		}
		return bTmp;
	}
	
	//녹음
	public void rec(String msg) {
		System.out.println("rec()" + battery.getCap());
		if(battery == null)
			return;
		int w = battery.plus(REC_W);
		if(w == REC_W) {
			message = msg;
		}
	}
	
	//출력
	public void speek() {
		System.out.println("speek()");
		int w = battery.plus(SPK_W);
		if(w == SPK_W)
			System.out.println("message:" + message);
		else
			System.out.println("...");
	}

}
