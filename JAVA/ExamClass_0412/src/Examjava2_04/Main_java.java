package Examjava2_04;

public class Main_java {
	public static void main(String[] args) {
		Info info1 = new Info(); //디폴트 생성자 호출
		//info1.name = "홍길동";
		//info1.age = 20;
		info1.setName("홍길동");
		info1.setAge(20);
		
		Info info2 = new Info("이순신", 22);
		
		System.out.println(info1.getName());//System.out.println(info1.name);
		System.out.println(info1.getAge());//System.out.println(info1.age);
		
		//System.out.println(info2.name);
		//System.out.println(info2.age);
		System.out.println(info1.infoToString());
	}

}
