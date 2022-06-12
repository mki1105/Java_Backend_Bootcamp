package MyArray2;
//강사님 코드풀이
public class MyArrayList implements MyList {

	private Object[] values; // values Object배열 생성
	private int currentIndex = 0; //현재인덱스 길이
	private static final int DEFAULT_SIZE = 5; 

	public MyArrayList() {
		values = new Object[DEFAULT_SIZE];
	}

	public MyArrayList(int size) {
		values = new Object[size];
	}

	@Override
	public boolean add(Object o) {
		if (currentIndex == values.length) {
			extension();
		}
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				values[i] = o;
				currentIndex++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean add(int index, Object o) {
		if (currentIndex + 1 == values.length) {
			extension();
		}
		if (index < currentIndex) {

			for (int i = currentIndex; i >= index; i--) {
				values[i + 1] = values[i];
			}
			values[index] = o;
			currentIndex++;
			return true;
		}
		return false;
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index >= values.length) {
			return null;
		}
		return values[index];
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("MyArrayList[");
		for (int i = 0; i < values.length; i++) {
			// if(values[i] != null)
			result.append(values[i] + ",");
		}
		result.append("]");
		return result.toString();
	}

	public int size() {
		return currentIndex;
	}

	private void extension() {
		Object[] tmp = values;
		values = new Object[tmp.length + DEFAULT_SIZE];
		for (int i = 0; i < tmp.length; i++) {
			values[i] = tmp[i];
		}
	}
}
