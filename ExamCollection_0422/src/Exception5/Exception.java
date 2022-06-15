package Exception5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	/*
	 * try { } : ���ܰ� �߻��Ǵ� ���� catch(try���� �߻��� ���ܰ�ü ����) {} : �߻��� ���ܸ� ��� ó���ϴ� ����
	 * finally { } : ���� �߻� ���ο� ���� ���� ������ ����Ǵ� ����(�ڿ� ���� �뵵)
	 * 
	 * throw : ���� ��ü�� ������ Ű���� throws : �޼��忡�� �߻��Ǵ� ���ܸ� ����(���� ����)
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 0, ret = 0;
		try {
			System.out.print("�� �Է�:");
			n1 = in.nextInt(); // InputMismatchException
			System.out.print("�� �Է�:");
			n2 = in.nextInt(); // InputMismatchException
			ret = n1 / n2; // ArithmeticException
			System.out.println("������ ����");
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ���� : " + e.getMessage());
		} finally {
			System.out.println("���� �߻� ���ΰ� ���� ���� ������ ����");
			/*
			 * ���������, ��Ʈ��ũ ����� �� �ܺ� �ڿ��� ����� ������ �����ϴ� �뵵
			 */
			in.close(); // ��Ʈ�� �ݱ�
		}
		System.out.println("���:" + ret);
	}
}