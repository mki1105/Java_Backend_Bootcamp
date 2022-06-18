package examjava4_for;

public class for_03 {
	// 1부터 100까지의 홀수의 합과 짝수의 합을 구하세요.
	public static void main(String[] args) {
		int a =0; //홀수 합
		int b =0; //짝수 합
			
		for(int i=1; i<100;i++){
			a += i++;
		}			
		System.out.println("1부터 100까지의 홀수의 합은?\n" + a);
			for(int i=0; i<100; i++){
			b += i++;
		}
		System.out.println("1부터 100까지의 짝수의 합은?\n" + b);
	}
}