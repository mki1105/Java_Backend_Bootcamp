package examjava5;

public class star10_for {

	public static void main(String[] args) {
		for(int i =0 ; i<5 ; i++) {	
		 //�����̽� ���� ������ֱ�
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
		}//�� ( ������ 5���� �ƴ϶� �پ��Բ� ���� ¥���Ѵ�)
			for(int j = 0; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}