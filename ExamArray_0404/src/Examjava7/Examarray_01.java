package Examjava7;
// 배열: 동일한 자료형으로 메모리에 연속으로 할당된 변수의 집합
public class Examarray_01 {
// 자료형에 배열을 만들고 싶으면 대괄호를 사용하면 된다.
	public static void main(String[] args) {
		int[] arr =null;// arr는 배열의 이름, 배열 참조변수 선언, 나중에 만들어질 칸들이 생긴다.
		// 배열을 생성할 때는 new를 사용해야 한다. 몇칸짜리 배열을 만들고 싶은지
		arr = new int[5];// 배열 생성(0, false, null로 초기화)
		arr[0] = 10; // 별도로 지정하지 않은 칸의 값은 0이다.
		arr[1] = 20;
		arr[2] = 30;
		// int[] ages = new int[50000000];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[5]); //5칸을 만들었기에 최대 index는 4로 범위 예외.
		
	}

}
