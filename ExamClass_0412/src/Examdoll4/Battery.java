package Examdoll4;

public class Battery {
	private int �뷮;
	private String ����;
	
	public Battery(){ }
	
	public Battery(int cap, String t){
		setCap(cap);
		setType(t);
	}
	
	public void setCap(int cap) {
		�뷮 = cap;
	}
	
	public void setType(String t) {
		���� = t;
	}
	public int getCap() {
		return �뷮;
	}
	
	public String getType() {
		return ����;
	}
	
	public int plus(int w) {
		if(�뷮 - w > 0) {
			�뷮 -= w;
			return w;
		}else {
			int tmp = �뷮;
			�뷮 = 0;
			return tmp;
		}
	}
	

}
