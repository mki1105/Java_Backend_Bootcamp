package examjava6;
	 import java.util.Scanner;
	 
public class While_exam_01 {
  //����, ����, ���� ���� ������ �Է¹޾� ����, ��� , ������ ����ϼ���.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float sum, avg =0;
		int kor =0;
		int eng =0;
		int math =0;
		
		while(true) {
			System.out.println("���������� �����Դϱ�?");
			kor = sc.nextInt();
			System.out.println("���������� �����Դϱ�?");
			eng =sc.nextInt();
			System.out.println("���������� �����Դϱ�?");
			math =sc.nextInt();
	
			sum = kor + math + eng;
			avg =(kor + math + eng)/3;
			System.out.println("�� ������ �����հ��? " + sum + "��");
			System.out.println("�� ������ ���������? " + avg + "��");
		
		 	if(avg > 90) {
		 		System.out.println("A");
		 		break;
		 	} else if(avg <= 89.9 && avg >= 80 ) {
		 		System.out.println("B");
		 		break;
		 	} else if(avg <= 79.9 && avg >= 70 ) {
		 		System.out.println("C");
		 		break;
		 	} else if(avg <=69.9 && avg >=60 ) {
		 		System.out.println("D");
		 		break;
		 	} else if(avg <= 59.9 && avg >=0) {
		 		System.out.println("F");
		 		break;
		 		
		 	}
		 	System.out.println("");
	}
	}
}
