package MyThread2;

public class Exam01 {
	public static void main(String[] args) {
		MyThread1 mth01 = new MyThread1();
		mth01.start(); //���ο� ������� run������ ����
		
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%2d ", i);
			if(i != 0 && i%10 == 0)
				System.out.println();
		}
	}
}