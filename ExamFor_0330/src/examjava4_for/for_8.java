package examjava4_for;

	import java.util.Scanner;
	//�������� ����غ�����.
public class for_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			// a�� �����
			for(int i =2; i<=9;i++) { //i�� ���� ��°�	
				for(int j=1; j<=9; j++) { //j�� ���� ��°� ���η� 1�� 9���� �����ش�
					int a = i*j; // ���� ���� ���ϱⰡ a �����
					System.out.println(i + "*"+j+"="+a); // ��� ���
				}
			}
		

	}

}
