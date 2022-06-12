package examjava5;

public class star10_for {

	public static void main(String[] args) {
		for(int i =0 ; i<5 ; i++) {	
		 //스페이스 공백 만들어주기
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
		}//별 ( 무조건 5번이 아니라 줄어들게끔 식을 짜야한다)
			for(int j = 0; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}