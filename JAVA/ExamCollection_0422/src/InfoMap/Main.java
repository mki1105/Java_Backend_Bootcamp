package InfoMap;

public class Main {
	public static void main(String[] args) {
		InfoManagerMap infos = new InfoManagerMap();
		
		System.out.println("<<����ϱ�>>");
		System.out.println(infos.addinfo(new Info(1, "�趯��" , 10)));
		System.out.println(infos.addinfo(new Info(2, "������" , 20)));
		System.out.println(infos.addinfo(new Info(3, "�ڶ���" , 30)));
		System.out.println(infos.addinfo(new Info(4, "�ֶ���" , 40)));
		System.out.println(infos.addinfo(new Info(5, "�綯��" , 50)));
		System.out.println();
		
		System.out.println("<<��Ϻ���>>");
		for(Info i : infos.infoList())
			System.out.println(i);
		
		System.out.println("<<�˻��ϱ�>>");
		System.out.println(infos.serchinfo("������"));
		
		System.out.println("<<����Ȯ��>>");
		System.out.println(infos.edit(1, "������", 22));
		System.out.println(infos.edit(3, "�ļֶ�", 33));
		System.out.println();
		
		System.out.println("<<�����ϱ�>>");
		System.out.println(infos.delete(5));
		System.out.println();

		System.out.println("<<��� Ȯ���ϱ�>>");
		for(Info i : infos.infoList()) {
			System.out.println(i);
		}
		
	}
}
