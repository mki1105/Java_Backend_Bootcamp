package Examjava7;
// �迭: ������ �ڷ������� �޸𸮿� �������� �Ҵ�� ������ ����
public class Examarray_01 {
// �ڷ����� �迭�� ����� ������ ���ȣ�� ����ϸ� �ȴ�.
	public static void main(String[] args) {
		int[] arr =null;// arr�� �迭�� �̸�, �迭 �������� ����, ���߿� ������� ĭ���� �����.
		// �迭�� ������ ���� new�� ����ؾ� �Ѵ�. ��ĭ¥�� �迭�� ����� ������
		arr = new int[5];// �迭 ����(0, false, null�� �ʱ�ȭ)
		arr[0] = 10; // ������ �������� ���� ĭ�� ���� 0�̴�.
		arr[1] = 20;
		arr[2] = 30;
		// int[] ages = new int[50000000];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[5]); //5ĭ�� ������⿡ �ִ� index�� 4�� ���� ����.
		
	}

}
