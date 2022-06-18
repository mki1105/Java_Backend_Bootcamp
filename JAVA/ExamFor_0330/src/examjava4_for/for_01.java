package examjava4_for;

public class for_01 {
	/* 변수를 바로 선언해서 초기값에 넣어도 되고, 따로 설정해도 된다.
	 * 횟수를 반복해서 실행하고 싶을 때 쓰는게 for문, 상태는 while문
	 * i 변수는 : loop변수
	 * ;;콜론으로 구분하기 초기값,조건식, 증감식임. 값이 비어도 됨(;;만 작성해준다면)
	 * for(;;) //while(true) 동일함(무한반복)
	 */

	public static void main(String[] args) {
		for (int i=0; i<10; i++) { // 혼자 놀기 때문에 후치, 전치 상관없음, 다른 연산이 있어야 달라짐
		System.out.println(i); 
	}
		
}
}