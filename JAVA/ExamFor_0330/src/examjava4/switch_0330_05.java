package examjava4;

import java.util.Scanner;

public class switch_0330_05 {

	public static void main(String[] args) {
		// �޴��� ����� �������α׷� �����
		/* 1. �л��̸����
		 * 2. ����, ����, ���� ���� �Է�
		 * 3. �л��̸� ���
		 * 4. ���� ���
		 * 5. ��� ���
		 * 6. ����
		 */
		Scanner sc = new Scanner(System.in);
		//�ʿ��� ������ ���ϱ�
		int menu = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		float total = 0, avg = 0;
		String name = ""; // ���ڿ��� �� �ۼ����ֱ�
		
		System.out.println("1. �л��̸����");
		System.out.println("2. ����, ����, ���� ���� :");
		System.out.println("3. �л��̸����");
		System.out.println("4. ����");
		System.out.println("5. ���");
		System.out.println("6. ���α׷� ����");
		System.out.println("�޴��� �����϶� :");
		menu = sc.nextInt();
	
		switch(menu) {
		case 1:
			System.out.println("�л��̸���� :");
			name =sc.nextLine();
			System.out.println("�л� " + name + "�� ��ϵǾ����ϴ�.");
			break;
		case 2:
			System.out.println("���������� �Է��Ͻÿ�.");
			kor=sc.nextInt();
			System.out.println("���������� �Է��Ͻÿ�.");
			eng=sc.nextInt();
			System.out.println("���������� �Է��Ͻÿ�.");
			math=sc.nextInt();
			System.out.println("���������� " + kor + ", ����������" + eng + ", ���������� "+ math + "�Դϴ�.");
			break;
		case 3:
			System.out.println("�л��̸� ���");
			name = sc.next();
			System.out.println("��ϵ� �̸� :" + name);
			break;
		case 4:
			System.out.println("���� ����:");
			total = kor + math + eng;
			System.out.println("���� :" + total + "��");
			break;
		case 5:
			System.out.println("�������:");
			avg = total/3;
			System.out.println("��� :" + avg + "��");
			break;
		case 6:
			System.out.println("���α׷� ����");
			System.exit(0); //���α׷��� �����ϴ� �޼���
			break;
		}
		System.out.println("�ý����� �����մϴ�.");
		
	}

}
