package examjava3;

import java.util.Scanner;

public class if_0329_7 {

	public static void main(String[] args) {
		//���� �Է¹޾� ����Ͻÿ�(��, 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� ���� ���)
		Scanner scan = new Scanner(System.in);
		int n =1;
		if(n%3 !=0 || n %5 ==0) { //!= ���� �ʳİ� ����� ��.
			System.out.println(n);
		}
		System.out.println("end");
	}

}
