package Javaclass2;

public class MyArrayUtil {
	// 필드
	private int[] arr;
	private int length;
	
	// private final int DEFAULT_SIZE = 5;
	// 메서드
	// 디폴트 생성자
	MyArrayUtil() {
		// this.length = 5; //arr = new int[5];
		// this.arr = new int[length];
		arr = new int[5];
	}
	// 생성자 오버로딩(정수를 전달받아 길이로 사용)
	MyArrayUtil(int length) {
		this.length = length;
		this.arr = new int[this.length]; //
	}

	// setter 2개
	// 배열 참조 전달받아 세팅
	public void setArray(int[] arr) {
		this.arr = arr;
	}

	// 위치와 값을 전달받아 세팅..?
	public void setValue(int position, int value) {
		this.arr[position] = value; // 값을 배열 위치에
	}

	// getter 3개
	// 기존 배열 참조를 반환
	public int[] getArray() {
		return this.arr; // 기존 배열이 뭐?
	}

	// 위치를 받아 해당 위치 값을 반환
	public int getValue(int position) { // 괄호 안체크
		return this.arr[position];
	}

	// 참조하는 배열의 길이를 반환
	public int getLength() {
		return this.arr.length; // 어디의 배열길이인지 위치 지정해주기
	}

	public void print(int[] array) { // 출력
		System.out.print("배열: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// 배열의 모든 값의 합을 반환하는 메서드
	//int sum을 밖에 쓰면 계속 누적되기 때문에 안에 쓸 것!
	public int getSum() { // for문 뒤에 return 작성할 것!
		int sum =0;
		for (int i = 0; i < this.arr.length; i++) { // this 다시 공부하기
			sum += arr[i]; //
		}
		return sum;
	}
	
	// 배열에 특정 값이 존재하는지 확인하여 해당 위치를 반환하는 메서드
	public void getloc(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				System.out.println("값 : " + value);
				System.out.println("값의 위치 : " + i);
				 return;
			}
		}
			System.out.println("값 : " + value);
			System.out.println("값이 존재하지 않습니다.");
	}
}
