package examjava2;

import java.util.Scanner;
public class examjava2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//3������ �հ�� ����� �Է��ϰ� ���
				System.out.println("ù ��° ���� ����:");
				double sub1 = in.nextDouble();
				System.out.println("�� ��° ���� ����:");
				double sub2 = in.nextDouble();
				System.out.println("�� ��° ���� ����:");
				double sub3 = in.nextDouble();
		
				double sum = sub1 + sub2 + sub3;
				double avg = sum/3;
				System.out.println("�հ� :" + sum + "��");
				System.out.println("��� :" + avg + "��");

	}

}
