package MyThread3;

//������ ������� ������ ��ü�� Ŭ������ ����
public class MyThread1 extends Thread{
	//�������� main�� ���� ����
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}

}