package ArrayList;

public class Main {

	public static void main(String[] args) {
		InfoManager info = new InfoManager();
		
		info.listadd(1, "홍길동", 10);
		info.listadd(2, "강감찬", 20);
		info.listadd(3, "김민경", 30);
		info.listadd(4, "이순신", 40);
		info.listadd(5, "김민지", 50);
		
		System.out.println("회원등록");
		System.out.println(info.printList());
		
		System.out.println("회원수정하기");
		info.edit(2, "세모", 25);
		info.edit(3, "도레미", 37);
		info.edit(4, "파솔라");
		System.out.println(info.printList());

		System.out.println("회원검색");
		System.out.println(info.serch("도레미"));
		
		System.out.println("회원삭제");
		info.delete(4); // 4번 id 삭제(값으로 바로 접근)
	
		System.out.println(info.printList());
	}

}
