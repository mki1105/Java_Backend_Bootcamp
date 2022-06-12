package Exception9;

public class AddUtil { //mycalculator를 사용함
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
			ret = mc.add(n1, n2); // throws 필요(예외처리를 호출한 곳으로 전가)
		} finally {
			System.out.println("addUtil2 마무리");
		}
		System.out.println("addUtil2종료");
		return ret;
	}
}