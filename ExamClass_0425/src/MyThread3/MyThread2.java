package MyThread3;

//별도의 스레드로 동작할 객체를 클래스로 정의
public class MyThread2 implements Runnable{
	//스레드의 main과 같은 역할
	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

}
