package ExamHashSet;

import java.util.Scanner;
import java.util.HashSet;

public class ExamHashSet2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>();
		// < > �ڷ����� ����ϴ� ����, ���̾Ƹ�� ������.
		// hash�� �ߺ��� üũ����.
		// ���ʿ� ����? boolean flag;
		while (true) {
			System.out.println("�Է�(������� : " + hs.size() + ") : ");
			int a = scan.nextInt();
			if (hs.add(a)) {
				System.out.println(hs);
			} else {
				System.out.println("�ߺ�!");
				break;
			}
		}

	}
}
