package examjava5;

public class star06_for {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) { //세로줄로 5번반복 세로로 12345 출력
			for(int j=1;j<=5;j++) { //가로줄 5번반복 가로로 12345 출력
				System.out.print(i+j);
			}
			System.out.println();	
		}
	}
}