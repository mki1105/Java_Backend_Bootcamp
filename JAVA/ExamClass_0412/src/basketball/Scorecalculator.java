package basketball;
//������ ���� �����
/* �޴� �̿��Ͽ� �ۼ� �� �Է�(0 :����) :
* while������ ����� ���Ḹ���
* �����ڸ� �̿��ؼ� count�� �ʱ�ȭ(0 �Ǵ� ���� ������ �ʱ�ȭ)
* Getter, Setter ����Ͽ� ����� ���Ƿ� �ʱ�ȭ�� �����ϵ���
* �ʿ��� Ŭ������? basketball, ���Ǽ� ��������,�����Է¸޴�
*/ 
public class Scorecalculator {
	//���� �޴� �Է�(1,2,3���޴� �Է� �� �ش� ��� ���� �Է�)
	private int countShoot1; //�� Ƚ�� 
	private int countShoot2;
	private int countShoot3;
	
	private int scoreShoot1; //�� ����
	private int scoreShoot2;
	private int scoreShoot3;
	
	private int countShootSum;// �� Ƚ�� ��
	private int scoreShootSum;// ���� ��
	
	//������, ��Ƚ�� 0���� �ʱ�ȭ
	Scorecalculator () {
		countShoot1 =0;
		countShoot2 =0;
		countShoot3 =0;
	}
	//����ڰ� �� �� Ƚ�� �ʱ�ȭ�ϴ� �޼��� //this �ٽ� �����ϱ�
	public void setCountShoot1(int countShoot1) {
		this.countShoot1 = countShoot1;
	}
	public void setCountShoot2(int countShoot2) {
		this.countShoot2 = countShoot2;
	}
	public void setCountShoot3(int countShoot3) {
		this.countShoot3 = countShoot3;
	}
	//�� Ƚ�� ��ȯ�ϴ� �޼���
	public int getCountShoot1() {
		return countShoot1;
	}
	public int getCountShoot2() {
		return countShoot2;
	}
	public int getCountShoot3() {
		return countShoot3;
	}
	
	// ���� Ƚ�� �߰��ϴ� �޼���
	public void Countplus1() {
		this.countShoot1++;
	}
	public void Countplus2() {
		this.countShoot2++;
	}
	public void Countplus3() {
		this.countShoot3++;
	}
	// ���� �ջ� ���� �޼���
	public int countShoot1score() {
		scoreShoot1 = countShoot1 * 1; //1ȸ���� ���ھ� 1�� ���
		return scoreShoot1;
	}
	public int countShoot2score() {
		scoreShoot2 = countShoot2 * 2; //2ȸ���� ���ھ� 2�� ���
		return scoreShoot2;
	}
	public int countShoot3score() {
		scoreShoot3 = countShoot3 * 3; //3ȸ���� ���ھ� 3�� ���
		return scoreShoot3;
	}
	// �� Ƚ�� �� ��ȯ�ϱ�
	public int getCountShootSum() {
		countShootSum = countShoot1 + countShoot2 + countShoot3;
		return countShootSum;
	}
	// �� ���� �� ��ȯ�ϱ�
	public int getScoreShootSum() {
	scoreShootSum = scoreShoot1 + scoreShoot2 + scoreShoot3;
	return scoreShootSum;
	}
}


