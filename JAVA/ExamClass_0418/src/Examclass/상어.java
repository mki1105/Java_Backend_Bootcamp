package Examclass;

public class 상어 extends 어류  implements 물에서사는생물{
	@Override
	void 움직인다() {
		System.out.println("상어같이 움직인다.");
	}

	@Override
	void 잔다() {
		System.out.println("상어같이 잔다.");
	}
	
	void 상어특징() {
		System.out.println("상어만 가지는 특징");
	}

	@Override
	public void 물생활() {
		System.out.println("뚜루루뚜루~");
	}
}