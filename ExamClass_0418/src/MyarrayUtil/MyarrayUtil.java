package MyarrayUtil;

// myarrayutil�� ��ӹ���
public class MyarrayUtil extends Myarray {
	//super�� ������ ȣ���� �� �θ��� �����ڸ� �����Ͽ� ȣ���ϴ� ��.
	//��ü�� �ݵ�� �����ڸ� ȣ���ؾ� ��, �����ڸ� �� �����ϱ�
	MyarrayUtil() {
		super();
	}
	MyarrayUtil(int length){
		super(length); 
	}
	// �迭�� ��� ���� ���� ��ȯ�ϴ� �޼���
	// int sum�� �ۿ� ���� ��� �����Ǳ� ������ �ȿ� �� ��!
	public int getSum() { // for�� �ڿ� return �ۼ��� ��!
		int sum = 0;
		/* ó���� arr.length�� �����ߴ� ������ �θ�Ŭ������
		 * �����Ϸ��� �߱� ������ super�� ���� �θ�Ŭ���� Ȱ��
		 */
		for (int i = 0; i < super.getLength(); i++) {
			sum += super.getValue(i);
		}
		return sum;
	}
	
	// �迭�� Ư�� ���� �����ϴ��� Ȯ���Ͽ� �ش� ��ġ�� ��ȯ�ϴ� �޼���
	public int getloc(int value) {
		for (int i = 0; i < super.getLength(); i++) {
			if (super.getValue(i) == value) {
				return i;
			}
		}
		return -1;
	}
}
