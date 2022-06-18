package ExamClass;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 1바이트 입력
 */
public class Exam09 {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		try {
			
			bis = new BufferedInputStream(new FileInputStream(new File("data.txt"))); //표준 입력
			
			int readData = 0;
//			while((readData = bis.read()) != -1) {
//				System.out.print((char)readData);
//			}
			bis.mark(0);
			System.out.print((char)bis.read());
			System.out.print((char)bis.read());
			System.out.print((char)bis.read());
			System.out.print((char)bis.read());
			bis.reset();
			System.out.print((char)bis.read());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}