package ExamHashSet;

import java.util.Iterator;
import java.util.Random;
import java.util.HashSet;

/* contains(value) : ������ ���ϴ� ���� �˻��ϴ� ���.
 * Iterator�� �ݺ���, ��� ����, Ŭ���� ��ü�κ��� �޼��� ������
 */
public class lotto {

	public static void main(String[] args) {

		Random ran = new Random();
		//< > �ڷ����� ����ϴ� ����, ���̾Ƹ�� ������.
		HashSet<Integer> num = new HashSet<>();// HashSet����, Generic����

		while (num.size() < 6) {
			num.add(ran.nextInt(45));
		}
		//�ݺ��� �������� ���ο���� ������ �� �ִ� ������ ������ �� ����. ��ȸ�� �� ����.
		Iterator<Integer> a = num.iterator(); // num��ȣ�� �������ڴ�.
		while(a.hasNext()) { //has �޼���� ���� ��Ҹ� �˻��Ͽ� ��Ұ� ���� ���
			System.out.print(a.next() + ",");//next�޼���� ��ü�� ��������.
		}
	}
}

