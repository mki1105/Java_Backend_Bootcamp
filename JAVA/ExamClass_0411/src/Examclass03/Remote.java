package Examclass03;
/*  TV tv = new TV�� ������ �ȿ� TV�� �����ϴ� ���̶� �ȵ�.
 *  
 */
public class Remote {
	//�Ӽ������(��)
	TV tv; // TV�� �����ؾ� �ϴ� �͸� ��. �������� TV�� ����Ѵٴ� ���� ǥ��
	//���(����, ä�㺯��, ��������)
	void powerOn() {
		tv.power  = !tv.power; //ǥ���� �ȸ���. ���� ����� ���ؼ� �����ؾ� ��.
		// TV�� ������ ���� �����ϰ� ������ TV�� ���� �Լ��� ȣ���ϴ°� �� ����.
		// tv.view(); ���� �ʿ� ����.
	} 	// ���� ����ϴ°� �ƴ϶� ����� ����ؾ� �Ѵ�.
	void chUp() {
		tv.channel++;
		tv.view();
	}
	void chDw() {
		tv.channel--;
		tv.view();
	}
	void volUp() {
		tv.volume++;
		tv.view();
	}
	void volDw() {
		tv.volume--;
		tv.view();
	}
	void view() {
		tv.view();
	}
}
