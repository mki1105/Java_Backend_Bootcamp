package Examjava7;
	import java.util.Random;
public class examarray_0901 {

	public static void main(String[] args) {
		/* flag 기법 활용
		 * 1. 45개의 boolean배열 생성(flag용도)
		 * 2. 6칸 짜리 배열 생성(결과 값을 저장할 배열)
		 * 3. 랜덤 값을 추출(0~44)
		 * 4. 3번에서 추출한 값을 index로 flag배열에서 확인
		 * 	- flag가 false이면 true로 변경하고
		 * 		6칸짜리 배열에 값 저장
		 * 	- flag가 true이면 다시 3번으로 ??
		 * 	- 6칸짜리 배열에 모든 값이 저장되면 5번으로 ??
		 * 5. 6칸 짜리 결과 배열 값 출력
		 */
		Random ran = new Random(); //괄호 까먹지 말기
		//1. 45개 불린 배열 생성
		boolean[] flag = new boolean[45]; //괄호 헷갈리지 말기 [] 양쪽 다 넣어야 함.
		
		//2. 6칸 짜리 배열 생성, 결과 값 저장할 곳
		int[] result = new int[6];
		//저장하려면 for문 i가 6번 돌아간다.
		for (int i=0; i < 6 ; i++) {
			//3. 랜덤 값 추출 하자(0~44)
			int num = ran.nextInt(45); //랜덤 값 1개 (괄호 안에 몇개중 추출할지 꼭 쓰기)
			
			//4. 추출한 값을 index로 flag배열에서 확인 if 조건문으로
			if(flag[num] == false) { // false로 설정
				flag[num] = true; // true로 변경해서 저장하고
				num++; // 0의 값이 나올 수 있으므로 1씩 증가시켜주기, 증가시킨 후 배열에 저장
				result[i] = num; // 6칸짜리 배열에 값 저장
			}
			else
				i--; //i는 증감되오니 감소시켜주기 그래야 중복이 나왔을 때 다시 올라가서 랜덤값 추출함
		}	
		 	// 5. 6칸 짜리 결과 배열 값 출력
			for(int i = 0; i < 6 ; i++ ) {
				System.out.print("[" + result[i] + "] ");
			}
	}	
}
