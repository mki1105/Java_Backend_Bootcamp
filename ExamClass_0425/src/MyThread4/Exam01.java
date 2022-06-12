package MyThread4;
/*
 * Daemon Thread?
 * Priority 우선순위
 * Thread 상태?
 */
public class Exam01 {
	public static void main(String[] args) {
		MyThread1 mth01 = new MyThread1();
		Thread mth02 = new Thread(new MyThread2());
		
		mth01.setDaemon(true);
		mth02.setDaemon(true);
		System.out.println(mth01.isDaemon());
		mth01.start(); //새로운 스레드로 run내용을 동작
		mth02.start();
		
		for(int i = 1; i <= 100; i++) {
			System.out.println("●●●●●●●●●●" + i);
		}
	}
}