package Examjava7;
	import java.util.Random;
public class examarray_0901 {

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
		Random ran = new Random(); //��ȣ ����� ����
		//1. 45�� �Ҹ� �迭 ����
		boolean[] flag = new boolean[45]; //��ȣ �򰥸��� ���� [] ���� �� �־�� ��.
		
		//2. 6ĭ ¥�� �迭 ����, ��� �� ������ ��
		int[] result = new int[6];
		//�����Ϸ��� for�� i�� 6�� ���ư���.
		for (int i=0; i < 6 ; i++) {
			//3. ���� �� ���� ����(0~44)
			int num = ran.nextInt(45); //���� �� 1�� (��ȣ �ȿ� ��� �������� �� ����)
			
			//4. ������ ���� index�� flag�迭���� Ȯ�� if ���ǹ�����
			if(flag[num] == false) { // false�� ����
				flag[num] = true; // true�� �����ؼ� �����ϰ�
				num++; // 0�� ���� ���� �� �����Ƿ� 1�� ���������ֱ�, ������Ų �� �迭�� ����
				result[i] = num; // 6ĭ¥�� �迭�� �� ����
			}
			else
				i--; //i�� �����ǿ��� ���ҽ����ֱ� �׷��� �ߺ��� ������ �� �ٽ� �ö󰡼� ������ ������
		}	
		 	// 5. 6ĭ ¥�� ��� �迭 �� ���
			for(int i = 0; i < 6 ; i++ ) {
				System.out.print("[" + result[i] + "] ");
			}
	}	
}
