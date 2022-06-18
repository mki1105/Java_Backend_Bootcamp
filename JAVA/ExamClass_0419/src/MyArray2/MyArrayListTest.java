package MyArray2;

public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
		mal.add(1);
		mal.add(2);
		mal.add(3);
		mal.add(4);
		mal.add(5);
		mal.add(6);
		
		System.out.println(mal.get(0));
		System.out.println(mal.get(3));
		System.out.println(mal.get(10));
		System.out.println(mal.get(-1));
		
		System.out.println(mal.toString());
		mal.add(1, "first");
		System.out.println(mal.toString());
		mal.add(2, "second");
		System.out.println(mal.toString());
		mal.add(0, 10);
		System.out.println(mal.toString());
		mal.add(1.1);
		mal.add(2.2);
		mal.add(3.3);
		System.out.println(mal.toString());
		
		MyArrayList mal2 = new MyArrayList(9);
		for(int i = 1; i <= 10; i++) {
			mal2.add(i);
		}
		for(int i = 0; i < mal2.size(); i++) {
			System.out.print(mal2.get(i));
		}
		System.out.println();
		System.out.println(mal2);
		
	}
}