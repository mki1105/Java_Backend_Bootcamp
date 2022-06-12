package Examjava2_03;

//이름과 나이를 저장하는 클래스
/*
* 객체 초기화 방법
* 1. 직접 초기화
* 2. 블록 초기화
* 3. 생성자 초기화
*/
public class Info {
	String name = "이름없음"; //직접 초기화
	int age = 10;	//직접 초기화
	
	{	//블록 초기화
		for(int i = 0; i < 10; i++) {
			age += i;
		}
	}
	
	Info(){
		System.out.println("Info()");
	}
	Info(String n, int a){
		System.out.println("Info(String, int)");
		name = n;
		age += a;
	}
	
	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}

}
