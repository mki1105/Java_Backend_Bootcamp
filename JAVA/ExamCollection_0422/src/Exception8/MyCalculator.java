package Exception8;

public class MyCalculator {		//이 메서드는 예외가 발생할 수 있다고 말해줌
public int add(int n1, int n2) throws ScopeException /*발생 가능한 예외 선언*/{
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