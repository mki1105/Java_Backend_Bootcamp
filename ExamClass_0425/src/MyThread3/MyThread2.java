package MyThread3;

//������ ������� ������ ��ü�� Ŭ������ ����
public class MyThread2 implements Runnable{
	//�������� main�� ���� ����
	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

}
