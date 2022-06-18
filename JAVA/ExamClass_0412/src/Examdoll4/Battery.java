package Examdoll4;

public class Battery {
	private int 용량;
	private String 종류;
	
	public Battery(){ }
	
	public Battery(int cap, String t){
		setCap(cap);
		setType(t);
	}
	
	public void setCap(int cap) {
		용량 = cap;
	}
	
	public void setType(String t) {
		종류 = t;
	}
	public int getCap() {
		return 용량;
	}
	
	public String getType() {
		return 종류;
	}
	
	public int plus(int w) {
		if(용량 - w > 0) {
			용량 -= w;
			return w;
		}else {
			int tmp = 용량;
			용량 = 0;
			return tmp;
		}
	}
	

}
