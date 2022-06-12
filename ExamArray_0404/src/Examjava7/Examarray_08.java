package Examjava7;
 	import java.util.Random;
 	import java.util.Scanner;
public class Examarray_08 {

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
		
		int[] num = new int[45]; // 1번. 45개 가진 배열 생성해
		
		for(int i = 0; i < 45; i++) { //2번. 배열에 1~45 저장해
			num[i] = ran.nextInt(45)+1; //왜 + 1을 하는가?
	}		// num[i] = i+1; 로 작성해도 됨.
		
			// 5번. 4번을 n번 반복
			System.out.println("몇 회 반복하시겠습니까? ");
			int n = sc.nextInt(); // n회 입력받기 위해
			for(int i = 0; i < n; i++) { // 랜덤 값 2개를 반복하기 위해 for
			
				// 3번. 랜덤 값 2개 구하기(0~44)
				int arr1 = ran.nextInt(45); // arr1 랜덤 45개 입력받기
				int arr2 = ran.nextInt(45);	// arr2 랜덤 45개 입력받기
				// 왜 저렇게 랜덤을 뽑는가?*?*?
			
				// 4번. 3번에서 구한 값을 배열의 값으로 스왑
				int tmp = num[arr1];
				num[arr1] = num[arr2];
				num[arr2] = tmp;		
	}	
			// 6번. 배열에서 6개의 값을 출력
			for(int i=0; i < 6; i++) {
				System.out.print("[" + num[i]+ "] "); // i는 45개중 하나
			}
			
		} 
	}

