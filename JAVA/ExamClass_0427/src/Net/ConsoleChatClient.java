package Net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class  ConsoleChatClient implements Runnable{
	private InetAddress ia;
	private Socket soc;
	private Scanner key;
	private PrintWriter pw;
	private BufferedReader in;
	private String serverIp = "127.0.0.1"; //접속할 IP주소 - 자기자신
	private int serverPort = ConsoleChatServer.SERVER_PORT;

	public ConsoleChatClient() throws Exception{ //
		ia = InetAddress.getByName(serverIp); //접속할 대상 준비
		soc = new Socket(ia, serverPort); //소켓 직접 생성-포트로 접속시도(요청)
		System.out.println("##서버와 연결됨####");
		key = new Scanner(System.in);
		pw = new PrintWriter(soc.getOutputStream(),true); //출력하기 위한
		Thread tr=new Thread(this); //
		tr.start();
		String msg=""; //입력받은거 서버로 보내기 while
		while((msg=key.next())!=null){
			pw.println(msg);
		}//while------
	}//생성자---------
	public void run(){
		try{
			in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String serverMsg="";
			while(true){
				serverMsg=in.readLine();
				System.out.println("From Server: "+ serverMsg);
			}//while-----
		}
		catch (Exception e){
			System.out.println("예외: "+e.getMessage());
		}
	}//run()----------

	public static void main(String[] args)  throws Exception{
		new ConsoleChatClient();
	}
}
