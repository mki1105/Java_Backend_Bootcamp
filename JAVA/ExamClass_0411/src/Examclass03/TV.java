package Examclass03;
// ��ü����(object 
// ������ �𵨸�
// Ŭ���� �ȿ� ���Ե� �� �ִ°� ����, �Լ�
//������ ��ü�� ������ ������ �־�� �Ѵ�. 
public class TV {
	//�Ӽ�(��)
	String brand;
	boolean power;
	int channel;
	int volume;
	
	//���
	void powerOn() {
		power = !power;
		view();
	}
	void chUp() {
		channel++;
		view();
	}
	void chDw() {
		channel--;
		view();
	}
	void volUp() {
		volume++;
		view();
	}
	void volDw() {
		volume--;
		view();
	}
	void view() {
		System.out.println("[" + brand + "]");
		if(power) {
			System.out.println(channel + "," + volume);
		}
		else {
			System.out.println("����ȭ��");
		}
	}
}
