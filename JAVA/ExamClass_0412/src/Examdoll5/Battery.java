package Examdoll5;
//������
public class Battery {
	private int cap;
	private String type;
	
	public Battery(){ }
	
	public Battery(int cap, String t){
		setCap(cap);
		setType(t);
	}
	
	public void setCap(int cap) {
		
		this.cap = cap;
	}
	
	public void setType(String t) {
		this.type = t;
	}
	public int getCap() {
		return cap;
	}
	
	public String getType() {
		return type;
	}
	
	public int plus(int w) {
		if(cap - w > 0) {
			cap -= w;
			return w;
		}else {
			int tmp = cap;
			cap = 0;
			return tmp;
		}
	}

}
