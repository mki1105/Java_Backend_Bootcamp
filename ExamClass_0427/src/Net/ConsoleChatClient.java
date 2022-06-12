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
	private String serverIp = "127.0.0.1"; //������ IP�ּ� - �ڱ��ڽ�
	private int serverPort = ConsoleChatServer.SERVER_PORT;

	public ConsoleChatClient() throws Exception{ //
		ia = InetAddress.getByName(serverIp); //������ ��� �غ�
		soc = new Socket(ia, serverPort); //���� ���� ����-��Ʈ�� ���ӽõ�(��û)
		System.out.println("##������ �����####");
		key = new Scanner(System.in);
		pw = new PrintWriter(soc.getOutputStream(),true); //����ϱ� ����
		Thread tr=new Thread(this); //
		tr.start();
		String msg=""; //�Է¹����� ������ ������ while
		while((msg=key.next())!=null){
			pw.println(msg);
		}//while------
	}//������---------
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
			System.out.println("����: "+e.getMessage());
		}
	}//run()----------

	public static void main(String[] args)  throws Exception{
		new ConsoleChatClient();
	}
}
