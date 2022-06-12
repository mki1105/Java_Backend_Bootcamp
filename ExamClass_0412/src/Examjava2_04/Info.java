package Examjava2_04;
//이름과 나이를 저장하는 클래스
/*
* 접근 제어자: 클래스의 멤버에 대한 접근을 제한하기 위한 키워드 
* 	private : 클래스 내부에서만 직접 접근 가능한 멤버(일반적으로 필드에 적용)
*  	public : 접근에 제한이 없는 멤버(일반적으로 메서드에 적용)
*  	protected : 디폴트 제한 + 상속관계에서 자식 클래스인 경우만 직접 접근 가능
*  	default(package) : 접근제어자 선언이 없는 멤버(동일 패키지 까지 직접 접근 가능)
*  
*  getter: 멤버 필드의 값을 반환하는 멤버 메서드
*  setter: 멤버 필드의 값을 설정하는 멤버 메서드
*/
public class Info {
	private String name;
	private int age;
	
	public Info(){
		System.out.println("Info()");
	}
	public Info(String n, int a){
		System.out.println("Info(String, int)");
		name = n;
		age = a;
	}
	
	//setter(set멤버필드명(인자))
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	
	//getter(get멤버필드명(){ return 멤버필드; })
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String infoToString() {
		return "Info[name=" + name + ", age=" + age + "]";
	}
}
