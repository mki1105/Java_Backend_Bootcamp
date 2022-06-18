package Exception7;

public class MyCalculator {
	
	public int add(int n1, int n2) {
		int ret = 0;
		if(scopeCheck(n1)) {
			throw new ScopeException("n1:" + n1);
		}
		if(scopeCheck(n2)) {
			throw new ScopeException("n2:" + n2);
		}
		ret = n1 + n2;
		return ret;
	}
	
	private boolean scopeCheck(int n) {
		return (n > 100 || n < 0);
	}
}