package MyarrayUtil;

public class Main {
	public static void main(String[] args) {
		//Myarray�� ��ӹ��� Util��ü ����- ��ü ������ �ݵ�� �ϳ��� ������ ȣ��
		MyarrayUtil test1 = new MyarrayUtil(4); //���ڰ�
		int[] my = {30,20,40}; //int�迭 my
		
		//�θ� �� ���
		test1.print(test1.getArray()); //���ڰ� ���� ������ 4�� ���
		System.out.println();
		System.out.println("���� : " + test1.getLength());
		System.out.println("====================");
		
		test1.setArray(my); // my �迭 �����޾� ����-30 20 40����
		test1.setValue(0, 100); //100���� ����
		test1.setValue(1, 200);
		test1.setValue(2, 300);
		test1.print(my); // 100 200 300 ���
		
		System.out.println("\n���� : " + test1.getLength());
		System.out.println("====================");
		//�迭 ��
		test1.print(my);
		System.out.println("\n�迭 ������ ����? " + test1.getSum());
		//�迭 �� ��ġ
		System.out.println("====================");
		test1.print(my);
		System.out.println("\n10�� �����ϴ� ��ġ :\t" + test1.getloc(100)); 
		System.out.println("20�� �����ϴ� ��ġ :\t" + test1.getloc(200));
		System.out.println("30�� �����ϴ� ��ġ :\t" + test1.getloc(300));

	}
}
