package Examclass03;

public class Exdoll {

	public static void main(String[] args) {
	//������, ���� ��ü ����
	//���ϴ� ������ ����ϴ� ����
	Doll doll1 = new Doll(); // ��ü�� �����ϴ� ��(�޸𸮿� ��ü�� ������ ��)
	/* heap(����(����)�޸�)- �����߿� ��������� ���� ������ �� �ִ� ��.
	 * ���α���� ����ϰ� ������ ������ �ϱ� ���ؼ��� ���������� �ʿ���
	 * ���ϴ� ������ ������ �� �ִ� doll1�̴�.
	 * ��������(doll1)�� ���ϴ� ������ �����ϰ�, ������ ��ü�� �����ϴ� ������ �ְڴ�.
	 */
	doll1.voiceout(); // ���ǵǾ� �ִ� ����̶�� �ڵ尡 �����Ѵ�. message ��ȯ����
	String m = doll1.voiceout(); // ���ϵǴ� �޽����� �޾Ƽ� ���� �޽����� ��µǴ��� �� �� �ִ�.
	System.out.println(doll1 + " ���� �� : " + m);
	//�����ȿ� �޽����� ������ �Ǿ�� �ϴ°� ������ �ؾ��Ѵ�.
	doll1.voicein("��ü���� �ȳ�"); //�������� �޽����� �Ѿ�� ��.
	m = doll1.voiceout(); // �ٽ� ����غ���
	System.out.println(doll1 + " ���� �� :" + m); //doll1 ������ ����غ���
	
	
	Doll doll2 = new Doll(); //���� 2 �����ϱ�
	doll2.voicein("�� �ι�° ��ü��");
	m = doll2.voiceout();
	System.out.println(doll2  + " ���� �� : " + m);
	m = doll1.voiceout(); //��ü�� �ٸ��� ������ 2�� 2, 1�� 1�� ���� ���� �ʴ´�.
	System.out.println(doll1 + " ���� �� :" + m);
	Battery battery = new Battery();
	

	}
}
