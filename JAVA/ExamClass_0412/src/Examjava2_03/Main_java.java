package Examjava2_03;

public class Main_java {

		public static void main(String[] args) {
			Info info1 = new Info(); //디폴트 생성자 호출
			info1.printInfo();
			
			Info info2 = new Info("홍길동", 20);
			info2.printInfo();
			
			
		}

}
