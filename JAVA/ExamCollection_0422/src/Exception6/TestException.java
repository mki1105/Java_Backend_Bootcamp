package Exception6;

public class TestException {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		
		System.out.println(mc.add(100, 100));
		
		try {
			System.out.println(mc.add(101, 100));
		}catch(ScopeException e) {
			System.out.println("범위를 벗어남");
		}
	}
}