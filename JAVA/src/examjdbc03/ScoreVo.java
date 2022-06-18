package examjdbc03;

public class ScoreVo {
	private long number; //"NUMBER" number, 	- PKÁöÁ¤
	private String infonumber;
	private String subcode; //"SUBJECT_CODE" number,
	private long subscore; //"SUBJECT_SCORE" number(5,2),
	
	public ScoreVo(long number, String infonumber, String subcode, long subscore) {
		super();
		this.number = number;
		this.infonumber = infonumber;
		this.subcode = subcode;
		this.subscore = subscore;
	}

	public ScoreVo() {
		super();
		
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getInfonumber() {
		return infonumber;
	}

	public void setInfonumber(String infonumber) {
		this.infonumber = infonumber;
	}

	public String getSubcode() {
		return subcode;
	}

	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}

	public long getSubscore() {
		return subscore;
	}

	public void setSubscore(long subscore) {
		this.subscore = subscore;
	}

	@Override
	public String toString() {
		return "ScoreVo [number=" + number + ", infonumber=" + infonumber + ", subcode=" + subcode + ", subscore="
				+ subscore + "]";
	}
}
