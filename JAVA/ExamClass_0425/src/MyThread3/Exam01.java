package MyThread3;

public class Exam01 {
	public static void main(String[] args) {
		MyThread1 mth01 = new MyThread1();
		Thread mth02 = new Thread(new MyThread2());
		
		mth01.start(); //���ο� ������� run������ ����
		mth02.start();
		
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%2d ", i);
			if(i != 0 && i%10 == 0)
				System.out.println();
		}
	}
}