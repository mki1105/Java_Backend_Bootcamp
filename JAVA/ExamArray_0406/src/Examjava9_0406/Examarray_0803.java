package Examjava9_0406;
 import java.util.Scanner;
public class Examarray_0803 {
	//���� ���ѹ迭 �����
	/* �迭�� ����ϱ� ���ؼ��� �ݺ����� ����ϰų�, �迭��
	 * ����� �� �ִ� �޼��带 Ȱ���ؾ� �Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. �迭�̳� ���� �����ϱ�
		int index = 0; //�迭 �ڸ��� ���� ��
		int defaultsize = 3; //�⺻ ���� ����3
		int size = 3; // �þ�� ������ �ִ� ���� 3(3�� �þ ����)
		//�迭�� ���� �־��ֱ�
		int[] arr = new int[size]; //������ �迭�� size�迭�� ���� 
		//2. �ݺ� ���ǹ� �ۼ��ϰ� �Է¹ް�, �����ϱ�
		System.out.println("�Է��� �����Ϸ��� -1�� �Է��ϼ���.");
		while(true) {
			System.out.printf("�Է�(������� : %d) :", arr.length);
			int num = scan.nextInt(); //���� �Է¹ޱ�
			if(num == -1) break;
			// �迭�� �����ϴ°�  ��� �Ű澲��! arr�� �Է¹��� num�� �����Ű��
			arr[index++] = num; // index ��ĭ�� �ø��� ����
			// 3. ���ѹ迭 ���ǽ�
			if(size == index) {// ���� ����� �ε����� ���ٸ� �÷�����
				size += defaultsize;
				int[] tmp = arr; //tmp�� �ű�� �迭�� ������� ���ֱ�
				arr = new int[size];
				//arr���� ���̸�ŭ�� �־����
				for(int i =0; i< tmp.length; i++) {
					arr[i] = tmp[i];
				}
				System.out.println("������(" + arr.length + ")");
			}//if�� ����
			//4. ��¹� �ۼ��ϱ�
			for(int i = 0; i <arr.length; i++) { //arr�����ŭ arr�ڸ��� ����ض�.
				System.out.print(arr[i] + ","); 
			}
			System.out.println();
		}
	}
}
