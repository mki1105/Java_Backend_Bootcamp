package examjava4_for;

public class for_02 {
	//1���� 100������ ���� ���ϼ���. //5050�� ����
	public static void main(String[] args) {
		/* 1~100�� ���ϴ� �ϳ��� ���� �ʿ��ϴϱ� ������ �ϳ��� �ʿ��ϴ�.
		 * ���� count 1��, ���� �� �� �ִ� sum 1��
		 * �߰��� ����start, ��end�� ���� �������൵ �ȴ�.
		 * 
		 * if(count <=end)
		 * 		sum += count;
		 * count++; OR
		 * 
		 * 
		 * 
		 */
		int sum = 0;
		for (int i=1; i<= 100; i++) {
			sum += i+1;
		}
		System.out.println("1���� 100������ ���� :" + sum + "�̴�.");
	}

}
