package Examjava7;
	import java.util.Random;
	import java.util.Scanner;
public class examarray_0801 {

	public static void main(String[] args) {
		/* ���ñ��
		 * 1. 45���� ��Ҹ� ���� �迭 ����
		 * 2. 1������ ������ �迭�� 1~45�� ����
		 * 3. ���� �� 2���� ���� (0~44)
		 * 4. 3������ ���� ���� �迭�� ���� ����
		 * 5. 4���� n�� �ݺ�
		 * 6. �迭���� 6���� ���� ���
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[45]; // 1. 45�� �迭 ����
		
			for(int i = 0; i < 45 ; i ++) {
				num[i] = i+1; // 2.������ num �迭�� 45�� ����, i�� �迭 �ڸ�
				// +1 ���� �ٸ� ����� �ִ°�?
			}	
				// 5. 4���� n�� �ݺ�����  for�� ����ϱ�, n���� �Է¹ޱ�
				System.out.println("�� �� �ݺ��� ���ΰ�?  ");
				int n = sc.nextInt(); //����� �Է¹ޱ� ����
				for (int i = 0; i < n ; i++) {
					
					// 3. ������ 2�� ���ض� (0~44)
					int arr1 = ran.nextInt(45); // ���� 1�� 45�� �� ���� ��
					int arr2 = ran.nextInt(45); // ���� 2��
					
					// 4. ���� ���� �迭�� ���� ���� tmp ����ϱ�
					int tmp = num[arr1]; //arr1�� tmp�� ����
					num[arr1] = num[arr2]; //arr2�� arr1�� ����
					num[arr2] = tmp; // tmp�� ���� arr2�� ����	
								
			}	for(int i = 0; i < 6; i++) {
				 System.out.println("[" + num[i] + "]"); //i�� 6�ڸ��� ����� num���� ����ϱ�
		}
		
	}

}
