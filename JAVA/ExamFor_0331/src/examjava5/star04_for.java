package examjava5;

public class star04_for {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) { //i를 5번 반복하라 줄반복
			for(int j=0; j<5 ;j++) { // 숫자반복내부 for문이 동작하는 도중에는 밖의 i 변수에는 변경이 되지 않는다.
			System.out.print(i+1); 
		}
			System.out.println();
		}
		
		System.out.println();
		
		int start = 1; //변수 따로 설정해줘도 된다.
		for(int i=0; i<5; i++) {
			for(int j=0 ; j<5 ; j++) {
			System.out.print(start);
		}
			start++;
			System.out.println();
	}
		
		
		
}
}
