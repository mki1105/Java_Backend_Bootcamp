package examjava4_for;

import java.util.Scanner;

public class for_07 {
	//����ڷκ��� �� ���� ������ �Է¹޾� ����� ���ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0; //�Է��ϴ� ������
		int sum =0; // ���� ����
		float avg =0; //���� ���
		
		System.out.println("������ ������ �Է��Ͻÿ�.");
		
		for(int i =1; i<=10; i++) {//i�� ������ ���� 10���̶�� ��Ī
			System.out.printf("%d��° ������ ?",i);//������ �ݺ��ؼ� �Է�
			a = sc.nextInt();
			sum += a+i;
	}
		avg = sum/10;
		System.out.println("�����? " + avg);

	}

}
