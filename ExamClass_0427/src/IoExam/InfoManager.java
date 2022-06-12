package IoExam;

import java.io.Serializable;
//��� ,�˻�, ����, ����, ���
import java.util.ArrayList;

public class InfoManager implements Serializable {
	// ArrayList ��ü ����. <> �ڷ���, ��ü �־ ��.
	ArrayList<Info> list = new ArrayList<>();

//	InfoManager() {
//	}
//
//	InfoManager(int id, String name, int age) {
//		super(id, name, age);
//	}

	// ����ϱ�
	public void listadd(int id, String name, int age) {
		list.add(new Info(id, name, age));
	}

	// ��Ϻ��� (list�� ���� tmp�� �ϳ��� �����ؼ� ����ϱ�)
	public String printList() {
		String result = "";
		for (Info tmp : list) {
			result += tmp.toString(); // tmp�� �ϸ� �ּҰ��� ����� �Ǵϱ� toString
		}
		return result;
	}

	// �����ϱ� ��ȣid �޾Ƽ� �̸� ����
	public boolean edit(int id, String name) {
		return edit(id, name, -1);
	}// -1�� �ع����� ������ �Ǿ������ �Ʒ� ���ǹ�.

//		for (Info tmp : list) {
//			if (tmp.getId() == id) {
//				tmp.setName(name);
//				return true;
//				}

	// ��ȣid �޾Ƽ� �̸��� ���� ����
	public boolean edit(int id, String name, int age) {
		for (Info tmp : list) { // ����� tmp�� �ϳ��� ��� ��ü ���� ������ ã�� ����
			if (tmp.getId() == id) { // ���� ã���� �ϴ� id�� �Է��� id�� ���ٸ�
				// tmp.setAge(age); // ���̴� �Է��� ���̷� ����
				tmp.setName(name); // �̸��� �Է��� �̸����� ����
				if (age != -1) // -1�� ���� �ʴٸ�,
					tmp.setAge(age); // ���� �״�� ���
				return true;
			}
		}
		return false;
	}

	// �˻��ϱ�
	public Info serch(String name) { // �̸����� �˻��� ��.
		for (Info tmp : list) { // Ŭ���� �ڷ��� Info
			if (tmp.getName().equals(name)) {//
				return tmp; // �� ���״�� ���
//			if (tmp.getName() == name) {
//				result += tmp.toString();
			}
		}
		return null;
	}

	// �����ϱ�
	/*
	 * remove(int�� �ҰŸ� �ε��� ��ġ�� ����)
	 * remove(Object�� �ҰŸ� ���� �Ȱ��� ������ ����)
	 * 
	 */
	public boolean delete(int id) { // ���� �������
		for (Info tmp : list) { // ��ü �����ߴµ�
			if (tmp.getId() == id) { // ã���� �ϴ� id�� ������
				list.remove(tmp);// ����
				return true;
			}
		}
		return false;
	}
}
