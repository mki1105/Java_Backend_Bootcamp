package Examjava8_0405;
//�ֹε�Ϲ�ȣ �����ϱ� �ٽ� �����ϱ�
import java.util.Scanner;
public class Examarray_0501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. ���� �迭 �����ϱ�
		// �ֹε�Ϲ�ȣ �ڸ��� ���� �迭 �ϳ�, �ֹε�Ϲ�ȣ �Է��� �迭 �ڸ� �ϳ�
		int [] checknum = new int[] {2,3,4,5,6,7,8,9,2,3,4,5};
		String num; //���ڿ� ��ȣ ����, �ֹε�� ��ȣ 13�ڸ� �Է��Ұ���.
		int sum = 0;
		// �ֹι�ȣ �Է��ض�!
		System.out.println("�ֹε�Ϲ�ȣ�� -���� �Է��ϼ���.");
		//�Է� �޾ƾ���
		num = scan.nextLine();
		// 2. �迭 �ڸ� ������ ���� �ݺ������� �����
		for(int i = 0; i< checknum.length; i++) {
			// String���ڿ����� �ϳ��� ���ڸ� �������� ���� �� charAt��� �޼ҵ� ���
			sum = sum + checknum[i] * Character.getNumericValue(num.charAt(i));
		}	
		// sum ������ �ʿ�, result ������ �ʿ�, ������ ������ �ʿ�
		// �ڸ����� ���Ѱ� ���տ��� 11�� ���� �������� �� �ڷ� �� �ڶ� �Ȱ��ƾ� ��
		// 3. �ֹ� �����ϱ�
		int na; // ������ ���� ���ҰŸ� result = 11-(sum%11)��!
		int result; // 11���� �������� �� ��
		na = sum % 11;
		result = 11 - na;
		
		if(result == 10) {
			result = 0;
		}if(result == 11) {
			result = 1;
		}
		// 4. ����ϱ� //result= ������ ���� ������ 12�� �ڸ��� �����ϸ�!
			if( result == Character.getNumericValue(num.charAt(12))) {
				System.out.println("������ �ֹε�Ϲ�ȣ �Դϴ�.");
			}	else {
				System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.");
		}
	}
}

