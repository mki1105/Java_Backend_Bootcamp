package examjava3;
	import java.util.Scanner;
public class if_0329_4 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ū ������� ����Ͻÿ�.
		// ������ �ǹ��ľ��� ������ ������ �����(�򰥸� �� ����)
		// main ���� �ȿ� �ִ� ���� ��������
		Scanner key = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڴ�?");
		int n1 = key.nextInt();//key�� in ��� �ȵ�. key��!
		System.out.println("�� ��° ���ڴ�?");
		int n2 = key.nextInt();
		System.out.println("�� ��° ���ڴ�?");
		int n3 = key.nextInt();
		/* 2���� ������ ���� ���� �� ���� ��ȯ�Ϸ��� �ӽ÷� tmp��� ������ ����Ѵ�.
		 * swap ���������� ���� �Ű��ش�.���� ���Ǵ� ���
		 * ���� 2���� n1�� ���� ũ�ٴ� ���ǵ� ������ ��.
		 * �ڵ�� �ִ��� �ߺ����� �ʰ� �ۼ��ϱ�
		 */
		if(n2 >= n1 && n2 >= n3 ) {
				int tmp = n1; //n1�� ����� ���� tmp�� ����
				n1 = n2; //n2�� ����� ���� n1�� ����
				n2 = tmp; //tmp�� ����� ���� n2�� ����
		} else if (n3 >= n1 && n3 >= n2) {
				int tmp =n1; //n1�� ����� ���� tmp�� ����
				n1 = n3; //n3�� ����� ���� n1�� ����
				n3 = tmp;//tmp�� ����� ���� n3�� ����
		} // n1�� ���� ũ��
		if(n3 >= n2) {
				int tmp =n2;
				n2 = n3;
				n3 = tmp;
		}
		System.out.printf("%d>%d>%d\n", n1, n2, n3);

	}
}

