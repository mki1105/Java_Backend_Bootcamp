package Exception8;

public class TestException {
	public static void main(String[] args) {
		//checked exception�̱� ������ ������ üũ�ؾ� �Ѵ�.
		//�ݵ�� ����ó���� �ʿ��ϴ�.
		MyCalculator mc = new MyCalculator();
		
		//add�� ����Ϸ��� �ݵ�� ����ó��(try-catch) �ʿ�
		try {
			//System.out.println(mc.add(100, 100)); 
			//System.out.println(mc.add(101, 100));
			System.out.println(mc.add(100, -2));
		}catch(ScopeException e) {
			System.out.println("������ ���. " + e.getMessage());
		}
	}
}