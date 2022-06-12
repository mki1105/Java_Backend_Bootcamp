package Exception9;

public class TestException {
	public static void main(String[] args) {
		AddUtil mc = new AddUtil();

		System.out.println(mc.addUtil1(100, 90)); // 예외처리 되어 있음
		// System.out.println(mc.addUtil1(100, -2)); //예외처리 되어 있음
		// System.out.println(mc.addUtil1(101, 23)); //예외처리 되어 있음

		try {
			// System.out.println(mc.addUtil2(100, 90)); //전가된 예외를 처리해야 함
			System.out.println(mc.addUtil2(100, -2)); // 전가된 예외를 처리해야 함
			// System.out.println(mc.addUtil2(101, 23)); //전가된 예외를 처리해야 함
		} catch (ScopeException e) {
			System.out.println("범위를 벗어남. " + e.getMessage());
		}
	}
}