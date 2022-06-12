package InfoMap;

public class Main {
	public static void main(String[] args) {
		InfoManagerMap infos = new InfoManagerMap();
		
		System.out.println("<<µî·ÏÇÏ±â>>");
		System.out.println(infos.addinfo(new Info(1, "±è¶¯¶¯" , 10)));
		System.out.println(infos.addinfo(new Info(2, "À±¶¯¶¯" , 20)));
		System.out.println(infos.addinfo(new Info(3, "¹Ú¶¯¶¯" , 30)));
		System.out.println(infos.addinfo(new Info(4, "ÃÖ¶¯¶¯" , 40)));
		System.out.println(infos.addinfo(new Info(5, "¾ç¶¯¶¯" , 50)));
		System.out.println();
		
		System.out.println("<<¸ñ·Ïº¸±â>>");
		for(Info i : infos.infoList())
			System.out.println(i);
		
		System.out.println("<<°Ë»öÇÏ±â>>");
		System.out.println(infos.serchinfo("À±¶¯¶¯"));
		
		System.out.println("<<¼öÁ¤È®ÀÎ>>");
		System.out.println(infos.edit(1, "µµ·¹¹Ì", 22));
		System.out.println(infos.edit(3, "ÆÄ¼Ö¶ó", 33));
		System.out.println();
		
		System.out.println("<<»èÁ¦ÇÏ±â>>");
		System.out.println(infos.delete(5));
		System.out.println();

		System.out.println("<<¸ñ·Ï È®ÀÎÇÏ±â>>");
		for(Info i : infos.infoList()) {
			System.out.println(i);
		}
		
	}
}
