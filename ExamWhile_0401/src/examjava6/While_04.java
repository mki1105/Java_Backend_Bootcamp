package examjava6;

import java.util.Scanner;

public class While_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean state = true;
		while(state) {
			System.out.print("입력:");
			int n = in.nextInt();
			if(n == -1)
				state = !state;
			System.out.println("n:" + n);
		}
		System.out.println("프로그램 종료!");

	}

}
