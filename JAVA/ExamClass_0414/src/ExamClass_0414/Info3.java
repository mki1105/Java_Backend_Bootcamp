package ExamClass_0414;

public class Info3 {
	/* ��Ϲ�ȣ(����)
	 * �̸�
	 * ����
	 * ��������, ������, getter, setter.
	 */
		//��������
		private int id; //��Ϲ�ȣ(������ȣ)
		private String name; //�̸�
		private int age; //����
		
		Info3 (int id, String name, int age){ //������
			this.age = age;
			this.id = id;
			this.name = name;
		}
		//�ʵ� �� �����ϴ� setter
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		//�ʵ� �� ��ȯ�ϴ� getter
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getId() {
			return id;
		}
		
		public String getInfo() { // �������
			return this.id + "\t" + this.name + "\t" + this.age;	
		}		
	}


