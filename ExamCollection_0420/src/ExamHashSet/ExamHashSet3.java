package ExamHashSet;
/* ������ ���ϴ� ���� �˻��ϴ� ���� contains(value)
 * Iterator�� ��� ����, Ŭ���� ��ü�κ��� �޼��� ������
 * �ؽ��ڵ�� �� ��ü�� ���� �ִ� ���� �̿�.
 */
public class ExamHashSet3 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = new String("hellp");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = new Integer(2);

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());

	}
}
