package examjava4;

import java.util.Scanner;

public class switch_0330_04 {

	public static void main(String[] args) {
		// ����ǥ ����� //�Է¹��� ��
		Scanner key = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int score = 0;
		score = key.nextInt();
		String grade = ""; //string�� �����д�.
		
		switch(score/5) {
		case 20: // case �ڿ��� ���̶�� ��������.
			grade ="A+";break;
		case 19:
			grade ="A";break;	
		case 18:
			grade ="B+";break;
		case 17:
			grade ="B";break;
		case 16:
			grade ="C+";break;
		case 15:
			grade ="C";break;
		case 14:
			grade ="D+";break;
		case 13:
			grade ="D";break;
		case 12:
			grade ="E";break;
		case 11:
			grade ="F";break;
	
		}	
		System.out.printf("%d���� %s����Դϴ�.", score, grade);
	}

}
