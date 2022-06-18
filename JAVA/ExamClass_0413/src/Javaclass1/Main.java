package Javaclass1;

public class Main {
	public static void main(String[] args) {
	// 디폴트 생성자 호출, 생성자를 호출하면  그 값으로 초기화
		MyArray arr1 = new MyArray(); // MyArray에 arr1 객체생성
		MyArray arr2 = new MyArray(3); // 2객체 생성
		int[] test = {2,4,6,7,10,5}; // int배열 test
	
		arr1.print(arr1.getArray()); // myarray 클래스에서 출력으로 정의해둠.
		System.out.println();
		System.out.println(" 길이 : " + arr1.getLength());
		System.out.println();
		
		arr2.print(arr1.getArray()); // 해석하기
		System.out.println();
		System.out.println("길이 : " + arr2.getLength());
		
		arr1.setArray(test); // test의 배열로  세팅 근데 왜 arr1. 참조변수
		System.out.println();
		arr1.setValue(0, 1); //배열 0번쨰 자리 1로
		arr1.setValue(1, 2); //배열 1번째 자리 2로
		arr1.setValue(2, 3);
		arr1.setValue(3, 4);
		arr1.setValue(4, 5);
		arr1.setValue(5, 6);
		arr1.print(test); //배열 자리 바꾼 후 출력
		System.out.println();
		System.out.print("길이 : " + arr1.getLength());	
	}
	
}
