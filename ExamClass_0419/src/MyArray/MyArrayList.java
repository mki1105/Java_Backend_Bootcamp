package MyArray;

import java.util.Arrays;

// add ������, toString ������.
// interfaceŬ���������� ��ӽ� implements�� ���
public class MyArrayList implements MyList { // �����ض� MyList��
	// ����ʵ� ����
	// ������Ʈ �迭�� ����ض� ������
	// private Object[] arr; �� ����ҰŸ� ���� length����.
	private int length = 5;
	private Object[] arr = new Object[length];
	private int index;// ���� ���ڰ���, �� �迭�� ���� �ϳ��� ä����.��ġ
	private static final int DEFAULT_SIZE = 3;

	// ������

	// �������̵� �޼��� �����ϰ�(abstract�� �߻� Ŭ�����ϱ� ����)
	@Override
	public boolean add(Object o) {
		arr[index++] = o;
		if (index == length) {
			length += DEFAULT_SIZE;
			arr = Arrays.copyOf(arr, length);
		}
		return true;
	}

	// if (arr[i] == null) { // i�ڸ��� ���� ������
	// arr[i] = o; // arr �ڸ��� �� ����
	// size += 1; // �����ϰ� ���� �ϳ��� ����
	// return true;
	// }if (arr.length == size) {
	// size += DEFAULT_SIZE; // �迭 3�� �÷��� size�� ����
	// ���ο� �迭 = Arrays.copyof(�����迭, �����迭���� �����ϰ� ���� ����)

	// arr = Arrays.copyOf(arr, DEFAULT_SIZE); // �ǹ̰� ��������
	// arrays ����ٽõ��

	// �迭 �ø���
//	@Override
//	public boolean add(int index, Object o) {

	// get �޼���
	public Object get(int index) {
		// arr�迭������ ������ ����� false ��ȯ
		if (index > arr.length)
			return false;
		// arr �ش� index ���� ������ �� ��ȯ
		if (arr[index] != null)
			return arr[index];
		// ���� ��������� null
		return null;
		// if(index > arr.length || index < 0)

	}
	// toString ������(���ڿ��� ��ȯ)
//	@Override
//	public String toString() {
//		String result = "MyArrayList [";
//		for (int i = 0; i < arr.length; i++) {
//			result += arr[i] + " ";
//		}
//		return result + "]";

	@Override
	public String toString() {
		return "MyArrayList [arr=" + Arrays.toString(arr) + "]";
	}
}
