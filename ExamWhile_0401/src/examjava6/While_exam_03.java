package examjava6;
	import java.util.Scanner;
public class While_exam_03 {
	//�Է¹��� ���� �Ųٷ� ����϶�. ex) �Է� :123 ��� :321
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		int num = sc.nextInt();
		// ��������
		// ���� �Է¹��� ���� 123
		int numN = 0; // �Ųٷ� ������ �����
		int x = 10; // �ڸ��� �����ִ� ��, ���������� ������ ���� ������ ��
		
		// �Է¹��� ������ ù��° �ڸ��� �־��ֱ� ���� ����������
		numN = num % x; // 123%10 �� �������� �ڸ����� �ֱ� : newN�� ������ 3
		num = num / x; //123/10���� ���� num�� �ֱ� : num�� ������ 12
		
		while(num > 0) {
			numN = numN * x + num % x; 
			num = num/10;
	}
		System.out.println("�Ųٷ� �Է��ϸ� "+ numN + "�Դϴ�.");
	}
/* �����
 * public static void main(String[] args) {
		String number; 
		System.out.print(" n = ");
		Scanner scan = new Scanner(System.in); number=scan.nextLine();
		
		int flag=number.length();   
		while(flag >= 0) {
			--flag;
			System.out.print(number.charAt(flag)+" ");
			if (flag == 0)
				break;
		}
 */
}
