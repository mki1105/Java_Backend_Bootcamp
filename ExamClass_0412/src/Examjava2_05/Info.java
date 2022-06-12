package Examjava2_05;
/* set
*  get
*/
public class Info {
	private String name;
	private int age;
	
	public Info(){
		System.out.println("Info()");
	}
	public Info(String name, int age){
		System.out.println("Info(" + name + ", " + age + ")");
		System.out.println("Info(String, int)");
		this.name = name;
		this.age = age;
	}
	
	//setter(set����ʵ��(����))
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter(get����ʵ��(){ return ����ʵ�; })
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	
	public String infoToString() {
		return "Info[name=" + name + ", age=" + age + "]";
	}
	

}
