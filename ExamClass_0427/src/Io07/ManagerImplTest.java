package Io07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
/*
 * �� ���� ������ �м��Ͽ� ���Ϸ� �����͸� �����ϴ� ���α׷��� �ϼ��Ͻÿ�.
 */
public class ManagerImplTest {
	private static ManagerImplFile mi = new ManagerImplFile();	//Map�� �̿��Ͽ� ������ ����ü

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		mi.load(); //���Ϸκ��� �ҷ�����
		
		while(true) {
			System.out.print("��� �Է�(����:help)>");
			String cmd = in.nextLine();
			if(cmd.startsWith("create")) {
				createInfo(cmd.split(" "));
			}else if(cmd.startsWith("read")) {
				readInfo(cmd.split(" "));
			}else if(cmd.equalsIgnoreCase("list")) {
				listInfo();
			}else if(cmd.equalsIgnoreCase("exit")) {
				mi.save(); //���Ϸ� �����ϱ�
				System.out.println("���α׷� ����!");
				break;
			}else if(cmd.equalsIgnoreCase("help")){
				System.out.println("create [�̸�] [����] [������]\t: ��� �ϱ�(������ yyyy-MM-dd����");
				System.out.println("read [��ȣ]\t:���� ��������");
				System.out.println("update [��ȣ] [�̸�] [����] [������]\t:���� ����");
				System.out.println("delete [��ȣ]\t:���� ����");
				System.out.println("list\t:��� ����");
				System.out.println("exit\t:���α׷� ����");
				System.out.println("help\t:���򸻺���");
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
				System.out.println("��ȣ ���� ����!");
			}
		}
	}

	
	private static void createInfo(String[] args) {
		if(args.length == 4) {
			try {
				mi.insert(new Info(0L, args[1], LocalDate.parse(args[2]), args[3]));
			}catch(DateTimeParseException e) {
				System.out.println("������� ���� ����!");
			}
		}
	}
	
	private static void printInfo(Info info) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
		System.out.println("����");
		System.out.printf("��ȣ:%d.�̸�:%s, ����:%s, ������:%s\n",
					info.getNumber(),
					info.getName(),
					info.getBirth().format(formatter),
					info.getBloodType());
	}

	private static void listInfo() {
		List<Info> ls = mi.selectAll();
		for(Info info : ls) {
			System.out.println("���");
			System.out.printf("��ȣ:%d.�̸�:%s\n", info.getNumber(), info.getName());
		}
	}

}
