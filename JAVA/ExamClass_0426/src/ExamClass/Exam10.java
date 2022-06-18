package ExamClass;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream
 * DataOutputStream
 * 버퍼를 이용하여 기본 자료형의 데이터 형태를 입출력
 * 서로 다른 자료형 사용 시 입출력 순서 고려
 */
public class Exam10 {
	public static void main(String[] args) throws IOException{
		DataOutputStream dos = new DataOutputStream(
				new FileOutputStream(new File("data.txt")));
		dos.writeUTF("홍길동");
		dos.writeInt(350);
		dos.writeDouble(196.4);
		dos.writeBoolean(true);
		
//		dos.flush();
		dos.close();
		
		DataInputStream dis = new DataInputStream(
				new FileInputStream(new File("data.txt")));
		String name = dis.readUTF();
		int age = dis.readInt();
		double h = dis.readDouble();
		boolean b = dis.readBoolean();
		dis.close();

		System.out.println(name);
		System.out.println(age);
		System.out.println(h);
		System.out.println(b);
	}
}