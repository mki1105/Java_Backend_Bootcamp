package Examclass;

public abstract class 동물 {
	//추상메서드는 선언만 하고 정의를 안한다.
	//동물 a = new 동물();
	//추상 클래스는 객체 생성 불가
	//추상 클래스는 타입(자료형)으로써 의미
	//명확히 정의할 수 없기 때문에 추상클래스로.
	abstract void 움직인다();
	abstract void 잔다();
	abstract void 호흡();
	void 동물만의특징() {
		System.out.println("동물의 특징");
	}
}

