package Examjava7;

import java.util.Scanner;

public class Examarray_03 {
	/* �迭�� ����ϱ� ���ؼ��� �ݺ����� ����ϰų�, �迭��
	 * ����� �� �ִ� �޼��带 Ȱ���ؾ� �Ѵ�.
	 */
	public static void main(String[] args) {
		// �ڹ��� �迭�� �������� ����
		// �������ε� : ������ Ÿ�ӿ� �ʿ��� ������ ������.(�ʿ��� ��ŭ ������ ����, ����)
		// �������ε� : ��Ÿ�ӿ� �ʿ��� ������ ������.
		// int a = 10; �����ϱ� ������ int 4byte�� ������. ������
		int []arr = null; // ���� �߿� ������.
		Scanner in = new Scanner(System.in);
		System.out.print("�迭�� ���̴�? ");
		int size = in.nextInt(); //�Է¹ް�
		arr = new int[size]; // ������ size�� ��ŭ �迭�� ����
		System.out.println(arr.length);
	}

}
