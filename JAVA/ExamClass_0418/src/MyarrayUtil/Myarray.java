package MyarrayUtil;

public class Myarray {
	private int[] arr;
	private int length;
	private static final int DEFAULT_SIZE = 5;

	// �޼���
	// ����Ʈ �����ڴ� ���ڸ� ���� �ʴ� ������.
	Myarray() {
//	this.length = 5; //
//	this.arr = new int[length];
//		arr = new int[DEFAULT_SIZE];
		this(DEFAULT_SIZE);
		//this �Ǵ� super �ڿ� ��ȣ�� ������
	}

	// ������ �����ε�(����(����)�� ���޹޾� ���̷� ���)
	Myarray(int length) {
		this.length = length;
		this.arr = new int[this.length]; // �ؼ�
	}

	// setter 2��
	// �迭 ���� ���޹޾� ����
	public void setArray(int[] arr) {
		this.arr = arr;
	}
	// ��ġ�� ���� ���޹޾� ����
	public void setValue(int position, int value) {
		this.arr[position] = value; // ���� �迭 ��ġ��
		// this.length = arr.length;
	}

	// getter 3��
	// ���� �迭 ������ ��ȯ
	public int[] getArray() {
		return this.arr; // ���� �迭
	}

	// ��ġ�� �޾� �ش� ��ġ ���� ��ȯ
	public int getValue(int position) { // ��ȣ ��üũ
		return this.arr[position];
	}

	// �����ϴ� �迭�� ���̸� ��ȯ
	public int getLength() {
		return this.arr.length; // ����� �������� ��ġ �������ֱ�
	}

	public void print(int[] array) { // ���
		System.out.print("�迭: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
