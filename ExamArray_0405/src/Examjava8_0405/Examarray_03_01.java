package Examjava8_0405;
	import java.util.Random;
public class Examarray_03_01 {
	// �������� �˰��� ����, ������������ �����ϱ�
	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto = new int[6];
		int tmp;
		for(int i=0; i < lotto.length-1; i++) {
			lotto[i] = ran.nextInt(46); //�������� �Է¹ޱ�
			for(int j = i+1 ; j < lotto.length; j++) { //j���� ���� Ŀ�� �ұ�?
				if(lotto[i] > lotto[j]){
					break;
				}
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
			}// ��ȣ üũ �߿�	
			
		}
			System.out.println("�ζ� �ڵ���ȣ : ");
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i]+",");
		}
	}
}