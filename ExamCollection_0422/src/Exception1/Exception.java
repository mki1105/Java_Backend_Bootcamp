package Exception1;

import java.util.Scanner;
/*
 *  try { } : ���ܰ� �߻��Ǵ� ����
 *  catch() {} : �߻��� ���ܸ� ��� ó���ϴ� ����
 *  finally { } : ���� �߻� ���ο� ���� ���� ������ ����Ǵ� ����(�ڿ� ���� �뵵)

 *  throw : ���� ��ü�� ������ Ű����
 *  throws : �޼��忡�� �߻��Ǵ� ���ܸ� ���(���� ����)
 */

public class Exception {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�� �Է�:");
		int n1 = in.nextInt(); //InputMismatchException
		System.out.print("�� �Է�:");
		int n2 = in.nextInt(); //InputMismatchException
		
		int ret = n1 / n2; //ArithmeticException
		System.out.println("���:" + ret);
	}
}




