package Examjava10_0408;
//�޼ҵ� (method)
/* ���� ����� �ڵ带 �����صΰ� �ʿ��� �� ȣ��(call)�ؼ� ���
 * -����
 * [��������] [�����] ��ȯ�ڷ��� �޼����(�Ű�������..) [throws ����Ŭ����]{
 * 	����;
 * 	����;
 * 	[return; or return ��ȯ��;]
 *  void�� ������ return ���� �ʾƵ� �ȴ�.
 *  ��ȯ�ڷ������� primitive(int, double ��)/class
 * } �Ű������� ���� ���޹ޱ� ���� 
 */
public class Exammethod_01 {
	
	public static void printAvg() { //��ȯ�ڷ��� �޼����(�Ű�����),
		System.out.println("����� �ֿܼ� ���..");
		return ;
	}
	public static int add(int n1, int n2) { //�Ű����� 2�� 2ĭ �غ� �Ǿ�����. � ���� ��������� ����� ����.
		int ret = n1 + n2;
		return ret;
	}
// n1, n2 �޸� ������ �ٸ����� ���� ����. add���� ȣ��Ǿ����� main�� ��� ����
// ���� �� ������(�Լ�ȣ���ϸ�) add�� �������� main�������� ������ �ȴ�. �߰�ȣ �ȿ����� ���Ǵ� ������ ��������. 
// �ڷ����� �ٸ� ������ ����� �޼��带 ������ ��
// �޼��� ���� �����ϰ� ������ �� ����(�����ε��� �������� �ʴ�)
// �޼��� �̸��� �ڷ����� ǥ��
// �ڹٴ� �����ε� ����
	/* �޼��� �����ε��̶� ������ �̸��� �޼��带 ������ �� �ִ�.
	 * - �Ű�����(parameter)�� Ÿ��/����/����� ����(�������ϰ��)  ���ڸ� �޴� ������ �Ķ����.
	 * �ż��� ȣ�� �� ���޵Ǵ� ����(argument)�� �ڷ����� ���� ȣ�� �� �޼��带 ����. 
	 */
	
	public static void main(String[] args) {
		System.out.println("code..");
		System.out.println("code..");
		printAvg();
		System.out.println("code..");
		System.out.println("code..");
		System.out.println("code..");
		printAvg();
		
		int n1 = 10;
		int n2 = 20;
		int result =add(n1, n2);
		System.out.println(result);
	}
}

