package Javaclass2;

public class Main {
	public static void main(String[] args) {
	// ����Ʈ ������ ȣ��
		MyArrayUtil abc1 = new MyArrayUtil(); //util ������ ȣ��
		MyArrayUtil abc2 = new MyArrayUtil(4);
		int[] test2 = {2,4,6,7,10,5};
		
		abc1.print(abc1.getArray()); // myarrayutil Ŭ�������� ������� �����ص�.
		System.out.println();
		System.out.println(" ���� : " + abc1.getLength());
		System.out.println();
	
		abc2.print(abc2.getArray());
		System.out.println();
		System.out.println("���� : " + abc2.getLength());
		
		abc1.setArray(test2); // test�� �迭��  ���� �ٵ� �� arr1. ��������
		System.out.println();
		abc1.setValue(0, 1); //�迭 0���� �ڸ� 1��
		abc1.setValue(1, 2); //�迭 1��° �ڸ� 2��
		abc1.setValue(2, 3);
		abc1.setValue(3, 4);
		abc1.setValue(4, 5);
		abc1.setValue(5, 6);
		abc1.print(test2); //�迭 �ڸ� �ٲ� �� ���
		System.out.println();
		System.out.println("���� : " + abc1.getLength());	
		System.out.println("=================");
		System.out.println();
		abc1.print(test2);
		System.out.println();
		System.out.println("�迭 ���� ��ü ����? " + abc1.getSum());
		System.out.println("=================");
		System.out.println();
		System.out.println("�迭�� �� ��ġ��?");
		System.out.println();
		abc1.getloc(1); //�� 1�� ��ġ
		abc1.getloc(2);
		abc1.getloc(3);
		abc1.getloc(4);
		abc1.getloc(9);
		
	
	}
	
}
