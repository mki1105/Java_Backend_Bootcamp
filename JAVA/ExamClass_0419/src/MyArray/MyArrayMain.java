package MyArray;

public interface MyArrayMain {
	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList(); //��ü����
		ma.add(1); //0��° �ڸ����� ����
		ma.add(2);
		ma.add(3);
		ma.add(4);
		ma.add("Hello");
		ma.add(5);
		ma.add("Hello2");
		System.out.println(ma.toString()); //����� �� ���
		
		System.out.println(ma.get(4));// 4°�ڸ� �� ���
		System.out.println(ma.get(1));// 1��°�ڸ� �� ���
		System.out.println(ma.get(2));// 2��°�ڸ� �� ���
		System.out.println(ma.get(6));
		System.out.println(ma.get(10));
	}
}