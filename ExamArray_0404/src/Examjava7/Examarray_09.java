package Examjava7;
	import java.util.Random;
public class Examarray_09 {
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
		Random ran = new Random();
		//1번. 45개 boolean 배열 생성
		boolean[] flag = new boolean[45]; //불린 배열 생성 무조건 false 다
		//2번. 6칸 배열 생성(결과 값)
		int[] result = new int[6];
			// i가 6번 돌아간다.
			for(int i =0; i < result.length; i++) { 
			//3번. 랜덤 값을 추출(0~44)
			int num = ran.nextInt(45); //num이 랜덤 값(난수)

			/* 중복을 체크해주는 조건문임. 처음은 무조건 boolean이니까
			 * true로 변경을 해준 후 0이 나오지 않게 랜덤 숫자를 증가시켜준다.
			 * true인 값을 6칸 짜리에 결과값을 저장시킨다. 
			 */
			//4번. 3번에서 추출한 값을 index로 flag배열에서 확인	
		if (flag[num] == false) { //flag가 false 이면
			flag[num] = true;
			num++;// true로 변경하고(대입)
			result[i] =	num; // 결과값 6칸 짜리 배열에 랜덤 값 저장?
		}
		else {
			i--;		
		}
		
	}
		//5번. 6칸 짜리 배열 값 출력
		for(int i=0; i < 6; i++) {
			System.out.print("[" + result[i] + "] "); 
		} 		
	 }
}	


