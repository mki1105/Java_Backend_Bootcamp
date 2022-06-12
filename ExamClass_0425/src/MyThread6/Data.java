package MyThread6;

public class Data {
	int n = 1000;
	
	public int getN(int n) {
		this.n -= n;
		return this.n;
	}
	public int getN() {
		return n;
	}
}