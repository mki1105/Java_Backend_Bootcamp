package Examjava8_0405;
	import java.util.Random;
public class Examarray_03_02 {

	public static void main(String[] args) {
		// ���� 2�� ���������ض�.
		Random ran = new Random();
		int[] lotto = new int[6]; // 6�ڸ� �迭 �ڸ� ������
		
		for(int i =0; i <6 ; i++) { // 6��� lotto.length; �ۼ��ص� ��
			lotto[i] = ran.nextInt(45)+1; // �ζ� ��ȣ 6�� ���� �����
			for(int j =0; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;		
				}			
			}
		}
		// ���� ���� // i�� �񱳴��1 j�� �񱳴��2
		for(int i=0; i<lotto.length-1 ; i++) { //�� 1�� ���°�?
			for(int j =0; j<lotto.length-1; j++) {
				if(lotto[j] > lotto[j+1]) { //�� 1�� ���ϴ���? �� j����? j�� 0�϶�  j�� 1�� �ڸ��� �� ��?
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;	
				}
			}
				
		}
		System.out.println("�ζ� �ڵ���ȣ : ");
		for(int i = 0; i<lotto.length;i++) {
			System.out.println("[" + lotto[i] + "]");
		}
	}

}
