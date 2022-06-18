package Examdoll2;

public class SpeekingDoll {
	Battery battery; // 참조변수 인형이 건전지를 참조해야 함.
	String bType = "AA"; // 문자열 배터리 타입
	String message; // 문자열 메시지
	
	//배터리 삽입
	Battery insertBattery(Battery b) { //배터리 삽입을 b로 외부에서 값을 전달받게,내부에서 사용학 
		if(!b.종류.equals(bType)) { //삽입한 배터리의 타입이 아니면!
			System.out.println("배터리 타입 오류!"); //오류라고 출력!
			return null; //?? 
		}
		Battery bTmp = removeBattery(); // 배터리제거한걸 tmp에 보관
		battery = b;
		return bTmp; // 아무것도 값이 없으면 배터리를 넣어주라는 뜻
	} //return은 결과값 반환
	
	//배터리 제거
	Battery removeBattery() { //건전지 제거하는 기능
		Battery bTmp = null; // bTmp참조변수, null은 거짓, null값을 배터리 빈공간에 저장, 아무것도 없다.
		if(battery != null) { //만약 배터리의 값이 있으면
			bTmp = battery; // 배터리를 빈공간에 저장?
		}
		return bTmp; //아니면 배터리 없으면 null이 반환된다.
	}
	
	//녹음하는 기능
	void rec(String msg) { // 누군가 메시지를 외부에서 값을 전달받아 저장
		System.out.println("rec()"	+ battery.용량); //녹음시 용량 출력
		if(battery == null) // 배터리 값이 없으면
			return;	// 아무것도 안함?
		int w = battery.plus(12); //정수형  사용량 w변수에 배터리 12로 초기화
		if(w == 12) { // 만약 12와 같으면
			message = msg; // 문자열 msg를 메시지에 저장
		}
	}
	//출력하는 기능
	void speek() {
		System.out.println("speek()");
		int w = battery.plus(15); //정수형 사용량 w변수에 배터리 전력량 15로 초기화
		if(w == 15) //출력하는 용량이 15면
			System.out.println("message: " + message); 
		else
			System.out.println("...");
	}
}
