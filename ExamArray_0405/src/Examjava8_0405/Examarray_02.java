package Examjava8_0405;
import java.util.Random;//2번 풀이, 생각을 코드로 작성하는 연습을 하자!! 
public class Examarray_02 {

	public static void main(String[] args) {
		//flag 기법 활용
		//1. 45개의 boolean배열 생성(flag용도)
		boolean[] flag = new boolean[46]; // 1~45를 사용,나중에 1 추가 안하기 위해서 0칸은 버리고 index를 1번부터 46까지 사용할 것임.
		
		// 2. 6칸 짜리 배열 생성(결과 값을 저장할 배열)
		int[] lotto = new int[6];
		int index = 0; //
		// 3. 랜덤 값을 추출(1~45)
		int n = ran.nextInt(45) + 1 ;
		
		//어떤 것이 선택됐는지 출력
		System.out.println("n: " + n);
			if(!flag[n] ==false) {
				!flag[n] == true;
		}
		/*n번째 가서 false 라면 안나왔떤 숫자니까 로또 변수에 인덱스 위치에 n값을 저장하고
		 * 해당하는 숫자를 트루로 변경을 해야 한다.
		 * 그게 아니라면 else 꼭 안써도 된다.
		*/
		
		
		//flag가 true면 다시 3번으로 라는 것은 while을 사용해서 반복 시켜라
		
		// 4. 3번에서 추출한 값을 index로 flag배열에서 확인
		// 	- flag가 false이면 true로 변경하고
		// 		6칸짜리 배열에 값 저장
		// 	- 6칸짜리 배열에 모든 값이 저장되면 5번으로 ??
		//
		
		
		// 5. 6칸 짜리 결과 배열 값 출력
		
		

	}

}
