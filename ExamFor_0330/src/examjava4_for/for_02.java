package examjava4_for;

public class for_02 {
	//1부터 100까지의 합을 구하세요. //5050이 정답
	public static void main(String[] args) {
		/* 1~100의 변하는 하나의 값이 필요하니까 변수도 하나가 필요하다.
		 * 변수 count 1개, 합이 들어갈 수 있는 sum 1개
		 * 추가로 시작start, 끝end로 변수 설정해줘도 된다.
		 * 
		 * if(count <=end)
		 * 		sum += count;
		 * count++; OR
		 * 
		 * 
		 * 
		 */
		int sum = 0;
		for (int i=1; i<= 100; i++) {
			sum += i+1;
		}
		System.out.println("1부터 100까지의 합은 :" + sum + "이다.");
	}

}
