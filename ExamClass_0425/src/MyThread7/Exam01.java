package MyThread7;

/*
 * Thread Synchronized ����ȭ
 * (����ȭ ó���� �Ǿ� ���� ���� ��)
 * �񵿱�� ��û�ߴµ� ���� ���� �ʾƵ� �� ���� ���� �����ص� ��.
 * ����� ��û�ߴµ� ���� �;߸� ���� ���� ���� ��.
 * �ϳ��� �ڿ��� ������ �� ����ȭ ���� �ʰ� �񵿱��̱� ������
 */
public class Exam01 {
	public static void main(String[] args) {
		Data data = new Data();
		MyThread th = new MyThread(data);
		Thread m1 = new Thread(th, "A");
		Thread m2 = new Thread(th, "B");
		
		m1.start();
		m2.start();
	}
}