package examjava4_for2;

public class for_homework2 {
	/* �� 100���� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 �ִ�. �� �Ѹ����� �Ϸ翡
	 * 20g�� ���� �԰� 10�ϸ��� ���� ���� 2�辿 �����Ѵ�. ��ĥ���� â����
	 * ���� ��� ���� ���̰� �ɱ�, �׸��� ��� �� ����ΰ�? ������ 80kg
	 */
	public static void main(String[] args) {
		// ���� �����ϱ�
		int rice = 8000000; //���� 80kg*100x��=8000000g
		int mouse =2; // 1�� 2����
		int day = 1; // 10�ϸ��� 20g���̴ϱ� 200��
			
		for(day=1;day<=200;day++) {
			rice = rice-(mouse*20);	//�� ��g���� 20g�� 2������ �Դ°� ���	
			
			if(day %10 == 0) { //10�ϴ� 2�辿 �þ�°� ���
				mouse *=2;
			}
			if(rice <=0) {
				System.out.printf("��� %d �����̰�,"
						+ "�� %d�� �ҿ�˴ϴ�.", mouse, day);
				break;
	}
			
	}

}
}