package examjava1;
	import java.util.Scanner;
public class Exam04_0328 {
	public static void main(String[] args) {
		//�ڽ��� �̴ϼ��� �Է¹޾� ����ϴ� ���α׷�
		
		//����ڴԲ� �̴ϼ��� �Է��϶�� �ȳ���
		System.out.print("�ڽ��� �̴ϼ���?");
		//����ڷκ��� �̴ϼ��� �Է¹޾�
		Scanner in = new Scanner(System.in);
		//�Է¹��� �̴ϼ��� ������
		String init = in.nextLine();
		//������ �̴ϼ��� ����ڴԲ� �����
		System.out.println("�Է��� �̴ϼ���" + init + "�Դϴ�");
		
		
		System.out.print("ù ��° �̴ϼ� �Է� :");
		char init1 = in.nextLine().charAt(0);
		System.out.print("�� ��° �̴ϼ� �Է� :");
		char init2 = in.nextLine().charAt(0);
		System.out.print("�� ��° �̴ϼ� �Է� :");
		char init3 = in.nextLine().charAt(0);
		
		System.out.println(init1 + "." + init2 + "." + init3 );
	
		//3������ ������ �Է¹޾� �հ� ��� ���ϴ� ���α׷�
		//��������� ù ��° ������ ������ �Է��϶�� �ȳ���
		System.out.println("ù ��° ������ ���� :");
		int sub1 = in.nextInt();
		//��������� �� ��° ������ ������ �Է��϶�� �ȳ���
		System.out.println("�� ��° ������ ���� :");
		int sub2 = in.nextInt();
		//��������� �� ��° ������ ������ �Է��϶�� �ȳ���
		System.out.println("�� ��° ������ ���� :");
		int sub3 = in.nextInt();
		
		// sum, total , average(avg)
					
		//�հ踦 ����
		float total1 = sub1 + sub2 + sub3;
		//����� ����
		float avg = total1 / 3;    //��������� �տ� (float �־ �ȴ�), 3.0f �Ǵ� F�� �־ �ȴ�.
		//�հ�� ����� ��������� �˷���	
		System.out.println("���� :" + total1 + "��");
		System.out.println("��� :" + avg + "��");
		
		
		// �̸� + ���� �Է¹޾� ����ϱ�
		System.out.println("����� �̸��� �����Դϱ�?");
		String name = in.nextLine();
		System.out.println(name + "���� ���̴� �� �� �Դϱ�?");
		int age = in.nextInt();
		System.out.println(name + "���� ���̴�" + age + "���Դϴ�.");
		
				
		// ���� ��� %s, %c, %d, %f Ȱ��
		System.out.printf("%s���� ���̴� �� �� �Դϱ�?", name);
		System.out.println();
		System.out.printf("%s���� ���̴� %d�� �Դϴ�.\n", name, age);

	
	}

}
