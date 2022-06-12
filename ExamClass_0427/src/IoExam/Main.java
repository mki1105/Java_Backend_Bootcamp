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
         
         System.out.println("ȸ���� ����Ͻÿ�.");
   
 		
        
         FileInputStream input;
         ObjectInputStream ois; 
         InfoManager temp;
         
         try {
            input  = new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
            ois = new ObjectInputStream(input);
            temp = (InfoManager) ois.readObject();
         }catch(EOFException e) {
            System.out.println("����ִ� ����~");
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
//		// ��� �ٲٰ� ���� �����ؼ� �ٽ��ϱ�!!
//		System.out.println("ȸ���� ����Ͻÿ�.");
//		info.listadd(01, "df", 10);
//		info.listadd(02, "�Ĥ���", 20);
//		info.listadd(03, "��ΰ�", 30);
//		info.listadd(04, "����", 40);
//		// InfoManager info;
//
//		// 1. ������ �������� üũ (���� �������� �ʴ´ٸ� ���ο� ���� ����)
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
//			// 2. 19~22���� �Է¹��� ������ test.txt�� ����
//			FileOutputStream ouput = new FileOutputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
//			ObjectOutputStream ois = new ObjectOutputStream(ouput);
//			ois.writeObject(info);
//			ois.flush();
//			ois.close();
//
//			// 3. ���
//			FileInputStream input = new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt");
//			ObjectInputStream oos;
//
//			/* ����, ���Ͽ� �ƹ��͵� ����Ǿ� ���� ������ �����޽��� ���.
//			 * ����, ���Ͽ� ������ ������ infomanager �������� temp�� ���Ͽ�
//			 * �ִ� ��ü������ ����Ʈ�� �о��. �׸��� �����.
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
//				System.out.println("����(����)");
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//			System.out.println(info1.exists());
//			
//			// for (Info i : info.list) {// �����Ŵ��� �ȿ� �ִ� ����Ʈ��
////			System.out.println(i);
////			}
//		if (!info1.exists()) { // ���� Ȯ��
//					try {
//						// FileOutputStream fos = new FileOutputStream("test.txt");
//						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(info1));
//						oos.writeObject(info); // ��ü�� ��½�Ʈ������ ����(����Ʈ�迭�� ��ȯ)
//						oos.flush(); oos.close();
//					} catch (FileNotFoundException e) {
//						e.printStackTrace();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
			// �������
			// InputStream���� ������ ����Ʈ�迭 ��ü�� ��ȯ(����Ÿ�Ժ�ȯ�ʿ�)
			// ��ü�� ���ڰ� �ƴϱ� ������ ����Ʈ �ڵ�� �������ִ� ������Ʈ���� ObjectIn(Out)put
//		FileInputStream fis = new FileInputStream("test.txt");
			// ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
//		ObjectInputStream ois = new ObjectInputStream(
//				new FileInputStream("C:\\javastudy\\workspace\\ExamClass_0427\\test.txt"));
//
//		try {
//			// ArrayList<Info> readObj = (ArrayList<Info>) ois.readObject();// �ٿ�ĳ������ �߸���.
//			InfoManager readObj = (InfoManager) ois.readObject();
//
//			for (Info i : info.list) {// �����Ŵ��� �ȿ� �ִ� ����Ʈ��
//				System.out.println(i);
//			}
//		} catch (ClassNotFoundException | IOException e) {
//			e.printStackTrace();
//		}
//
//		ois.close();
	
