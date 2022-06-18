package MyThread5;
/*
 * Daemon Thread : �ڹٿ����� ��� �����尡 ����Ǿ�� ���ø����̼�(jvm)�� �����.
 * Priority �켱���� : �����ϰ� ���߿� �ϴ� ������ �ƴ϶� ���� �� ��(����)�� �����ϴ� ��.
 * Thread ����?
 */
public class Exam01 {
	public static void main(String[] args) {
		MyThread1 mth01 = new MyThread1();
		mth01.setName("�ϾẰ");
		Thread mth02 = new Thread(new MyThread2());
		mth02.setName("������");
		mth01.setPriority(Thread.MAX_PRIORITY); // 10 ��
		mth02.setPriority(Thread.MIN_PRIORITY); // 1 ��
		System.out.println(mth01.getPriority());
		System.out.println(mth02.getPriority());

		mth01.setDaemon(true);
		mth02.setDaemon(true);
		// System.out.println(mth01.isDaemon());
		mth01.start(); // ���ο� ������� run������ ����
		mth02.start();
		/* ������ ���� ���
		 * interrupt() �޼��� ȣ�� �� ���� �������� ����� ������Ŵ.
		 * ����ó�� �ʿ�.
		 */

		for (int i = 1; i <= 100; i++) {
			System.out.println("�ܡܡܡܡܡܡܡܡܡ�" + i);
		}
	}
}