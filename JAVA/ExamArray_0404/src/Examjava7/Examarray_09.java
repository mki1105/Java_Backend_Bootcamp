package Examjava7;
	import java.util.Random;
public class Examarray_09 {
	public static void main(String[] args) {
		/* flag ��� Ȱ��
		 * 1. 45���� boolean�迭 ����(flag�뵵)
		 * 2. 6ĭ ¥�� �迭 ����(��� ���� ������ �迭)
		 * 3. ���� ���� ����(0~44)
		 * 4. 3������ ������ ���� index�� flag�迭���� Ȯ��
		 * 	- flag�� false�̸� true�� �����ϰ�
		 * 		6ĭ¥�� �迭�� �� ����
		 * 	- flag�� true�̸� �ٽ� 3������ ??
		 * 	- 6ĭ¥�� �迭�� ��� ���� ����Ǹ� 5������ ??
		 * 5. 6ĭ ¥�� ��� �迭 �� ���
		 */
		Random ran = new Random();
		//1��. 45�� boolean �迭 ����
		boolean[] flag = new boolean[45]; //�Ҹ� �迭 ���� ������ false ��
		//2��. 6ĭ �迭 ����(��� ��)
		int[] result = new int[6];
			// i�� 6�� ���ư���.
			for(int i =0; i < result.length; i++) { 
			//3��. ���� ���� ����(0~44)
			int num = ran.nextInt(45); //num�� ���� ��(����)

			/* �ߺ��� üũ���ִ� ���ǹ���. ó���� ������ boolean�̴ϱ�
			 * true�� ������ ���� �� 0�� ������ �ʰ� ���� ���ڸ� ���������ش�.
			 * true�� ���� 6ĭ ¥���� ������� �����Ų��. 
			 */
			//4��. 3������ ������ ���� index�� flag�迭���� Ȯ��	
		if (flag[num] == false) { //flag�� false �̸�
			flag[num] = true;
			num++;// true�� �����ϰ�(����)
			result[i] =	num; // ����� 6ĭ ¥�� �迭�� ���� �� ����?
		}
		else {
			i--;		
		}
		
	}
		//5��. 6ĭ ¥�� �迭 �� ���
		for(int i=0; i < 6; i++) {
			System.out.print("[" + result[i] + "] "); 
		} 		
	 }
}	


