package ExamHashSet;
/* contains(value) : ������ ���ϴ� ���� �˻��ϴ� ���.
 * Iterator�� �ݺ���, ��� ���� /Ŭ���� ��ü�κ��� �޼��� ������(print�� ����� ����)
 * equals : �ߺ�ó���� ���� ���ϱ� ���� �޼���
 * hashcode �� ��ü�� ���� �ִ� ��
 */
import java.util.Scanner;
import java.util.HashSet;

public class ExamHashSet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();

		// ���ʿ� ���� boolean flag;
		while (true) {
			System.out.print("�Է�(�������:" + hs.size() + ") :");
			String s = scan.nextLine();
			if (hs.add(s)) {// s�� ���� ������- ������ �����ϴ� �޼��� add
			//��� Ŭ������ ������Ʈ�� ����ϴϱ� ��ĳ�����ؼ� ������Ʈ�� �����ϰ� ��.
				System.out.println(hs);
			} else {
				System.out.println("�ߺ�!");
				break;
			}
		}

	}
}
