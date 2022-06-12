package Examdoll2;
/* 
 * 
 */
public class Use {
	public static void main(String[] args) {
		SpeekingDoll sd = new SpeekingDoll(); //인형 생성

		//배터리 생성
		Battery bat = new Battery();
		bat.insertType("AA");
		bat.insertCap(100);
		
		sd.insertBattery(bat);
		
		//sd.message = "달링 알라뷰"; //멤버필드 직접 접근 X
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.rec("달링 알라뷰"); //인형의 녹음 기능 사용
		sd.speek();

		Battery bat2 = new Battery();
		bat2.insertType("AA");
		bat2.insertCap(50);
		
		//Battery tmp = sd.insertBattery(bat2);
		
		Battery tmp = sd.removeBattery();
		System.out.println("기존 배터리:" + tmp.용량);
		sd.insertBattery(bat2);
		
		sd.speek();
	
	}

}
