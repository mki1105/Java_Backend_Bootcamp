package ExamClass_0414;

public class Info3 {
	/* 등록번호(고유)
	 * 이름
	 * 나이
	 * 변수선언, 생성자, getter, setter.
	 */
		//변수선언
		private int id; //등록번호(고유번호)
		private String name; //이름
		private int age; //나이
		
		Info3 (int id, String name, int age){ //생성자
			this.age = age;
			this.id = id;
			this.name = name;
		}
		//필드 값 설정하는 setter
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		//필드 값 반환하는 getter
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getId() {
			return id;
		}
		
		public String getInfo() { // 출력위해
			return this.id + "\t" + this.name + "\t" + this.age;	
		}		
	}


