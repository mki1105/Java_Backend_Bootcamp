package MyArray.copy2;

public interface MyArrayMain {
	public static void main(String[] args) {
	//객체 생성
	MyArrayList na = new MyArrayList();
	//저장하기
	na.add(10);
	na.add(20);
	na.add("Hi");
	na.add(40);
	na.add(-1);
	na.add("MK");
	//저장 출력
	System.out.println(na.toString());
	
	//값 위치 출력
	System.out.println(na.get(3));
	System.out.println(na.get(5));
	System.out.println(na.get(4));
	System.out.println(na.get(10));
}
}