package examjava3;

import java.util.Scanner;

public class if_0329_2 {

	public static void main(String[] args) {
		// ���� �Է¹޾� ¦, Ȧ���� �����Ͽ� ����Ͻÿ�.
				Scanner scan = new Scanner(System.in);
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				int a = scan.nextInt();
				if (a % 2 == 0){
					System.out.println("�Է��Ͻ� " + a + "�� ¦���Դϴ�.");
			} 	else {
					System.out.println("�Է��Ͻ�" + a + "�� Ȧ���Դϴ�.");
			}
				
	}

}
