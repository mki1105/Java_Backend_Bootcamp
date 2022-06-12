package IoExam;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
   @SuppressWarnings("resource")
   public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException  {
         
         System.out.println("회원을 등록하시오.");
   
 		
        
         FileInputStream input;
         ObjectInputStream ois; 
         InfoManager temp;
         
         try {
            input  = new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
            ois = new ObjectInputStream(input);
            temp = (InfoManager) ois.readObject();
         }catch(EOFException e) {
            System.out.println("비어있는 파일~");
            temp = new InfoManager();
         }
         temp.listadd(01, "A4", 10);
         temp.listadd(02, "A3", 11);


      
         FileOutputStream ouput = new FileOutputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
         ObjectOutputStream oos = new ObjectOutputStream(ouput);
         oos.writeObject(temp); oos.flush(); oos.close();
         
         
         for(Info i : temp.list)
             System.out.println(i);
      }
}

      
//import java.io.EOFException;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//
//public class Main {
//	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//		InfoManager info = new InfoManager();
//		InfoManager temp ;
//
//		// 경로 바꾸고 파일 생성해서 다시하기!!
//		System.out.println("회원을 등록하시오.");
//		info.listadd(01, "df", 10);
//		info.listadd(02, "파ㄴ라", 20);
//		info.listadd(03, "김민경", 30);
//		info.listadd(04, "동ㄴ", 40);
//		// InfoManager info;
//
//		// 1. 파일이 존재유무 체크 (만약 존재하지 않는다면 새로운 파일 생성)
//		File info1 = new File("test.txt");
//		try {
//			if (!info1.exists())
//				info1.createNewFile();
//		} catch (EOFException e) {
//			System.out.println("dd");
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//
//			// 2. 19~22에서 입력받은 정보를 test.txt에 저장
//			FileOutputStream ouput = new FileOutputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
//			ObjectOutputStream ois = new ObjectOutputStream(ouput);
//			ois.writeObject(info);
//			ois.flush();
//			ois.close();
//
//			// 3. 출력
//			FileInputStream input = new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
//			ObjectInputStream oos;
//
//			/* 만약, 파일에 아무것도 저장되어 있지 않으면 오류메시지 출력.
//			 * 만약, 파일에 정보가 있으면 infomanager 참조번수 temp에 파일에
//			 * 있는 객체정보를 바이트로 읽어옴. 그리고 출력함.
//			 */
//
//			try {
//				InfoManager readObj = (InfoManager) ((ObjectInput) ois).readObject();
//				oos = new ObjectInputStream(new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt"));
//				temp = (InfoManager) oos.readObject();
//				System.out.println(temp.printList());
//	
//			} catch (EOFException e) {
//				e.printStackTrace();
//				System.out.println("오류(없음)");
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//			System.out.println(info1.exists());
//			
//			// for (Info i : info.list) {// 인포매니저 안에 있는 리스트로
////			System.out.println(i);
////			}
//		if (!info1.exists()) { // 파일 확인
//					try {
//						// FileOutputStream fos = new FileOutputStream("test.txt");
//						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(info1));
//						oos.writeObject(info); // 객체를 출력스트림으로 보냄(바이트배열로 변환)
//						oos.flush(); oos.close();
//					} catch (FileNotFoundException e) {
//						e.printStackTrace();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
			// 정보출력
			// InputStream으로 들어오는 바이트배열 객체로 변환(강제타입변환필요)
			// 객체는 문자가 아니기 때문에 바이트 코드로 변경해주는 보조스트림이 ObjectIn(Out)put
//		FileInputStream fis = new FileInputStream("test.txt");
			// ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
//		ObjectInputStream ois = new ObjectInputStream(
//				new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt"));
//
//		try {
//			// ArrayList<Info> readObj = (ArrayList<Info>) ois.readObject();// 다운캐스팅을 잘못함.
//			InfoManager readObj = (InfoManager) ois.readObject();
//
//			for (Info i : info.list) {// 인포매니저 안에 있는 리스트로
//				System.out.println(i);
//			}
//		} catch (ClassNotFoundException | IOException e) {
//			e.printStackTrace();
//		}
//
//		ois.close();
	
