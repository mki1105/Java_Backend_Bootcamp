package Examdoll1;

public class Use {
	public static void main(String[] args) {
		SpeekingDoll sd = new SpeekingDoll(); //���� 1 ����
		sd.message = "�޸� �˶��";
		sd.speek();
		
		SpeekingDoll sd2 = new SpeekingDoll(); //����2 ����
		sd2.message = "���������K";
		sd2.speek();
		
	}

}
