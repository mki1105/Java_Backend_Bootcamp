package MyArray.copy;

import java.util.Arrays;

public class MyArrayList implements MyList {
	//��� �ʵ� �ۼ�
	//�迭 ��ü �����ϱ�
	//��ġ�� index�� ���̴� length�� ������ ���� ����Ʈ������
	
	private int index;
	private int length = 5;
	private Object[] arr = new Object[length];
	private static final int DEFAULT_SIZE = 3;
	
	//�������̵� o�� ���� �Է¹ް� �ڸ��� �ϳ��� �����Ű��
	@Override
	public boolean add(Object o) {
		arr[index++] = o;
		//���� ��ġ�� �� ���� ���� �÷��ֱ�
		if(index == length) {
			length += DEFAULT_SIZE;
			arr = Arrays.copyOf(arr, length);
		}
		return true;
	}
	//get �޼���
	public Object get(int index) {
		// ������ �����? false
		if(length < index || index < 0)
			return false;
		//���� ���� ������? �� ��ȯ
		if(arr[index] != null)
			return arr[index];
		// ��� ������ null ��ȯ
		return null;
	}
	
	//String ���ڿ� ��ȯ�ϱ�
	@Override
	public String toString() {
		String result = "MyArrayList [ ";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i] + " ";
		}
		return result + "]";
	}
}