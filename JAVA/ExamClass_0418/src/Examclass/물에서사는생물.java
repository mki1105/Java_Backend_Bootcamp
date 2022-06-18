package Examclass;

/* 인터페이스
 * 완전한 추상클래스
 * 상수
 * 추상메서드
 * 1.8d에서 추가(default 메서드, static 메서드)
 * 필요한 곳에서 확장
 * interface -> interface(extends)
 * interface -> class(implements)
 */
// interface는 자바에서는 다중상속이 안된다.
/* 관계가 없는 애들을 묶어주기 위해 interface를 활용하여
 * 다중상속을 가능하게 한다.
 * ex)물에서 사는 동물로 묶기- 고래, 오리너구리, 펭귄, 상어
 */
public interface 물에서사는생물 {
	// 인터페이스 멤버 필드
	int aaa = 10;// 자동으로 public static final
	
	//인터페이스 멤버 메서드
	void method(); // 자동으로 public abstract
	// 변수 가질 수 없다.
	// 내부적으로 생성자 개념은 있지만 인터페이스는 없음
	// 생성되는게 아니고, 클래스도 아니고 별도의 타입이라고 생각해라.
	// void method() {
	// 정의를 하면 안된다.
	// }
}
