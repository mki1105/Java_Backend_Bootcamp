package Examjava2_04;

public class Main_java {
	public static void main(String[] args) {
		Info info1 = new Info(); //����Ʈ ������ ȣ��
		//info1.name = "ȫ�浿";
		//info1.age = 20;
		info1.setName("ȫ�浿");
		info1.setAge(20);
		
		Info info2 = new Info("�̼���", 22);
		
		System.out.println(info1.getName());//System.out.println(info1.name);
		System.out.println(info1.getAge());//System.out.println(info1.age);
		
		//System.out.println(info2.name);
		//System.out.println(info2.age);
		System.out.println(info1.infoToString());
	}

}
