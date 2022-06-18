package Io07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
/*
 * 이 샘플 예제를 분석하여 파일로 데이터를 관리하는 프로그램을 완성하시오.
 */
public class ManagerImplTest {
	private static ManagerImplFile mi = new ManagerImplFile();	//Map을 이용하여 구현한 구현체

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		mi.load(); //파일로부터 불러오기
		
		while(true) {
			System.out.print("명령 입력(도움말:help)>");
			String cmd = in.nextLine();
			if(cmd.startsWith("create")) {
				createInfo(cmd.split(" "));
			}else if(cmd.startsWith("read")) {
				readInfo(cmd.split(" "));
			}else if(cmd.equalsIgnoreCase("list")) {
				listInfo();
			}else if(cmd.equalsIgnoreCase("exit")) {
				mi.save(); //파일로 저장하기
				System.out.println("프로그램 종료!");
				break;
			}else if(cmd.equalsIgnoreCase("help")){
				System.out.println("create [이름] [생일] [혈액형]\t: 등록 하기(생일은 yyyy-MM-dd형식");
				System.out.println("read [번호]\t:정보 가져오기");
				System.out.println("update [번호] [이름] [생일] [혈액형]\t:정보 수정");
				System.out.println("delete [번호]\t:정보 삭제");
				System.out.println("list\t:목록 보기");
				System.out.println("exit\t:프로그램 종료");
				System.out.println("help\t:도움말보기");
			}
		}
	}
	
	private static void readInfo(String[] args) {
		if(args.length == 2) {
			try {
				Info info = mi.selectOne(Long.parseLong(args[1]));
				if(info != null) {
					printInfo(info);
				}
			}catch(NumberFormatException e) {
				System.out.println("번호 형식 오류!");
			}
		}
	}

	
	private static void createInfo(String[] args) {
		if(args.length == 4) {
			try {
				mi.insert(new Info(0L, args[1], LocalDate.parse(args[2]), args[3]));
			}catch(DateTimeParseException e) {
				System.out.println("생년월일 형식 오류!");
			}
		}
	}
	
	private static void printInfo(Info info) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("정보");
		System.out.printf("번호:%d.이름:%s, 생일:%s, 혈액형:%s\n",
					info.getNumber(),
					info.getName(),
					info.getBirth().format(formatter),
					info.getBloodType());
	}

	private static void listInfo() {
		List<Info> ls = mi.selectAll();
		for(Info info : ls) {
			System.out.println("목록");
			System.out.printf("번호:%d.이름:%s\n", info.getNumber(), info.getName());
		}
	}

}
