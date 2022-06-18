package Examjava7;
	import java.util.Random;
public class Examarray_07 {

	public static void main(String[] args) {
		// 로또 프로그램 만들기, 중복 숫자 없이
		//1. 로또 예상번호를 저장할 배열 선언
		//2. 1~45값을 뽑아 로또 배열에 저장
		//~ 저장한 값 이전에 뽑은 값 중에 중복값이 있는지 확인해야 함.
		// 중복값이 있으면 다시 뽑도록 해라
		// 중복값이 없으면 다음 번호를 뽑아라
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
		System.out.print("로또 자동 번호: ");
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ ",");
		}
		
		}
	}
/* 로또의 i번째를 저장한다. % 45를 했을 경우 44까지만 출력되므로 +1을 해줘야 한다.
 * 첫번째 랜덤값 출력하면 반복해서 앞의 숫자와 중복이 되는게 있는지 없는지 j 변수로 조건문 작성해주기
 * 자리마다 앞의 자리와 중복된게 있는지 비교를 해봐야 하기 때문에 i보다 작은 값으로 비교를 한다.
 * i와 j의 값이 같을 때 i값을 감소시켜라. 반복 후 위 i로 올라가 증감을 하기 때문에
 * 
 */

