package Examjava7;
 	import java.util.Random;
 	import java.util.Scanner;
public class Examarray_08 {

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
		
		int[] num = new int[45]; // 1��. 45�� ���� �迭 ������
		
		for(int i = 0; i < 45; i++) { //2��. �迭�� 1~45 ������
			num[i] = ran.nextInt(45)+1; //�� + 1�� �ϴ°�?
	}		// num[i] = i+1; �� �ۼ��ص� ��.
		
			// 5��. 4���� n�� �ݺ�
			System.out.println("�� ȸ �ݺ��Ͻðڽ��ϱ�? ");
			int n = sc.nextInt(); // nȸ �Է¹ޱ� ����
			for(int i = 0; i < n; i++) { // ���� �� 2���� �ݺ��ϱ� ���� for
			
				// 3��. ���� �� 2�� ���ϱ�(0~44)
				int arr1 = ran.nextInt(45); // arr1 ���� 45�� �Է¹ޱ�
				int arr2 = ran.nextInt(45);	// arr2 ���� 45�� �Է¹ޱ�
				// �� ������ ������ �̴°�?*?*?
			
				// 4��. 3������ ���� ���� �迭�� ������ ����
				int tmp = num[arr1];
				num[arr1] = num[arr2];
				num[arr2] = tmp;		
	}	
			// 6��. �迭���� 6���� ���� ���
			for(int i=0; i < 6; i++) {
				System.out.print("[" + num[i]+ "] "); // i�� 45���� �ϳ�
			}
			
		} 
	}

