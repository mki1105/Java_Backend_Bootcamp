package Exception9;

public class TestException {
	public static void main(String[] args) {
		AddUtil mc = new AddUtil();

		System.out.println(mc.addUtil1(100, 90)); // ����ó�� �Ǿ� ����
		// System.out.println(mc.addUtil1(100, -2)); //����ó�� �Ǿ� ����
		// System.out.println(mc.addUtil1(101, 23)); //����ó�� �Ǿ� ����

		try {
			// System.out.println(mc.addUtil2(100, 90)); //������ ���ܸ� ó���ؾ� ��
			System.out.println(mc.addUtil2(100, -2)); // ������ ���ܸ� ó���ؾ� ��
			// System.out.println(mc.addUtil2(101, 23)); //������ ���ܸ� ó���ؾ� ��
		} catch (ScopeException e) {
			System.out.println("������ ���. " + e.getMessage());
		}
	}
}