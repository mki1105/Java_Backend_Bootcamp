package examjava4_for;

public class for_03 {
	// 1���� 100������ Ȧ���� �հ� ¦���� ���� ���ϼ���.
	public static void main(String[] args) {
		int a =0; //Ȧ�� ��
		int b =0; //¦�� ��
			
		for(int i=1; i<100;i++){
			a += i++;
		}			
		System.out.println("1���� 100������ Ȧ���� ����?\n" + a);
			for(int i=0; i<100; i++){
			b += i++;
		}
		System.out.println("1���� 100������ ¦���� ����?\n" + b);
	}
}