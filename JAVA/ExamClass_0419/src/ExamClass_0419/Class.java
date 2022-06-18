package ExamClass_0419;
/* 	Object Ŭ����
 *  - �ڹ��� ��� Ŭ������ object�� ���
 *  � Ÿ���� ��ü�̵��� ������Ʈ�� ������ ������(��ĳ����)
 *  # Object�� �޼��带 �ڽĿ��� ������
 *   - equals : ��ü ������ �� ��
 *   - hashCode : ��ü ���� ������ ��ü �ĺ�
 *   - toString : ��ü�� ����
 */
public class Class {
	public static void main(String[]args) {
		// �� ��ü�� ���� ���� - toString
		// ��ü���� �����Ǵ� �ĺ��ϴ� ��. hashcode(����) - �� ��ü�� ���� ��
		// ��ü�� ������ �ƴ��� equals - ���������� ��(���ΰ���) 
		// ���ɽ����� ���� ������ �ٲ� ���̴�.
		// ������ ����ϴ� ���� �ƴϰ� ���� ���� ��
	
		Object ob1 = new Object();
		System.out.println(ob1.hashCode());
		System.out.println(ob1.toString());
		System.out.println(ob1); //toString() ȣ��
		Object ob2 = new Object();
		Object ob3 = ob1;
		System.out.println(ob1 == ob2);
		System.out.println(ob1 == ob3);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}
}