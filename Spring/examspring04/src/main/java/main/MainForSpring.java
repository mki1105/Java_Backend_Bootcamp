package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import examspring01.AlreadyExistingMemberException;
import examspring01.ChangePasswordService;
import examspring01.IdPasswordNotMatchingException;
import examspring01.MemberInfoPrinter;
import examspring01.MemberListPrinter;
import examspring01.MemberNotFoundException;
import examspring01.MemberRegisterService;
import examspring01.RegisterRequest;
import examspring01.VersionPrinter;

//import 추가

public class MainForSpring {
	
	//context 객체(스프링 컨테이너)참조 추가
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException{
		//스프링 설정파일 xm을 통해 객체를 생성하고
		//의존객체를 주입하는 스프링 컨테이너 생성
		ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			if(command.startsWith("new")) {
				processNewCommand(command.split(" "));
				continue;
			}else if(command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}
			else if(command.equals("list")) {
				processListCommand();
				continue;
			}
			else if(command.startsWith("info")) {
				pocessInfoCommand(command.split(" "));
				continue;
			}
			else if(command.equals("version")) {
				processVersionCommand();
				continue;
			}
			printHelp();
		}
	}

	// 조립기 사용 안함
	//private static Assembler assembler = new Assembler();

	private static void processNewCommand(String[] arg) {
		if(arg.length != 5) {
			printHelp();
			return;
		}
		// MemberRegisterService regSvc = assembler.getMemberRegisterService();
		// 위 서브시 객체 가져오기를 스프링 컨테이너로부터 가져오도록 다음과 같이 변경
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		RegisterRequest req = new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);

		if (!req.isPasswordEqualToConfirmPassword()) {
			System.out.println("암호화 확인이 일치하지 않습니다.\n");
			return;
		}
		try {
			regSvc.regist(req); //스프링 컨테이너 객체의 기능 사용
			System.out.println("등록되었습니다.\n");
		} catch (AlreadyExistingMemberException e) {
			System.out.println("이미 존재하는 이메일입니다. \n");
		}
 
	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}
//		ChangePasswordService changePwdSvc =
//				assembler.getChangePasswordService();
// 위 서브스 객체 가져오기를 스프링 컨테이너로부터 가져오도록 변경
		ChangePasswordService changePwdSvc =
				ctx.getBean("changePwdSvc", ChangePasswordService.class);		
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			//스프링 컨테이너 객체의 기능 사용
			System.out.println("암호가 변경되었습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다. \n");
		} catch (IdPasswordNotMatchingException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}
	// memberListPrinter클래스에 대한 객체를 받아와 printAll 메서드를 통해 값 출력
	private static void processListCommand() {
		MemberListPrinter listPrinter =
				ctx.getBean("listPrinter", MemberListPrinter.class);
		listPrinter.printAll();
	}
	
	private static void pocessInfoCommand(String[] arg) {
		if(arg.length != 2 ) {
			printHelp();
			return;
		}
		MemberInfoPrinter infoPrinter = 
				ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		infoPrinter.printMemberInfo(arg[1]);
	// 이메일 정보를 받아 해당 이메일을 가진 회원의 정보를 출력하는 기능
	}
	
	// 버전을 출력하는 기능 추가
	private static void processVersionCommand() {
		VersionPrinter versionPrinter =
				ctx.getBean("versionPrinter", VersionPrinter.class);
			versionPrinter.print();
	}
	
	private static void printHelp() {
		System.out.println();
		System.out.println("명령어 사용법을 확인하세요");
		System.out.println("usage :");
		System.out.println("new [이메일] [이름] [암호][암호확인]");
		System.out.println("change [이메일][현재비밀번호][변경할비밀번호]");
		System.out.println();
	}
}
