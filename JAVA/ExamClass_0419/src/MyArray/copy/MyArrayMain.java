package MyArray.copy;

public interface MyArrayMain {
	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		
		//�� �����ϱ�
		ma.add(10);
		ma.add(20);
		ma.add(30);
		ma.add("HAHAHA");
		ma.add(40);
		ma.add(50);
		
		//�� ���
		System.out.println(ma.toString());
		
		//�� ��ġ ã��
		System.out.println(ma.get(3));		
		System.out.println(ma.get(2));
		System.out.println(ma.get(10));	
	}
}