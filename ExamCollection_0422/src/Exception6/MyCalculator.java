package Exception6;

public class MyCalculator {
	
	public int add(int n1, int n2) {
		int ret = 0;
		if(scopeCheck(n1)) {
			throw new ScopeException();
		}
		if(scopeCheck(n2)) {
			throw new ScopeException();
		}
		ret = n1 + n2;
		return ret;
	}
	
	private boolean scopeCheck(int n) {
		return (n > 100 || n < 0);
	}
}