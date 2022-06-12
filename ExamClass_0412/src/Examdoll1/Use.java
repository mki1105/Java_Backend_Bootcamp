package Examdoll1;

public class Use {
	public static void main(String[] args) {
		SpeekingDoll sd = new SpeekingDoll(); //인형 1 생성
		sd.message = "달링 알라뷰";
		sd.speek();
		
		SpeekingDoll sd2 = new SpeekingDoll(); //인형2 생성
		sd2.message = "하하하하핳";
		sd2.speek();
		
	}

}
