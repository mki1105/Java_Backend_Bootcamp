package Net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ConsoleChatServer implements Runnable{
	private ServerSocket ss;
	private Socket soc;
	private Scanner key;
	private PrintWriter pw;
	private BufferedReader in;
	public static final int SERVER_PORT = 12345;
	
	public ConsoleChatServer(){
		try{
		System.out.println("ConsoleChatServer Started....");
		ss = new ServerSocket(SERVER_PORT); //��Ʈ�� ���� �ִ� �۾�
		soc = ss.accept(); // ������Ʈ�� ������ ��ٸ�
		System.out.println("##Ŭ���̾�Ʈ�� ���� ����###");
		//Ű���� �Է� ��Ʈ�� ����
		key = new Scanner(System.in);//
		
		//Ŭ���̾�Ʈ���� �޽��� ���� ��Ʈ��--
		pw = new PrintWriter(soc.getOutputStream(),true);//�������� ����� �� �ְ� ����ϴ� ��Ʈ��

		//Ŭ���̾�Ʈ���� �� �޼����� ��Ƽ������� �޴´�.
		Thread tr=new Thread(this);
		tr.start();
		
		//Ŭ���� Ű����� �޽��� ����---
		String msg="";
		while((msg=key.next())!=null){
			pw.println(msg);
		}//while------------
		}catch(Exception e){
			System.out.println("����: "+e.getMessage());
		}
	}//������ end-----------------
	
	public void run(){
		//Ŭ�� �������� �޽����� ��� �޾Ƽ� �ڱ� �ֿܼ� ���
		try{
			in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String clientMsg="";
			while(true){
				clientMsg=in.readLine();
				System.out.println("From Client>>"+clientMsg);
			}//while-----			
		}
		catch (Exception e){
			System.out.println("����: "+e.getMessage());
		}
	}//run()----------------
	public static void main(String[] args){
		new ConsoleChatServer();//���� ����..
	}
}