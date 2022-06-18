package MyThread8;

//������ ������� ������ ��ü�� Ŭ������ ����
public class MyThread implements Runnable {

	private Data data;

	public MyThread(Data data) {
		this.data = data;
	}

	// �������� main�� ���� ����
	@Override
	public void run() {
		int n = 300;
		while (true) {
			int ret = proc(n);
			if (ret == -1) {
				System.out.printf("[%s] ����. ������ ���� ��: [%d]\n", Thread.currentThread().getName(), data.getN());
				break;
			}
			System.out.printf("[%s]=> �����ͷκ��� [%d]������.\n", Thread.currentThread().getName(), n);
		}
	}
	//�޼��忡 ���ؼ��� ����ȭ �޼��带 �������൵ ��- ����ȭ�޼��� public ������ Synchronized
	public synchronized int proc(int n) { // ����ȭ �޼���
		int result = -1;
		if ((data.getN() - n) >= 0) {
			System.out.printf("���� ������ ��: [%d]\n", data.getN());
			result = data.getN(n);
		}
		Thread.yield(); // ������ �纸
		//if�� �Ӱ迵������ �ѳ� ó�� �����ϴ�. �������°� ���� �� ������ �纸�� �˷��ֱ�.
		return result;
	}

}