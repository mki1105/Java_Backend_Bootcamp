package Examjava9_0406;
import java.util.Arrays;
import java.util.Scanner;
// �Է¹��� �迭�� ���� �����Ͽ� ����ϱ�
public class Examarray_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. �迭, ���� �����ϱ�
		// ������ �迭 �����ϱ� size��
		System.out.println("������ �迭�� ���̸� �Է��ϼ���.");
		int size = scan.nextInt(); //size�� �迭 ���� �Է¹ޱ�
		int[] num = new int[size];//������ �迭 ���� size(�ʱ�ȭ)
	
		// ������ �Է¹ޱ�
		System.out.printf("%d�� �迭�� �����Ǿ����ϴ�.", num.length); //size�� �ص� ������ length�� �ϴ°� ����.
		System.out.println();
		
		// 2. ������ �迭��ŭ �Է¹ޱ�
		for(int i = 0; i < num.length; i++) { //�迭�� ���̺��� ������ŭ �ݺ�, ������ 0����!
			System.out.printf("%d��° �� : ", i+1);
			int num2 = scan.nextInt(); // num2�� �Է��ϴ� ���� ��.
			num[i] = num2; // �Է��� ���� num2�� num�迭�� �����Ű��
		}
		// 3. ���� �迭 �Էµ� �� �����
		System.out.print("�迭�� �Էµ� ����? ");
		// for���� �ᱹ �Ȱ��Ƽ� �����ص� ��.
		for(int i =0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}		
		System.out.println();
		
		// 4. �������ǹ�-��������
		for(int i =0; i < num.length-1 ;i++) { // �� �ڸ��� ���ڸ��� ���ϱ� ���� -1�� ��.
			for(int j =0; j < num.length-1 ; j++) {
				if(num[j] > num[j+1]) { //���ڸ��� ũ�� �� ���ڸ��� �ٲ�� ��.
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;					
				}
			}
		}
		// 5. ����ϱ�
		Arrays.sort(num); //���� �迭�� ���ĵ�.
		System.out.printf("���� �� ����? ");
		for(int i =0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
}
