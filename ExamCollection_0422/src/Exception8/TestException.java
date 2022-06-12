package Exception8;

public class TestException {
	public static void main(String[] args) {
		//checked exception이기 떄문에 무조건 체크해야 한다.
		//반드시 예외처리가 필요하다.
		MyCalculator mc = new MyCalculator();
		
		//add를 사용하려면 반드시 예외처리(try-catch) 필요
		try {
			//System.out.println(mc.add(100, 100)); 
			//System.out.println(mc.add(101, 100));
			System.out.println(mc.add(100, -2));
		}catch(ScopeException e) {
			System.out.println("범위를 벗어남. " + e.getMessage());
		}
	}
}