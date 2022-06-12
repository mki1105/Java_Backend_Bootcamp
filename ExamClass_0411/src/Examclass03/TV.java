package Examclass03;
// 객체지향(object 
// 현실을 모델링
// 클래스 안에 포함될 수 있는건 변수, 함수
//생성한 객체는 참조할 변수가 있어야 한다. 
public class TV {
	//속성(값)
	String brand;
	boolean power;
	int channel;
	int volume;
	
	//기능
	void powerOn() {
		power = !power;
		view();
	}
	void chUp() {
		channel++;
		view();
	}
	void chDw() {
		channel--;
		view();
	}
	void volUp() {
		volume++;
		view();
	}
	void volDw() {
		volume--;
		view();
	}
	void view() {
		System.out.println("[" + brand + "]");
		if(power) {
			System.out.println(channel + "," + volume);
		}
		else {
			System.out.println("검은화면");
		}
	}
}
