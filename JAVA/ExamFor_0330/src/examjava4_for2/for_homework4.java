package examjava4_for2;

public class for_homework4 {
	/* 1 부터 시작하여 홀수의 합을 구하면서 그 합이  10000을
	 * 넘지 않는 마지막수를 구하는 프로그램을 작성하여라.
	 */
	public static void main(String[] args) {
	// 변수 설정
		int i,sum =0;
		
		for(i=1;sum<10000;i++) {
			if(i%2==1) { //홀수값 더해주기 위한 식
				sum +=i;
			}
	}
		System.out.println("결과값은? " + i);
	}

}
