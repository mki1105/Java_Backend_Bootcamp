package Examjava7;

public class Examarray_02 {

	public static void main(String[] args) {
		//배열 초기화(생성하면서 초기화 하는 방법들)
		int[] arr1 = {1, 2, 3}; // 초기화
		// arr1 = {3, 2, 1}; // 컴파일 에러!
		int[] arr2 = new  int[3]; // 초기화(3칸짜리 만들래, 배열 선언시만 가능)
		arr2 = new int[4];
		int[] arr3 = new int[] {4, 5, 6}; // 초기화
		arr3 = new int[] {6,5,4};
		// int[] arr4 = new int[2] {10,20}; 사용 불가능,개수와 값을 동시에 사용하면 안된다.
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1:" +"[" + i + "]");
		}
		System.out.println(arr1);
		System.out.println(arr1.length);
		for(int i =0; i< arr1.length;i++) {
			System.out.println("arr[" + i + "] :" + arr1[i]);
			
		}
	}

}
