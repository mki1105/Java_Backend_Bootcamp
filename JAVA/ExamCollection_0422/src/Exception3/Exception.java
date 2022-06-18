package Exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	/*
	 * try { } : ���ܰ� �߻��Ǵ� ���� catch(try���� �߻��� ���ܰ�ü ����) {} : �߻��� ���ܸ� ��� ó���ϴ� ����
	 * finally { } : ���� �߻� ���ο� ���� ���� ������ ����Ǵ� ����(�ڿ� ���� �뵵)
	 * 
	 * throw : ���� ��ü�� ������ Ű���� throws : �޼��忡�� �߻��Ǵ� ���ܸ� ���(���� ����)
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("�� �Է�:");
		int n1 = 0, n2 = 0, ret = 0;

		try {
			n1 = in.nextInt(); // InputMismatchException
		} catch (InputMismatchException e) {
			 System.out.println("�Է¿� ������ �ִ�.");
			// System.out.println(e.getMessage());
		}

		System.out.print("�� �Է�:");
		try {
			n2 = in.nextInt(); // InputMismatchException
		} catch (InputMismatchException e) {
			// System.out.println("�Է¿� ������ �ִ�.");
			// e.printStackTrace(); //�̰͸� ���� ���
		}

		try {
			ret = n1 / n2; // ArithmeticException
		} catch (ArithmeticException e) {
			// System.out.println("0���� ���� �� ���� : " + e.getMessage());
		}
		System.out.println("���:" + ret);
	}
}