package Examclass03;
// 건전지 객체, 음성목소리 string, 인형은 건전지를 참조해야 함.
// 인형 객체 생성, 인형기능할 때 배터리 전력량?
/* 속성 : 음성저장기능, 건전지
 * 메서드(기능) : 건전지 삽입기능(), 음성입력기능(), 음성출력기능()
 */
public class Doll {
	// 속성(값)
	// String voice; // 음성목소리
	// boolean power; // 인형 전원
	Battery battery = null; // 인형은 건전지를 참조해야 함. 배터리는 없음.
	//말하는 인형이 얼만큼 전기를 필요로 하는가  final변수에 붙으면 상수값 고정하는 것.
	//서로 다른 합성어를 밑줄로 사용하면 상수라고 생각해라.
	final int Rec_use = 11; // 녹음 동작시 필요한 전력량
	final int Prt_use = 10;	// 출력 동작시 필요한 전력량6
	//저장하려면 변수가 필요함, 값을 저장하는 멤버는 필드(변수)
	String message = ""; // ""빈 문자열 // null녹음된 기능이 없음.
	// static이 붙지 않으면 객체마다 존재하는 변수
	
	// 기능(메서드) 
	// 누군가가 메시지를 전달해줄 것임.//녹음 하는기능 넣기 외부에서 값을 전달받도록, 내부에서 사용하도록
	void voicein(String msg) { //녹음
		System.out.println("녹음: 배터리 없음");
		// 녹음기능이 동작할 때 배터리가 있는지 체크
		if(battCheck()) { // 함수호출, 배터리를 넣지 않았다.
			 return; //나온 결과에 따라서 true면 배터리가 있다.
		}
		//배터리가 존재 한다면 전기가 있는지 elec호출, 전기가 있으면 동작, 녹음할 때는 rec만큼 필요하다.
		if(battery.elec(Rec_use) !=0) {// 0이 아니면 메시지를 녹음해라
			System.out.println("녹음: 성공," + battery.cap);
			message = msg;  //메시지에 msg저장
			return; //전기가 없으면 아무것도 안한다. 그대로 둬라.
		}
		System.out.println("녹음: 배터리 부족");
	}
		
	// 눌렀을 때 외부로 전달해주는 기능, 녹음된거 출력
	 String voiceout() { //어딘가 다른 곳에서 확인할 수 있게끔 한다.
		
		 if(battCheck()) { // 함수호출, 배터리를 넣지 않았다.
			 System.out.println("출력: 배터리 없음");
			 return null;
		}
		 if(battery.elec(Prt_use) !=0) { //배터리가 출력에 필요한 만큼 없다면
			 System.out.println("출력: 성공," + battery.cap);
			 return message; //0이 아니면 출력한다.
		 }
		 System.out.println("출력: 배터리 부족");
		 return null; // 없다면 출력하지 말아라.
	}
	 
	 boolean battCheck() { //자주사용되는 코드는 함수 사용해보기
		return (battery == null) ? true : false; //삼항연산자 조건? 참 : 거짓
	 }
	 
	 final String Type = "AA"; //final은 상수를 고정시키는 함수
	 
	 void setBatt(Battery b) { //배터리를 넣고, 제거하는 개념표현
		if(b.type.equals(Type)) { //넣어줄 때 건전지의 타입을 확인	
			System.out.println("배터리 장착 성공!");
			battery = b; //건전지가 AA여야만 삽입해야 한다.
		} else { //그게 아니면
			System.out.println("배터리 타입이 맞지 않음.");
		}
	 }
	Battery removebatt() { //건전지를 제거하는 기능
		Battery tmp = battery; //임시변수에 배터리를 넣어놓고
		battery = null; // 배터리가 빠지면 값이 null이 되어야 한다.
		System.out.println("배터리 제거");
		return tmp; //배터리 값을 반환한다.
	 }
	
	
}