package examjava6;
	 import java.util.Scanner;
	 
public class While_exam_1a {
  //����, ����, ���� ���� ������ �Է¹޾� ����, ��� , ������ ����ϼ���.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// scanner ����
		// ���� ����
		int count = 3;
		int sum = 0;
		float avg; int score; char grade;
		
		System.out.println("����, ����, ���� ������ ������� �Է��ϼ���.");
		// while�� ���� ���� �Է� ����
		while (count > 0) {
			System.out.print("����: ");
			score = sc.nextInt();
			// �Է¹��� ������ ���� ������ �ƴ� ���
			if (score < 0 || score > 100) {
				System.out.println(score + "���� �������� ������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
			} else {
				sum += score;
				count--;
			}
		}
		
		// ��� ���ϱ�
		avg = sum / 3f;
		
		// switch ���ǹ����� ������ �����ؼ� int�� ����ȯ
		switch ((int) avg / 10) {
		case 10:
		case 9: grade = 'A';
		case 8: grade = 'B';
		case 7: grade = 'C';
		case 6: grade = 'D';
		default: grade = 'F';
		}
		
		System.out.printf("����: %d��, ���: %.2f��, ���� = %s\n", sum, avg, grade);
	}
}