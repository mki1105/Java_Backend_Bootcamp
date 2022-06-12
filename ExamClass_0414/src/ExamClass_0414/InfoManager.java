package ExamClass_0414;

/* �迭 ����Ͽ� ȸ���� 5���� ������ �����ϴ� ���α׷�
 * ���, ��Ϻ���, �˻��ϱ�, �����ϱ�, �����ϱ� ����
 */
public class InfoManager {
	public static final int DEFAULT_SIZE = 5; // ����� ���� 5
	// �޸𸮿� new�� InfoŬ������ ���� ��ü�� ���� infos�� ����.
	private Info[] infos = new Info[DEFAULT_SIZE];//

	// ����ϱ� 5�� ����, �ʱ�ȭ�ϱ� new�� //���� 3�� ��� ���� ���� 3���ϱ�
	void setInfo(int id, String name, int age) { // 1������ ��
		// infos���� id�ڸ��� �������ֱ� id,name,age�� �� ����
		// id�� 0��°�̸� 3���� �ѹ��� ���ٰ� ��������.
		infos[id] = new Info(id, name, age);
	}
	// ��Ϻ��� - 5�� ����� �� ���;���, ����? �� ���� ���� ������ get����
	void getInfoList() { // ��ü�� �����Ϸ��� for�ݺ�������
		for (int i = 0; i < infos.length; i++) {
			if (infos[i] != null) {// ���� i��� �ڸ��� ���� ������? �����
				// System.out.println("���� �������� �ʽ��ϴ�.");
			} else { // ���� ������ ? �� ���
				System.out.println(infos[i].getId() + "\t" + infos[i].getName() + "\t" + infos[i].getAge());
			}
		}
	}
	// �˻��ϱ� - �̸��� �˻����� �� ��������, ���ڸ� name���� ���� ��.
	void getSerch(String name) { // ��ü�� �����Ϸ��� for�ݺ������� �� �ȿ� �� ����
		for (int i = 0; i < infos.length; i++) {
			// ���� �̸� �˻��� �ߴµ� ���� ������? ���? ��ü�� �����ϸ�! �� �ڸ��� ���ٸ�
			if (infos[i] != null) { // null�� Ȱ������
				if (infos[i].getName() == name) {// infos�迭 �ڸ��� �̸��� ���ٸ�
					System.out.println(infos[i].getId() + "\t" + infos[i].getName() + "\t" + infos[i].getAge());
					return; //����ϰ� �޼��� ����
				}
			}
		}
		// ���� �̸� �˻��� �ߴµ� ���� �ȳ����� ���� ����.
		System.out.println("���� �������� �ʽ��ϴ�.");
	}
	// �����ϱ� �����ε�- ������ setname���� �����ؼ� �������ֱ�
	// 1. ������ȣ �޾Ƽ�  age����, id�� �����̴ϱ�
	void editInfo(int id, int age) { //
		if (infos[id] != null) { // ���̸� �����ϰ��� �ϴ� ȸ���� �ִٸ�
			infos[id].setAge(age);
			;
		} else {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.");
		}

	}
	// 2. ������ȣ �޾Ƽ�   id�� �����̴ϱ�
	void editInfo(int id, String name) { // id�� �����ϰ��� �ϴ� ����� �ִٸ�
		if (infos[id] != null) {
			infos[id].setName(name);
		} else {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.");

		}
	}
	// 3. ������ȣ�޾Ƽ� �̸�, ���� �ٲٱ�
	void editInfo(int id, String name,int age) {
		if (infos[id] != null) {
			infos[id].setName(name);
			infos[id].setId(id);
		} else {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.");

		}
	}
	// �����ϱ� - ���� �ϰ��� �ϴ� ���� ���ڰ����� �ޱ�
	void deleteInfo(int id) {
		if (infos[id] != null) { // ���� ���� �ִٸ� �������ֱ�
			infos[id] = null;// null Ȱ���ϱ�(����)
			System.out.println(id + "�� ���� ���� �Ǿ����ϴ�.");
		} else // �ε����� ��ü�� �������� ������
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.");
	}
}
