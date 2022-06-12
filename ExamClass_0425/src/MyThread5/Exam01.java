package MyThread5;
/*
 * Daemon Thread : 자바에서는 모든 스레드가 종료되어야 어플리케이션(jvm)이 종료됨.
 * Priority 우선순위 : 먼저하고 나중에 하는 개념이 아니라 실행 시 빈도(비중)를 지정하는 것.
 * Thread 상태?
 */
public class Exam01 {
	public static void main(String[] args) {
		MyThread1 mth01 = new MyThread1();
		mth01.setName("하얀별");
		Thread mth02 = new Thread(new MyThread2());
		mth02.setName("검은별");
		mth01.setPriority(Thread.MAX_PRIORITY); // 10 ☆
		mth02.setPriority(Thread.MIN_PRIORITY); // 1 ★
		System.out.println(mth01.getPriority());
		System.out.println(mth02.getPriority());

		mth01.setDaemon(true);
		mth02.setDaemon(true);
		// System.out.println(mth01.isDaemon());
		mth01.start(); // 새로운 스레드로 run내용을 동작
		mth02.start();
		/* 스레드 종료 방법
		 * interrupt() 메서드 호출 시 현재 수행중인 명령을 중지시킴.
		 * 예외처리 필요.
		 */

		for (int i = 1; i <= 100; i++) {
			System.out.println("●●●●●●●●●●" + i);
		}
	}
}