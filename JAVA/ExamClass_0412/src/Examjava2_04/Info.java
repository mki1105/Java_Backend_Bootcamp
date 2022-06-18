package Examjava2_04;
//�̸��� ���̸� �����ϴ� Ŭ����
/*
* ���� ������: Ŭ������ ����� ���� ������ �����ϱ� ���� Ű���� 
* 	private : Ŭ���� ���ο����� ���� ���� ������ ���(�Ϲ������� �ʵ忡 ����)
*  	public : ���ٿ� ������ ���� ���(�Ϲ������� �޼��忡 ����)
*  	protected : ����Ʈ ���� + ��Ӱ��迡�� �ڽ� Ŭ������ ��츸 ���� ���� ����
*  	default(package) : ���������� ������ ���� ���(���� ��Ű�� ���� ���� ���� ����)
*  
*  getter: ��� �ʵ��� ���� ��ȯ�ϴ� ��� �޼���
*  setter: ��� �ʵ��� ���� �����ϴ� ��� �޼���
*/
public class Info {
	private String name;
	private int age;
	
	public Info(){
		System.out.println("Info()");
	}
	public Info(String n, int a){
		System.out.println("Info(String, int)");
		name = n;
		age = a;
	}
	
	//setter(set����ʵ��(����))
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	
	//getter(get����ʵ��(){ return ����ʵ�; })
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String infoToString() {
		return "Info[name=" + name + ", age=" + age + "]";
	}
}
