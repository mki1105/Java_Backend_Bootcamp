package examjava6;
import java.util.Scanner;
public class While_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		while(true) {
			System.out.print("수 입력(0~100):");
			n = in.nextInt();
			if(!(n < 0 || n > 100)) {
				break;
			}
		}
		System.out.println("값:" + n);

		System.out.println("-------------");

		int m = 0;
		do{
			System.out.print("수 입력(0~100):");
			n = in.nextInt();
		}while(n < 0 || n > 100);
		
		System.out.println("값:" + n);
	}

}
