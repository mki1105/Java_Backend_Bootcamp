package MyThread;

public class Exam01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%2d ", i);
			if(i != 0 && i%10 == 0)
				System.out.println();
		}
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}