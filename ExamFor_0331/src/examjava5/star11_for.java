package examjava5;

public class star11_for {

	public static void main(String[] args) {
		for(int i=1; i<6 ; i++) {
			// 공백자리
			for(int j = 0; j < 5-i ; j++) {
				System.out.print(" ");
			}
			// 별자리
			 for(int k =0; k < i ; k++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
}