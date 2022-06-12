package Examclass;

public class 개 extends 포유류 {
	// 추상메서드는 선언만 하고 정의를 안한다.
	// 동물 a = new 동물(); //추상 클래스는 객체 생성 불가
	// 추상 클래스는 타입(자료형)으로써 의미
	// 클래스 설계상 타입이라면 포유류도 추상클래스로 바꿔주기
	@Override
	void 움직인다() {
		System.out.println("개같이 움직인다.");
	}

	@Override
	void 잔다() {
		System.out.println("개같이 잔다.");
	}
	
	void 개특징() {
		System.out.println("개만 가지는 특징");
	}
}
