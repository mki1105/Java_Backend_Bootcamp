package MyArray.copy2;

import java.util.Arrays;

public class MyArrayList implements MyList {
	// ����ʵ� ����
	// �迭 ��ü ����
	// ��ġ�� index, ���̴� length, ������ ���� ���� ����� ����Ʈ
	private int index;
	private int length = 5;
	private Object[] ar = new Object[length];
	private static final int DEFAULT_SIZE = 3;

	// �������̵� �ε��� ��ġ�� �ϳ��� �־��ְ�, �ڸ� �� ä������ �÷��ֱ�
	@Override
	public boolean add(Object o) {
		ar[index++] = o; // o�� �� �޾Ƽ� �־��ְ�
		if (index == length) { // ���� �������� �ø���
			length += DEFAULT_SIZE;
			// �迭 ���� Ȱ���ϱ� (�迭) = Arrays.copyof(���� �迭, �ø��� ���� �迭����)
			ar = Arrays.copyOf(ar, length);
		}
		return true;
	}
	// get �޼���
	@Override
	public Object get(int index) {
		// ���� ����. ������ false ������ üũ���ֱ� OR ����
		if(index > length || index < 0){
			return false;
		}
		// ���� �����ϸ� �� ���
		if(ar[index] != null) {
			return ar[index];
		}
		return null; //�ƴϸ� null��
	}
	//toString ���ڿ� ��ȯ�ϱ�
	@Override
	public String toString() {
		String result = "MyArrayList [";
		for(int i = 0; i < ar.length; i++) {
			result += ar[i] + " ";//result�� ������ �� �־��ֱ�
		}
		return result + "]";
	}
}
