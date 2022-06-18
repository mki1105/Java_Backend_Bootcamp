package MyArray;

import java.util.Arrays;

// add 재정의, toString 재정의.
// interface클래스에서는 상속시 implements를 사용
public class MyArrayList implements MyList { // 구현해라 MyList로
	// 멤버필드 설정
	// 오브젝트 배열을 사용해라 모든것을
	// private Object[] arr; 로 사용할거면 따로 length설정.
	private int length = 5;
	private Object[] arr = new Object[length];
	private int index;// 현재 원자개수, 즉 배열의 값이 하나씩 채워짐.위치
	private static final int DEFAULT_SIZE = 3;

	// 생성자

	// 오버라이드 메서드 동일하게(abstract는 추상 클래스니까 제외)
	@Override
	public boolean add(Object o) {
		arr[index++] = o;
		if (index == length) {
			length += DEFAULT_SIZE;
			arr = Arrays.copyOf(arr, length);
		}
		return true;
	}

	// if (arr[i] == null) { // i자리에 값이 없으면
	// arr[i] = o; // arr 자리에 값 저장
	// size += 1; // 저장하고 개수 하나씩 증가
	// return true;
	// }if (arr.length == size) {
	// size += DEFAULT_SIZE; // 배열 3씩 늘려서 size에 저장
	// 새로운 배열 = Arrays.copyof(원본배열, 원본배열에서 복사하고 싶은 길이)

	// arr = Arrays.copyOf(arr, DEFAULT_SIZE); // 의미가 뭐였더라
	// arrays 설명다시듣기

	// 배열 늘리기
//	@Override
//	public boolean add(int index, Object o) {

	// get 메서드
	public Object get(int index) {
		// arr배열길이의 범위를 벗어나면 false 반환
		if (index > arr.length)
			return false;
		// arr 해당 index 값이 있으면 값 반환
		if (arr[index] != null)
			return arr[index];
		// 값이 비어있으면 null
		return null;
		// if(index > arr.length || index < 0)

	}
	// toString 재정의(문자열로 변환)
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
