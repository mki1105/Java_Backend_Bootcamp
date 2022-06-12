package MyArray.copy;

public interface MyArrayMain {
	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		
		//값 저장하기
		ma.add(10);
		ma.add(20);
		ma.add(30);
		ma.add("HAHAHA");
		ma.add(40);
		ma.add(50);
		
		//값 출력
		System.out.println(ma.toString());
		
		//값 위치 찾기
		System.out.println(ma.get(3));		
		System.out.println(ma.get(2));
		System.out.println(ma.get(10));	
	}
}