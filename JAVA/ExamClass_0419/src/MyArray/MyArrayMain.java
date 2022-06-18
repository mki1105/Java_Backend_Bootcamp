package MyArray;

public interface MyArrayMain {
	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList(); //객체생성
		ma.add(1); //0번째 자리부터 저장
		ma.add(2);
		ma.add(3);
		ma.add(4);
		ma.add("Hello");
		ma.add(5);
		ma.add("Hello2");
		System.out.println(ma.toString()); //저장된 값 출력
		
		System.out.println(ma.get(4));// 4째자리 값 출력
		System.out.println(ma.get(1));// 1번째자리 값 출력
		System.out.println(ma.get(2));// 2번째자리 값 출력
		System.out.println(ma.get(6));
		System.out.println(ma.get(10));
	}
}