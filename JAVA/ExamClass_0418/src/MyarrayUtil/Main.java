package MyarrayUtil;

public class Main {
	public static void main(String[] args) {
		//Myarray를 상속받은 Util객체 생성- 객체 생성시 반드시 하나의 생성자 호출
		MyarrayUtil test1 = new MyarrayUtil(4); //인자값
		int[] my = {30,20,40}; //int배열 my
		
		//부모 값 출력
		test1.print(test1.getArray()); //인자값 들어갔기 때문에 4로 출력
		System.out.println();
		System.out.println("길이 : " + test1.getLength());
		System.out.println("====================");
		
		test1.setArray(my); // my 배열 참조받아 세팅-30 20 40에서
		test1.setValue(0, 100); //100으로 세팅
		test1.setValue(1, 200);
		test1.setValue(2, 300);
		test1.print(my); // 100 200 300 출력
		
		System.out.println("\n길이 : " + test1.getLength());
		System.out.println("====================");
		//배열 합
		test1.print(my);
		System.out.println("\n배열 길이의 합은? " + test1.getSum());
		//배열 값 위치
		System.out.println("====================");
		test1.print(my);
		System.out.println("\n10이 존재하는 위치 :\t" + test1.getloc(100)); 
		System.out.println("20이 존재하는 위치 :\t" + test1.getloc(200));
		System.out.println("30이 존재하는 위치 :\t" + test1.getloc(300));

	}
}
