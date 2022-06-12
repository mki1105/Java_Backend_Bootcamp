package Examclass;
	// 추상메서드는 선언만 하고 정의를 안한다.
	// 동물 a = new 동물(); // 추상 클래스는 객체 생성 불가
	// 추상 클래스는 타입(자료형)으로써 의미
	// 클래스 설계상 타입이라면 포유류도 추상클래스로 바꿔주기
public class 고래 extends 포유류 implements 물에서사는생물, 추가타입{
	@Override
	void 움직인다() {
		System.out.println("고래같이 움직인다.");
	}

	@Override
	void 잔다() {
		System.out.println("고래같이 잔다.");
	}
	
	void 고래특징() {
		System.out.println("고래만 가지는 특징");
	}

	@Override
	public void 물생활() {
		System.out.println("물에서 고래같이 생활한다");
	}
}