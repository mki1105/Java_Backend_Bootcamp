package examjava3;
	import java.util.Scanner;	
public class if_0329_5 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ū ���� ¦���̸� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("���� 2�� �Է��Ͻÿ�.");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a>b && a%2==0) {
			System.out.println(a + "�� ¦�� �Դϴ�");
		} else if(a>b && a%2==1) {
			System.out.println(a + "�� Ȧ�� �Դϴ�");
		} else if(b>a && b%2==0) {
			System.out.println(b + "�� ¦�� �Դϴ�");
		} else if(b>a && b%2==1) {
			System.out.println(b + "�� Ȧ�� �Դϴ�");
		}	
		

	}

}
