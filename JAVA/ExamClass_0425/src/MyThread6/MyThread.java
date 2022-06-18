package MyThread6;

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
		}
	}
/* 1. data�� n�� ������
 * 2. ������ ������ n�� ��
 * 3. ����� 0�̻��̸�(if)
 * 
 * ���ÿ� �� ���� ������ �� ��(�ϳ��� �ڿ���)
 * cpu�� ����� �Դٰ��� �ϸ鼭 ������
 * ���� �ȿ����� �ϳ��ϳ� �� ���� ������ �ϰ� ��.
 * A, B�� ��ɵ��� ���� ������� �����Ŵ.
 * A���� 1~2������ �����ϰ� B�� �Ѿ�� 
 */
	//�޼��忡 ���ؼ��� ����ȭ �޼��带 �������൵ ��- ����ȭ�޼��� public ������ Synchronized
	public int proc(int n) {
		int result = -1;
		//Synchronized(MyThread.class)����ȭ ������� ����ȭ�� ������ ������� ��.
		if ((data.getN() - n) >= 0) {
			System.out.printf("���� ������ ��: [%d]\n", data.getN());
			result = data.getN(n);
			System.out.printf("[%s]=> �����ͷκ��� [%d]������.\n", Thread.currentThread().getName(), n);
		}
		//Thread.yield(); ������ �纸
		//if�� �Ӱ迵������ �ѳ� ó�� �����ϴ�. �������°� ���� �� ������ �纸�� �˷��ֱ�.
		return result;
	}

}