package MyThread5;

//������ ������� ������ ��ü�� Ŭ������ ����
public class MyThread1 extends Thread {
	// �������� main�� ���� ����
	@Override
	public void run() {
		long cnt = 1;
		while (true) {
			System.out.println(Thread.currentThread() + "�١١١١١١١١١�" + cnt++);
		}
	}

}