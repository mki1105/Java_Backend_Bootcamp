package examjava5;

public class star11_for {

	public static void main(String[] args) {
		for(int i=1; i<6 ; i++) {
			// �����ڸ�
			for(int j = 0; j < 5-i ; j++) {
				System.out.print(" ");
			}
			// ���ڸ�
			 for(int k =0; k < i ; k++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
}