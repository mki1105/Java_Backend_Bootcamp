package Exception9;

public class AddUtil { //mycalculator�� �����
	private MyCalculator mc = new MyCalculator();

	public int addUtil1(int n1, int n2) {
		int ret = 0;
		try {
			ret = mc.add(n1, n2);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public int addUtil2(int n1, int n2) throws ScopeException {
		int ret = 0;
		try {
			ret = mc.add(n1, n2); // throws �ʿ�(����ó���� ȣ���� ������ ����)
		} finally {
			System.out.println("addUtil2 ������");
		}
		System.out.println("addUtil2����");
		return ret;
	}
}