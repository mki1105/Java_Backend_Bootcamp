package MyThread6;

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
		}
	}
/* 1. data에 n을 가져와
 * 2. 가져온 값에서 n을 빼
 * 3. 결과가 0이상이면(if)
 * 
 * 동시에 한 곳에 접근을 할 때(하나의 자원에)
 * cpu는 명령을 왔다갔다 하면서 실행한
 * 조건 안에서도 하나하나 다 따로 실행을 하게 됨.
 * A, B의 명령들을 순서 상관없이 실행시킴.
 * A에서 1~2까지만 실행하고 B로 넘어가면 
 */
	//메서드에 대해서도 동기화 메서드를 지정해줘도 됨- 동기화메서드 public 다음에 Synchronized
	public int proc(int n) {
		int result = -1;
		//Synchronized(MyThread.class)동기화 블록으로 동기화할 지역을 정해줘야 함.
		if ((data.getN() - n) >= 0) {
			System.out.printf("현재 데이터 값: [%d]\n", data.getN());
			result = data.getN(n);
			System.out.printf("[%s]=> 데이터로부터 [%d]가져옴.\n", Thread.currentThread().getName(), n);
		}
		//Thread.yield(); 스레드 양보
		//if는 임계영역으로 한놈만 처리 가능하다. 교착상태가 생길 수 있으니 양보로 알려주기.
		return result;
	}

}