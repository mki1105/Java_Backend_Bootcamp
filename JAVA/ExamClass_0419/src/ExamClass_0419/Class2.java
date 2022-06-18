package ExamClass_0419;
/* 	Object Ŭ����
 *  - �ڹ��� ��� Ŭ������ object�� ���
 *  � Ÿ���� ��ü�̵��� ������Ʈ�� ������ ������(��ĳ����)
 *  # Object�� �޼��带 �ڽĿ��� ������
 *   - equals : ��ü ������ �� ��
 *   - hashCode : ��ü ���� ������ ��ü �ĺ�
 *   - toString : ��ü�� ����
 */
public class Class2 {
		public static void main(String[] args) {
			Object ob1 = new Info("ȫ�浿", 20);
			System.out.println(ob1.hashCode());
			System.out.println(ob1.toString());
			System.out.println(ob1); //toString() ȣ��
			Object ob2 = new Info("ȫ�浿", 20);
			Object ob3 = ob1;
			System.out.println(ob2.hashCode());
			System.out.println(ob1 == ob2);
			System.out.println(ob1 == ob3);
			System.out.println(ob1.equals(ob2));
			System.out.println(ob1.equals(ob3));
		}
	}