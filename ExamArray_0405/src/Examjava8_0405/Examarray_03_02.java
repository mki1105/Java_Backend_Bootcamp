package Examjava8_0405;
	import java.util.Random;
public class Examarray_03_02 {

	public static void main(String[] args) {
		// 퀴즈 2를 버블정렬해라.
		Random ran = new Random();
		int[] lotto = new int[6]; // 6자리 배열 자리 선언해
		
		for(int i =0; i <6 ; i++) { // 6대신 lotto.length; 작성해도 됨
			lotto[i] = ran.nextInt(45)+1; // 로또 번호 6개 랜덤 출력해
			for(int j =0; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;		
				}			
			}
		}
		// 버블 정렬 // i는 비교대상1 j는 비교대상2
		for(int i=0; i<lotto.length-1 ; i++) { //왜 1을 빼는가?
			for(int j =0; j<lotto.length-1; j++) {
				if(lotto[j] > lotto[j+1]) { //왜 1을 더하는지? 왜 j인지? j가 0일때  j는 1의 자리일 때 비교?
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;	
				}
			}
				
		}
		System.out.println("로또 자동번호 : ");
		for(int i = 0; i<lotto.length;i++) {
			System.out.println("[" + lotto[i] + "]");
		}
	}

}
