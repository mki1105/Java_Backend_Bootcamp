package MyArray.copy2;

import java.util.Arrays;

public class MyArrayList implements MyList {
	// 멤버필드 설정
	// 배열 객체 생성
	// 위치는 index, 길이는 length, 정해진 길이 수는 상수로 디폴트
	private int index;
	private int length = 5;
	private Object[] ar = new Object[length];
	private static final int DEFAULT_SIZE = 3;

	// 오버라이드 인덱스 위치에 하나씩 넣어주고, 자리 다 채워지면 늘려주기
	@Override
	public boolean add(Object o) {
		ar[index++] = o; // o로 값 받아서 넣어주고
		if (index == length) { // 길이 같아지면 늘리기
			length += DEFAULT_SIZE;
			// 배열 복사 활용하기 (배열) = Arrays.copyof(원본 배열, 늘리고 싶은 배열길이)
			ar = Arrays.copyOf(ar, length);
		}
		return true;
	}
	// get 메서드
	@Override
	public Object get(int index) {
		// 범위 먼저. 넘으면 false 음수값 체크해주기 OR 연산
		if(index > length || index < 0){
			return false;
		}
		// 값이 존재하면 값 출력
		if(ar[index] != null) {
			return ar[index];
		}
		return null; //아니면 null로
	}
	//toString 문자열 반환하기
	@Override
	public String toString() {
		String result = "MyArrayList [";
		for(int i = 0; i < ar.length; i++) {
			result += ar[i] + " ";//result에 저장한 값 넣어주기
		}
		return result + "]";
	}
}
