package Javaclass1;

public class Main {
	public static void main(String[] args) {
	// ����Ʈ ������ ȣ��, �����ڸ� ȣ���ϸ�  �� ������ �ʱ�ȭ
		MyArray arr1 = new MyArray(); // MyArray�� arr1 ��ü����
		MyArray arr2 = new MyArray(3); // 2��ü ����
		int[] test = {2,4,6,7,10,5}; // int�迭 test
	
		arr1.print(arr1.getArray()); // myarray Ŭ�������� ������� �����ص�.
		System.out.println();
		System.out.println(" ���� : " + arr1.getLength());
		System.out.println();
		
		arr2.print(arr1.getArray()); // �ؼ��ϱ�
		System.out.println();
		System.out.println("���� : " + arr2.getLength());
		
		arr1.setArray(test); // test�� �迭��  ���� �ٵ� �� arr1. ��������
		System.out.println();
		arr1.setValue(0, 1); //�迭 0���� �ڸ� 1��
		arr1.setValue(1, 2); //�迭 1��° �ڸ� 2��
		arr1.setValue(2, 3);
		arr1.setValue(3, 4);
		arr1.setValue(4, 5);
		arr1.setValue(5, 6);
		arr1.print(test); //�迭 �ڸ� �ٲ� �� ���
		System.out.println();
		System.out.print("���� : " + arr1.getLength());	
	}
	
}
