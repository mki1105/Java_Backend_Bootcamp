package examjava3;
	import java.util.Scanner;
public class if_java4 {
  /*
   * 
   */
	public static void main(String[] args) {
		// ������ ���� �Է¹޾�
		Scanner scan = new Scanner(System.in);		
		System.out.println("���������� ?");
		int kor = scan.nextInt();
		System.out.println("����������?" );
		int math = scan.nextInt();
		System.out.println("����������?");
		int eng = scan.nextInt();
		// ���� �հ�� ��� ����
		int sum = kor + math + eng;
		double avg = (kor + math + eng)/3;
		System.out.println("�� ������ �����հ��" + sum);
		System.out.println("�� ������ ���������" + avg);
		//����� 90�� �̻��̸� a, 80�̻��̸� b... if ���� �����
			if (avg >= 90) {
				System.out.println("A");
		}		else if (avg >= 80) {
				System.out.println("B");
		}		else if (avg >= 70) {
				System.out.println("C");
		}		else if (avg >= 60) {
				System.out.println("D");
		}		else if (avg < 60) 	{
				System.out.println("F");
		}
		
	}

}
