package examjava4_for;
 import java.util.Scanner;
public class for_06 {
	//�μ��� �Է¹޾� �� �� ������ ���� ���ϼ���
	//�ʱⰪ, ���ǽ�, ������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = 0;
		int b =0;
		int sum =0;
		
		System.out.println("ù ��° ���� �Է��Ͻÿ�.");
		a = sc.nextInt(); //���ۼ���
		System.out.println("�� ��° ���� �Է��Ͻÿ�.");
		b = sc.nextInt(); //������ ����
		
			for(int i =1; i <= b; i++) { 
				sum += i;
	}
			System.out.printf("%d~%d�� �� ���� %d�Դϴ�.", a,b,sum);
	}

}
