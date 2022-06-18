package Examclass;

public class 오리너구리 extends 포유류  implements 물에서사는생물{
	@Override
	void 움직인다() {
		System.out.println("오리너구리같이 움직인다.");
	}

	@Override
	void 잔다() {
		System.out.println("오리너구리같이 잔다.");
	}
	
	void 오리너구리특징() {
		System.out.println("오리너구리는 짜파구리랑 무슨관계?");
	}

	@Override
	public void 물생활() {
		System.out.println("물에서 오리처럼 생활하다가 너구리됨");
	}
}