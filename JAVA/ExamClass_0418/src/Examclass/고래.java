package Examclass;
	// �߻�޼���� ���� �ϰ� ���Ǹ� ���Ѵ�.
	// ���� a = new ����(); // �߻� Ŭ������ ��ü ���� �Ұ�
	// �߻� Ŭ������ Ÿ��(�ڷ���)���ν� �ǹ�
	// Ŭ���� ����� Ÿ���̶�� �������� �߻�Ŭ������ �ٲ��ֱ�
public class �� extends ������ implements ��������»���, �߰�Ÿ��{
	@Override
	void �����δ�() {
		System.out.println("������ �����δ�.");
	}

	@Override
	void �ܴ�() {
		System.out.println("������ �ܴ�.");
	}
	
	void ��Ư¡() {
		System.out.println("���� ������ Ư¡");
	}

	@Override
	public void ����Ȱ() {
		System.out.println("������ ������ ��Ȱ�Ѵ�");
	}
}