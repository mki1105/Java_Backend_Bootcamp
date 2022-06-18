package MyArray.copy;

import java.util.Arrays;

public class MyArrayList implements MyList {
	//멤버 필드 작성
	//배열 객체 생성하기
	//위치는 index로 길이는 length로 정해진 수는 디폴트값으로
	
	private int index;
	private int length = 5;
	private Object[] arr = new Object[length];
	private static final int DEFAULT_SIZE = 3;
	
	//오버라이드 o로 값을 입력받고 자리에 하나씩 저장시키기
	@Override
	public boolean add(Object o) {
		arr[index++] = o;
		//만약 위치가 꽉 차면 길이 늘려주기
		if(index == length) {
			length += DEFAULT_SIZE;
			arr = Arrays.copyOf(arr, length);
		}
		return true;
	}
	//get 메서드
	public Object get(int index) {
		// 범위를 벗어나면? false
		if(length < index || index < 0)
			return false;
		//만약 값이 있으면? 값 반환
		if(arr[index] != null)
			return arr[index];
		// 비어 있으면 null 반환
		return null;
	}
	
	//String 문자열 변환하기
	@Override
	public String toString() {
		String result = "MyArrayList [ ";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i] + " ";
		}
		return result + "]";
	}
}