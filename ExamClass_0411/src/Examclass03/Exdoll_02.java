package Examclass03;
public class Exdoll_02 { //�ϼ���
	public static void main(String[] args) {
	//������, ���� ��ü ����
	//���ϴ� ������ ����ϴ� ����
	Doll doll1 = new Doll(); // ��ü�� �����ϴ� ��(�޸𸮿� ��ü�� ������ ��)
	/* heap(����(����)�޸�)- �����߿� ��������� ���� ������ �� �ִ� ��.
	 * ���α���� ����ϰ� ������ ������ �ϱ� ���ؼ��� ���������� �ʿ���
	 * ���ϴ� ������ ������ �� �ִ� doll1�̴�.
	 * ��������(doll1)�� ���ϴ� ������ �����ϰ�, ������ ��ü�� �����ϴ� ������ �ְڴ�.
	 */
	// doll1.voicein(); // ���ǵǾ� �ִ� ����̶�� �ڵ尡 �����Ѵ�. message ��ȯ����
	String m = doll1.voiceout(); // ���ϵǴ� �޽����� �޾Ƽ� ���� �޽����� ��µǴ��� �� �� �ִ�.
	System.out.println(doll1 + " ���� �� : " + m);
	
	Battery b1 = new Battery();
	b1.cap = 100;
	b1.type = "AA";
			
	doll1.setBatt(b1); // �º��͸��� b1�� �־��, ��ü�� ������ �� �ְ� �������ش�.
	//�����ȿ� �޽����� ������ �Ǿ�� �ϴ°� ������ �ؾ��Ѵ�.
	doll1.voicein("��ü���� �ȳ�"); //�������� �޽����� �Ѿ�� ��.
	m = doll1.voiceout(); // �ٽ� ����غ���
	System.out.println(doll1 + " ���� �� :" + m); //doll1 ������ ����غ���
	
	b1 = doll1.removebatt(); //1�� ���͸� �����Ѱ� b1�� �ٽ� ���
	Doll doll2 = new Doll(); //���� 2 �����ϱ�
	doll2.setBatt(b1);//2�� b1�� �ٽ� �־��ֱ�, �������� 1�� �����ߴٰ� 2���ٽ� ����
	
	doll2.voicein("�� �ι�° ��ü��");
	m = doll2.voiceout();
	System.out.println(doll2  + " ���� �� : " + m);

	Battery b2 = new Battery(); //b2������ ���
	b2.cap = 50;
	b2.type = "AA";
	
	//Battery
	
	doll1.setBatt(b2); //,,
	m = doll1.voiceout(); //��ü�� �ٸ��� ������ 2�� 2, 1�� 1�� ���� ���� �ʴ´�.
	System.out.println(doll1 + " ���� �� :" + m);
	
	m = doll1.voiceout(); // �� ���
	System.out.println(doll1 + " ���� �� :" + m);

	}
}
