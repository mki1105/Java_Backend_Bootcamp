package ExamHashSet;

import java.util.HashSet;

/* ������ ���ϴ� ���� �˻��ϴ� ���� contains(value)
 * Iterator�� �ݺ���, ��� ����, Ŭ���� ��ü�κ��� �޼��� ������
 * �ؽ��ڵ�� �� ��ü�� ���� �ִ� ���� �̿�.
 */
public class CustomClass {

	public static void main(String[] args) {

		HashSet<Info> infos = new HashSet<>();
//		Info[] infoArr = new Info[]
//				{ new Info("ȫ�浿", 20), new Info("�̼���", 20), new Info("ȫ�浿", 21),
//				new Info("ȫ�浿", 20) };

//		for (int i = 0; i < infoArr.length; i++) {
//			System.out.println(infoArr[i].hashCode());

		// �迭 ���� ���� add�� �������ֱ�
		infos.add(new Info("ȫ�浿", 20));
		infos.add(new Info("��ΰ�", 20));
		infos.add(new Info("ȫ�浿", 20));
// infos�� ���� tmp�� �ϳ��� �����ؼ� ����ϱ� - ������� ����ҰŸ� ����ϸ� �ȵ�.
		for (Info tmp : infos) { // foreach
			System.out.println(tmp);
		}
	}
}
