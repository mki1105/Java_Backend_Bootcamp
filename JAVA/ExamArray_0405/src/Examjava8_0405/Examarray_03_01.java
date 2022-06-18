package Examjava8_0405;
	import java.util.Random;
public class Examarray_03_01 {
	// 선택정렬 알고리즘 이해, 오름차순으로 정렬하기
	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto = new int[6];
		int tmp;
		for(int i=0; i < lotto.length-1; i++) {
			lotto[i] = ran.nextInt(46); //랜덤으로 입력받기
			for(int j = i+1 ; j < lotto.length; j++) { //j보다 뭐가 커야 할까?
				if(lotto[i] > lotto[j]){
					break;
				}
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
			}// 괄호 체크 중요	
			
		}
			System.out.println("로또 자동번호 : ");
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i]+",");
		}
	}
}