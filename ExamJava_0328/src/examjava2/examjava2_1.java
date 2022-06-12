package examjava2;

import java.util.Scanner;

public class examjava2_1 {
	public static void main(String[] args) {
		//자신의 이니셜을 입력 받아서 출력해라
		System.out.println("자신의 이니셜은?");
		Scanner in = new Scanner(System.in);
		String init = in.nextLine();
		System.out.println("이니셜 : " + init + "입니다");
	
		// String Initial;
		// Initial = in.nextLine();
		// System.out.println("이니셜 : " + Initial);도 가능
	}		
			
}
