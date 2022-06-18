package Examclass03;

public class Remote2 {
	// TV를 참조해야 함. 리모컨이 TV를 사용한다는 것을 표현
	public static void main(String[] args) {
		TV tv = new TV(); //TV객체 생성
		tv.brand = "삼성";
		
		Remote rc = new Remote(); //리모컨 객체생성
		rc.powerOn(); //왜 틀린거지?
		rc.chUp();
		rc.chDw();
		rc.volUp();
		rc.volUp();
	
		
	}
	
}
