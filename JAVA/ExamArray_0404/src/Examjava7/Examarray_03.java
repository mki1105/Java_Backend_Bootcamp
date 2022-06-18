package Examjava7;

import java.util.Scanner;

public class Examarray_03 {
	/* 배열을 출력하기 위해서는 반복문을 사용하거나, 배열을
	 * 출력할 수 있는 메서드를 활용해야 한다.
	 */
	public static void main(String[] args) {
		// 자바의 배열은 동적으로 관리
		// 정적바인딩 : 컴파일 타임에 필요한 공간이 결정됨.(필요한 만큼 정해져 있음, 고정)
		// 동적바인딩 : 런타임에 필요한 공간이 결정됨.
		// int a = 10; 시작하기 전부터 int 4byte로 결정됨. 정적임
		int []arr = null; // 실행 중에 정해짐.
		Scanner in = new Scanner(System.in);
		System.out.print("배열의 길이는? ");
		int size = in.nextInt(); //입력받고
		arr = new int[size]; // 실행중 size수 만큼 배열이 생성
		System.out.println(arr.length);
	}

}
