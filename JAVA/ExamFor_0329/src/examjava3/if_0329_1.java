package examjava3;
	import java.util.Scanner;
public class if_0329_1 {

	public static void main(String[] args) {
		// �Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�.
		// scanner ���̵� if�� ������ ����
		Scanner scan = new Scanner(System.in);
		int abc;
		System.out.println("���� �Է��Ͻÿ�.");
		abc = scan.nextInt();
		
		if(abc%3 == 0) { //3�� ��� ���� �ۼ��� �� �־�� ��.
			System.out.println(abc + "�� 3�� ����Դϴ�.");
		}
			
			
	}
}
		
	