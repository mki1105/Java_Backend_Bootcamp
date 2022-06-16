package exam02;

public class CountCalculator extends Calculator{
	private Counter addCounter;
	private Counter minCounter;
	private Counter mulCounter;
	private Counter divCounter;
	
	public void setAddCounter(Counter cnt) {
		this.addCounter = cnt;
	}
	public void setMinCounter(Counter cnt) {
		this.minCounter = cnt;
	}
	public void setMulCounter(Counter cnt) {
		this.mulCounter = cnt;
	}
	public void setDivCounter(Counter cnt) {
		this.divCounter = cnt;
	}
	
	public int add(int n1, int n2) {
		addCounter.increment();
		return super.add(n1, n2);
	}
	public int min(int n1, int n2) {
		minCounter.increment();
		return super.min(n1, n2);
	}
	public int mul(int n1, int n2) {
		mulCounter.increment();
		return super.mul(n1, n2);
	}
	public int div(int n1, int n2) {
		divCounter.increment();
		return super.div(n1, n2);
	}
	
	public int getAddCount() {
		return addCounter.getCount();
	}
	public int getMinCount() {
		return minCounter.getCount();
	}
	public int getMulCount() {
		return mulCounter.getCount();
	}
	public int getDivCount() {
		return divCounter.getCount();
	}
}