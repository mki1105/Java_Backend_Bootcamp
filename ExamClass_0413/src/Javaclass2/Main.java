package Javaclass2;

public class Main {
	public static void main(String[] args) {
	// 디폴트 생성자 호출
		MyArrayUtil abc1 = new MyArrayUtil(); //util 생성자 호출
		MyArrayUtil abc2 = new MyArrayUtil(4);
		int[] test2 = {2,4,6,7,10,5};
		
		abc1.print(abc1.getArray()); // myarrayutil 클래스에서 출력으로 정의해둠.
		System.out.println();
		System.out.println(" 길이 : " + abc1.getLength());
		System.out.println();
	
		abc2.print(abc2.getArray());
		System.out.println();
		System.out.println("길이 : " + abc2.getLength());
		
		abc1.setArray(test2); // test의 배열로  세팅 근데 왜 arr1. 참조변수
		System.out.println();
		abc1.setValue(0, 1); //배열 0번쨰 자리 1로
		abc1.setValue(1, 2); //배열 1번째 자리 2로
		abc1.setValue(2, 3);
		abc1.setValue(3, 4);
		abc1.setValue(4, 5);
		abc1.setValue(5, 6);
		abc1.print(test2); //배열 자리 바꾼 후 출력
		System.out.println();
		System.out.println("길이 : " + abc1.getLength());	
		System.out.println("=================");
		System.out.println();
		abc1.print(test2);
		System.out.println();
		System.out.println("배열 값의 전체 합은? " + abc1.getSum());
		System.out.println("=================");
		System.out.println();
		System.out.println("배열의 각 위치는?");
		System.out.println();
		abc1.getloc(1); //값 1의 위치
		abc1.getloc(2);
		abc1.getloc(3);
		abc1.getloc(4);
		abc1.getloc(9);
		
	
	}
	
}
