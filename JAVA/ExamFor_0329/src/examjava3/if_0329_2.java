package examjava3;

import java.util.Scanner;

public class if_0329_2 {

	public static void main(String[] args) {
		// 수를 입력받아 짝, 홀수를 구분하여 출력하시오.
				Scanner scan = new Scanner(System.in);
				System.out.println("숫자를 입력하시오.");
				int a = scan.nextInt();
				if (a % 2 == 0){
					System.out.println("입력하신 " + a + "는 짝수입니다.");
			} 	else {
					System.out.println("입력하신" + a + "는 홀수입니다.");
			}
				
	}

}
