package Examjava7;

public class Examarray_02 {

	public static void main(String[] args) {
		//�迭 �ʱ�ȭ(�����ϸ鼭 �ʱ�ȭ �ϴ� �����)
		int[] arr1 = {1, 2, 3}; // �ʱ�ȭ
		// arr1 = {3, 2, 1}; // ������ ����!
		int[] arr2 = new  int[3]; // �ʱ�ȭ(3ĭ¥�� ���鷡, �迭 ����ø� ����)
		arr2 = new int[4];
		int[] arr3 = new int[] {4, 5, 6}; // �ʱ�ȭ
		arr3 = new int[] {6,5,4};
		// int[] arr4 = new int[2] {10,20}; ��� �Ұ���,������ ���� ���ÿ� ����ϸ� �ȵȴ�.
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1:" +"[" + i + "]");
		}
		System.out.println(arr1);
		System.out.println(arr1.length);
		for(int i =0; i< arr1.length;i++) {
			System.out.println("arr[" + i + "] :" + arr1[i]);
			
		}
	}

}
