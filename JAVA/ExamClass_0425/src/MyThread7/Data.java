package MyThread7;

public class Data {
	private int n = 1000;
	
	public int getN(int n) {
		this.n -= n;
		return n;
	}
	public int getN() {
		return n;
	}
}