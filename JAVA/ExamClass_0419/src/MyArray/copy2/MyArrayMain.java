package MyArray.copy2;

public interface MyArrayMain {
	public static void main(String[] args) {
	//��ü ����
	MyArrayList na = new MyArrayList();
	//�����ϱ�
	na.add(10);
	na.add(20);
	na.add("Hi");
	na.add(40);
	na.add(-1);
	na.add("MK");
	//���� ���
	System.out.println(na.toString());
	
	//�� ��ġ ���
	System.out.println(na.get(3));
	System.out.println(na.get(5));
	System.out.println(na.get(4));
	System.out.println(na.get(10));
}
}