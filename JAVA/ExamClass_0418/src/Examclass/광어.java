package Examclass;

public class 광어 extends 어류  implements 물에서사는생물{
	@Override
	void 움직인다() {
		System.out.println("광어같이 움직인다.");
	}

	@Override
	void 잔다() {
		System.out.println("광어같이 잔다.");
	}
	
	void 광어특징() {
		System.out.println("광어는 맛있다.");
	}

	@Override 
	public void 물생활() {
		System.out.println("물 바닥에서 생활함");
	}
}