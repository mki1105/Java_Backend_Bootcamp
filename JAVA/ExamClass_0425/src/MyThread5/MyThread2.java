package MyThread5;

//������ ������� ������ ��ü�� Ŭ������ ����
public class MyThread2 implements Runnable {
	// �������� main�� ���� ����
	@Override
	public void run() {
		long cnt = 1;
		while (true) {
			System.out.println(Thread.currentThread() + "�ڡڡڡڡڡڡڡڡڡ�" + cnt++);
		}
	}

}