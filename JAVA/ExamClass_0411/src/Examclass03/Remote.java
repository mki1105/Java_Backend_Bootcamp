package Examclass03;
/*  TV tv = new TV는 리모컨 안에 TV는 생성하는 것이라 안됨.
 *  
 */
public class Remote {
	//속성만들기(값)
	TV tv; // TV를 참조해야 하는 것만 들어감. 리모컨이 TV를 사용한다는 것을 표현
	//기능(전원, 채녈변경, 볼륨변경)
	void powerOn() {
		tv.power  = !tv.power; //표현이 안맞음. 값은 기능을 통해서 접근해야 함.
		// TV의 전원을 직접 수정하고 있으니 TV의 전원 함수를 호출하는게 더 좋다.
		// tv.view(); 굳이 필요 없다.
	} 	// 값을 사용하는게 아니라 기능을 사용해야 한다.
	void chUp() {
		tv.channel++;
		tv.view();
	}
	void chDw() {
		tv.channel--;
		tv.view();
	}
	void volUp() {
		tv.volume++;
		tv.view();
	}
	void volDw() {
		tv.volume--;
		tv.view();
	}
	void view() {
		tv.view();
	}
}
