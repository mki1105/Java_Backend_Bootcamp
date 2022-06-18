package examjava6;
// do ~ while
public class While_03 {

	public static void main(String[] args) { 
		int n = 5;
		while(n >0) {
			System.out.println("n: " + n--);
		}
		do {
			System.out.println("n: " + n++);
		}while(n > 5);
		System.out.println("프로그램 종료");
		
	} 
}
	/*  while(조건식) {종석문장;}
	 *  do {종속문자;} while(조건식)
	 *  조건식이 거짓이라도 종속문장을  최소 1회는 동작
	 *  do 입력을 받고시작한다. 실행 먼저하고 조건을 봄다.
	 */