package Examjava7;
	import java.util.Random;
	import java.util.Scanner;
public class examarray_0801 {

	public static void main(String[] args) {
		/* 셔플기법
		 * 1. 45개의 요소를 가진 배열 생성
		 * 2. 1번에서 생성한 배열에 1~45를 저장
		 * 3. 랜덤 값 2개를 구함 (0~44)
		 * 4. 3번에서 구한 값을 배열의 값을 스왑
		 * 5. 4번을 n번 반복
		 * 6. 배열에서 6개의 값을 출력
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[45]; // 1. 45개 배열 생성
		
			for(int i = 0; i < 45 ; i ++) {
				num[i] = i+1; // 2.생성한 num 배열에 45개 저장, i는 배열 자리
				// +1 말고 다른 방법이 있는가?
			}	
				// 5. 4번을 n번 반복하자  for문 사용하기, n으로 입력받기
				System.out.println("몇 번 반복할 것인가?  ");
				int n = sc.nextInt(); //몇번을 입력받기 위해
				for (int i = 0; i < n ; i++) {
					
					// 3. 랜덤값 2개 구해라 (0~44)
					int arr1 = ran.nextInt(45); // 랜덤 1개 45개 중 랜덤 값
					int arr2 = ran.nextInt(45); // 랜덤 2개
					
					// 4. 구한 값을 배열의 값을 스왑 tmp 사용하기
					int tmp = num[arr1]; //arr1을 tmp에 저장
					num[arr1] = num[arr2]; //arr2를 arr1에 저장
					num[arr2] = tmp; // tmp에 값을 arr2에 저장	
								
			}	for(int i = 0; i < 6; i++) {
				 System.out.println("[" + num[i] + "]"); //i는 6자리를 출려한 num으로 출력하기
		}
		
	}

}
