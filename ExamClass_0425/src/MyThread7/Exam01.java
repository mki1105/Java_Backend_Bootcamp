package MyThread7;

/*
 * Thread Synchronized 동기화
 * (동기화 처리가 되어 있지 않을 때)
 * 비동기는 요청했는데 답이 오지 않아도 그 다음 일을 진행해도 됨.
 * 동기는 요청했는데 답이 와야만 다음 일이 진행 됨.
 * 하나의 자원에 접근할 때 동기화 되지 않고 비동기이기 때문에
 */
public class Exam01 {
	public static void main(String[] args) {
		Data data = new Data();
		MyThread th = new MyThread(data);
		Thread m1 = new Thread(th, "A");
		Thread m2 = new Thread(th, "B");
		
		m1.start();
		m2.start();
	}
}