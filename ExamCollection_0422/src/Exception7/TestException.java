package Exception7;

public class TestException {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		
		System.out.println(mc.add(100, 100));
		
		try {
			//System.out.println(mc.add(101, 100));
			System.out.println(mc.add(100, -2));
		}catch(ScopeException e) {
			System.out.println("������ ���. " + e.getMessage());
		}
	}
}