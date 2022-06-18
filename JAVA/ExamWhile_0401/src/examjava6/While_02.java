package examjava6;

import java.util.Scanner;
// 횟수 기준은 for 상태 기준으로 while
public class While_02 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(true) {
			System.out.print("입력: ");
			int n =in.nextInt();
			if(n% 2 ==0) {
				System.out.println("짝수입력으로 종료!");
				break;
			}
			System.out.println("?"); // 입력한 숫자를 반복하기 위해 작성
		}

	}

}
