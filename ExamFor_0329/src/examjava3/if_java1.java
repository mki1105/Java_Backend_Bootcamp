package examjava3;

	import java.util.Scanner;

public class if_java1 {
		/* ���������� ���� �¿��ִµ� ó�� 30���� �⺻����� 1�δ� 3000���̴�.
		 * ���Ŀ��� 10�д� 500���� �߰� ����� �޴´�. ���� ź �ð��� �Է¹޾Ƽ�
		 * ��ü �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͽ���.
		 */
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); //�Է��� �ʿ��ϴϱ� �־�� �Ѵ�.
		// 1.���� ź �ð��� �Է��϶�°� ����ض�
		System.out.println("���� ź �ð���?");
		// 2.���� �������ֱ�, �ʿ��� ������ �̸� ������ ����� ����(�̸� �������, �򰥸����� �ʰ�)
		int pay = 3000;//�⺻���
		int time = key.nextInt(); //��¹޴� �κ� �ۼ��ϱ�  int �Է¹��� �� nextInt �޼�����
		// useTime = 0;(�̿�ð��� ��), intusePrice =0;(�̿�ݾ� ��)
		// 3. ���ǹ� �ۼ��ϱ�
		if(time <= 30) { //30�� ���Ͻð��̸� 3000���� ����ض�.
			pay = 3000;
			System.out.printf("�ݾ��� %,d�� �Դϴ�.", pay);
		} else  // 4. ���� 10�д� 500���� �߰��� ����ض�, ��¹��̶� ���� �ۼ� ����
			pay = 3000 + ((time-30)/10) * 500;
			System.out.printf("�ݾ��� %,d�� �Դϴ�.", pay);
			
		key.close();
		
	}
}
