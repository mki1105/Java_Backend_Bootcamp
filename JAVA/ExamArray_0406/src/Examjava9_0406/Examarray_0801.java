package Examjava9_0406;
// 8�� ���ѹ迭 ����� �ڵ� Ǯ��
import java.util.Arrays;
import java.util.Scanner;
public class Examarray_0801 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 1. ��������
		int index = 0; // ĭ ���� �� 0���� �ʱ�ȭ ����
		int defaultSize = 3; // �������(�⺻ ������ =3)
		int size = defaultSize; // ������� �⺻������ ����
		int[] arr = new int[size]; // arr��� �迭�� size �迭 ����
		//2. �ݺ� ���ǹ� �����
		while(true) { // ���� ���� ��� �ݺ�
			System.out.printf("�Է�(�������:%d):", size); //������� ��� 
			int n = in.nextInt(); // n�̶�� ������ ���� �Է¹ޱ�
			if(n == -1) break; // -1�� �Է��ϸ� ����
			arr[index++] = n; // n�� arr�迭 index��ĭ�� �÷��ָ鼭 �����ϱ�
			// �����Ű�� ���� index ��ġ����?
			if(size == index) { // ���� ������� �ε��� ���̰� �������� �� á�ٴ� ��.
				// size = size + defaultsize, �����  ���� �⺻������ �߰�.
				size += defaultSize;
				int[] tmp = arr; // tmp��� ���ο� �迭 ���������� arr�� ��ƶ�.
				arr = new int[size]; //arr�� �� �ٸ� ���ο� size�迭�� ����?
				//i��? tmp ���ο� �迭 ���� ����������ŭ �ݺ� 
				for(int i = 0; i < tmp.length; i++) { //tmp �迭 ���̴� 3
					arr[i] = tmp[i]; // tmp�� �迭�� arr�� �迭�� �����Ű��.
				}
				System.out.println("������("+arr.length+")"); //arr�迭 ���̸�ŭ ���� ��.
			}// if�� ����, tmp�� if���� ����� �����ϱ� if���� ����� ������.
			printArray(arr); //int�� �迭 printArray �޼������? ��Ȯ�� �� �����
			System.out.println();
		}
	}
	public static void printArray(int[] array) { //array���
		for(int i = 0; i < array.length; i++) { //array�迭 ���̺��� ������ŭ ����ϱ�
			System.out.print(array[i] + ",");
		}
	}

}
