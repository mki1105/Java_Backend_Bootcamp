package Examjava9_0406;
 // ���� �迭 �����(���������Ͽ� �迭 �ø���)
import java.util.Scanner;
public class Examarray_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. �迭, ���� ����( �ʿ��� ������ ������ ��� ����������)
		int index = 0;//���� �Է��� �ε����� �����μ���. �Էµ� �迭�� �ڸ�!!
		int defaultsize = 3;// ���� �⺻ ����
		int size = 3; //�þ�� ����
		// size�� �迭�� �����Ű��
		int[] arr = new int[size];// ���� ����
		
		// 2. ������ �ݺ��� // ������� �Է� �޾Ƽ� �÷����� �� ���ǹ�
		while(true) {
			System.out.printf("�Է�(������� %d) :" , size); //����� ������ �Է��� �޾ƾ���
			int num = scan.nextInt(); // �Է±��� �Է¹ް�
			if(num == -1)  //-1�� �Է��ϸ� ����
				break;
			 arr[index++] = num; // num�� arr�� �����Ű��
		// 3. ���ѹ迭 ���ǹ�
			if(size == index) { //�ε����� �������� ���̰� ������
				size += defaultsize; //����� ����⺻���̸� �߰��ؼ� ������� 
				int[] tmp = arr; // ���ο� tmp ���� �����ؼ� arr�� ����, arr�� 3�̴ϱ�
				arr = new int[size]; // arr�� size�迭�� ���� size�� 6���� �þ
				for(int i = 0; i < tmp.length; i++) {//tmp���̱���
					arr[i] = tmp[i]; // tmp�迭 �ڸ��� arr �迭�� ������Ѷ�
				}
				System.out.println("������" + "(" + arr.length +")"); //size�� �ᵵ ��.arr �迭�� ������.
			}// if�� ����
			
			printArray(arr);
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + ",");
//			}			
			System.out.println();
		}
	}		
	public static void printArray(int[] array) { //array��� ������ int�� �迭�� ���� ��.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
/* size�� �ε����� �������ٴ� ���� �� á�ٴ� ��.
 * �ε��� ++ �� �ٽ� �����
 * ����� ����Ʈ �����ŭ ������Ų��.
 * tmp��� �迭 ���������� ��´�.
 * ���ο� �迭 ��ü�� ������� ����� 
 * ���� ������� ���� tmp�� �ű�� �۾��� ��
 * ������ �þ�ٴ� ���� �ݺ�
 * tmp�� if������ ����� ������ if���� ����� tmp�� ���ٰ� ����
 * ���������� ó���� ������� ���� �迭�� �����ϴ� ���� 0 �޸𸮿��� �����
 * �þ�� ��ó�� ������, �迭�� ��ü��.
 * 
 */


