package examjava3;
	import java.util.Scanner;	
public class if_0329_6 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���� ¦���̰� 3�� ����� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("�� ���ڸ� �Է��Ͻÿ�");
		a = scan.nextInt();
		b = scan.nextInt();
		int sum = a+b;
		
		if (sum%2==0 && sum%3==0) {
			System.out.println(sum);
	}
	}

}
