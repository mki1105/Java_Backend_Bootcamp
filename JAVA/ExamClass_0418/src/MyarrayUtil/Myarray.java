package MyarrayUtil;

public class Myarray {
	private int[] arr;
	private int length;
	private static final int DEFAULT_SIZE = 5;

	// 메서드
	// 디폴트 생성자는 인자를 받지 않는 생성자.
	Myarray() {
//	this.length = 5; //
//	this.arr = new int[length];
//		arr = new int[DEFAULT_SIZE];
		this(DEFAULT_SIZE);
		//this 또는 super 뒤에 괄호는 생성자
	}

	// 생성자 오버로딩(정수(인자)를 전달받아 길이로 사용)
	Myarray(int length) {
		this.length = length;
		this.arr = new int[this.length]; // 해석
	}

	// setter 2개
	// 배열 참조 전달받아 세팅
	public void setArray(int[] arr) {
		this.arr = arr;
	}
	// 위치와 값을 전달받아 세팅
	public void setValue(int position, int value) {
		this.arr[position] = value; // 값을 배열 위치에
		// this.length = arr.length;
	}

	// getter 3개
	// 기존 배열 참조를 반환
	public int[] getArray() {
		return this.arr; // 기존 배열
	}

	// 위치를 받아 해당 위치 값을 반환
	public int getValue(int position) { // 괄호 안체크
		return this.arr[position];
	}

	// 참조하는 배열의 길이를 반환
	public int getLength() {
		return this.arr.length; // 어디의 길이인지 위치 지정해주기
	}

	public void print(int[] array) { // 출력
		System.out.print("배열: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
