package examjava4_for2;

public class for_homework3 {
	/*  ù���� 10���� �����ϰ�, ���������� ������ 2�踦 �����ϴ�
	 *  ������� �Ѵ޵��� ������ �ݾ���?
	 */
	public static void main(String[] args) {
		 /* int�� 4byte���� ��Ʈ�� ���� ������ 21������� ������ �ȴ�.
		  * (long :�޸𸮰� �����ϱ� ������ ������ ���س��� ����Ѵ�.�ڷ��� �߿�)
		  */
		long money= 10; //ù�� 10�� ���� //cpu�� �����ҰŶ�� ��ġ
		long totalmoney =0; //�Ѵ� ����ݾ� bank
		int day=1; // ��¥
	
		//30�ϱ��� �Ա��� �ݾ��� �����ϴ� ���ǹ�
		for(day=1; day<=30;day++) { // �������� ������ �� ������.
			totalmoney += money; // ù�� = 10�� �� ��Ż�ݾ�(10�� + 0��)
			System.out.println(day + "����"+ money +"�Ա� => �ܾ� = " + totalmoney + "��");
			money*=2;		// ������ 10���� 2�踦 
		} 		
		System.out.printf("30��°���� %,d�� �ԱݵǾ����ϴ�.",totalmoney);
	}	// if( d <= day ){
		

}	
