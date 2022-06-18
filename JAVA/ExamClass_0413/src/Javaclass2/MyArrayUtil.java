package Javaclass2;

public class MyArrayUtil {
	// �ʵ�
	private int[] arr;
	private int length;
	
	// private final int DEFAULT_SIZE = 5;
	// �޼���
	// ����Ʈ ������
	MyArrayUtil() {
		// this.length = 5; //arr = new int[5];
		// this.arr = new int[length];
		arr = new int[5];
	}
	// ������ �����ε�(������ ���޹޾� ���̷� ���)
	MyArrayUtil(int length) {
		this.length = length;
		this.arr = new int[this.length]; //
	}

	// setter 2��
	// �迭 ���� ���޹޾� ����
	public void setArray(int[] arr) {
		this.arr = arr;
	}

	// ��ġ�� ���� ���޹޾� ����..?
	public void setValue(int position, int value) {
		this.arr[position] = value; // ���� �迭 ��ġ��
	}

	// getter 3��
	// ���� �迭 ������ ��ȯ
	public int[] getArray() {
		return this.arr; // ���� �迭�� ��?
	}

	// ��ġ�� �޾� �ش� ��ġ ���� ��ȯ
	public int getValue(int position) { // ��ȣ ��üũ
		return this.arr[position];
	}

	// �����ϴ� �迭�� ���̸� ��ȯ
	public int getLength() {
		return this.arr.length; // ����� �迭�������� ��ġ �������ֱ�
	}

	public void print(int[] array) { // ���
		System.out.print("�迭: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// �迭�� ��� ���� ���� ��ȯ�ϴ� �޼���
	//int sum�� �ۿ� ���� ��� �����Ǳ� ������ �ȿ� �� ��!
	public int getSum() { // for�� �ڿ� return �ۼ��� ��!
		int sum =0;
		for (int i = 0; i < this.arr.length; i++) { // this �ٽ� �����ϱ�
			sum += arr[i]; //
		}
		return sum;
	}
	
	// �迭�� Ư�� ���� �����ϴ��� Ȯ���Ͽ� �ش� ��ġ�� ��ȯ�ϴ� �޼���
	public void getloc(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				System.out.println("�� : " + value);
				System.out.println("���� ��ġ : " + i);
				 return;
			}
		}
			System.out.println("�� : " + value);
			System.out.println("���� �������� �ʽ��ϴ�.");
	}
}
