package MyThread7;

//별도의 스레드로 동작할 객체를 클래스로 정의
public class MyThread implements Runnable{
	
	private Data data;
	
	public MyThread(Data data) {
		this.data = data;
	}
	
	//스레드의 main과 같은 역할
	@Override
	public void run() {
		int n = 300;
		while(true) {
			int ret = proc(n);
			if(ret == -1) {
				System.out.printf("[%s] 종료. 데이터 남은 값: [%d]\n",
						Thread.currentThread().getName(), data.getN());
				break;
			}
			System.out.printf("[%s]=> 데이터로부터 [%d]가져옴.\n", 
					Thread.currentThread().getName(), n);
		}
	}
	
	public int proc(int n) {
		int result = -1;
		synchronized(MyThread.class) {	//동기화 블록
			if((data.getN() - n) >= 0) {
				System.out.printf("현재 데이터 값: [%d]\n", data.getN());
				result = data.getN(n);
			}
			Thread.yield(); //스레드 양보
		}
		return result;
	}

}



