package examjava6;

import java.util.Scanner;
// Ƚ�� ������ for ���� �������� while
public class While_02 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(true) {
			System.out.print("�Է�: ");
			int n =in.nextInt();
			if(n% 2 ==0) {
				System.out.println("¦���Է����� ����!");
				break;
			}
			System.out.println("?"); // �Է��� ���ڸ� �ݺ��ϱ� ���� �ۼ�
		}

	}

}
