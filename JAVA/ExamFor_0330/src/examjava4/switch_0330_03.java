package examjava4;
	import java.util.Scanner;

public class switch_0330_03 {

	public static void main(String[] args) {
		// ���� �ΰ��� �Է¹޾� ��Ģ������ �ϴ� ���� �����
		Scanner key = new Scanner(System.in);
		System.out.println("�����ڸ� �Է��Ͻÿ�.");
		String n = key.nextLine(); // �ѱ��� �������°ɷ� ���, nextLine�� ������� ����
		/* char oper = in.nextLine().charAt(0); char�� ����, ���ڸ� ǥ���� �� ���
		 * "" �� String ���ڿ�, ���ڿ��� ���̸� ��.
	 	 * in.nextLine(); ���� �о����
		 */ 
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�.");
		int a = key.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�.");
		int b = key.nextInt(); //int ret =0;
		
		switch (n) {
		case "+": //
			System.out.println("�����? " + (a+b));break;
		case "-":
			System.out.println("�����? " + (a-b));break;
		case "*":
			System.out.println("�����? " + (a*b));break;
		case "/":
			System.out.println("�����? " + (a/b));break;
		default :System.out.println("�����ڰ� �ƴմϴ�.");
		}
	}

}
