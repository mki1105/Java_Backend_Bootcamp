package MyThread8;

//별도의 스레드로 동작할 객체를 클래스로 정의
public class MyThread implements Runnable {

	private Data data;

	public MyThread(Data data) {
		this.data = data;
	}

	// 스레드의 main과 같은 역할
	@Override
	public void run() {
		int n = 300;
		while (true) {
			int ret = proc(n);
			if (ret == -1) {
				System.out.printf("[%s] 종료. 데이터 남은 값: [%d]\n", Thread.currentThread().getName(), data.getN());
				break;
			}
			System.out.printf("[%s]=> 데이터로부터 [%d]가져옴.\n", Thread.currentThread().getName(), n);
		}
	}
	//메서드에 대해서도 동기화 메서드를 지정해줘도 됨- 동기화메서드 public 다음에 Synchronized
	public synchronized int proc(int n) { // 동기화 메서드
		int result = -1;
		if ((data.getN() - n) >= 0) {
			System.out.printf("현재 데이터 값: [%d]\n", data.getN());
			result = data.getN(n);
		}
		Thread.yield(); // 스레드 양보
		//if는 임계영역으로 한놈만 처리 가능하다. 교착상태가 생길 수 있으니 양보로 알려주기.
		return result;
	}

}