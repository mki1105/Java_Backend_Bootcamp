package Examjava7;
	import java.util.Random;
public class Examarray_06 {

	public static void main(String[] args) {
		Random ran = new Random(); // ������ü n���� 1�̸� �����̴�.
		for(int i = 0 ; i < 10 ; i++) {
	//	int n = ran.nextInt();
	//	n = Math.abs(n);
	//	n = n%100; // �������� 0~99
			
			int n = ran.nextInt(100);
			System.out.println(n);
		}

	}

}
