package examjava6;
	import java.util.Scanner;
public class While_exam_02 {
 /* �ϳ��� ���� �Է� �޾� n!�� ���϶�.(���丮��)
  * ��Ģ 1*2*3*4*5*6*...*n
  * ex: �Է� 4 ��� : 4!�� 24�̴�.
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("���� �Է��ض�");//�����Է�
			int num = sc.nextInt();
			// ��������
			int fac = num; // ���� fac���� ����
			int total =1; // ���ϴ� �ʱⰪ�� 1�̴ϱ�(���丮��)
			
			while(fac!=0) {
				total = total*fac; // total ���� fac���ڸ� ���ϸ鼭 ����
				fac--;	// �Է¹��� ���ڸ� 1�� ���ҽ�Ű��
			}
				
		System.out.println(num + "! = " + total); //����ϸ� �ݺ�
	}
	}
