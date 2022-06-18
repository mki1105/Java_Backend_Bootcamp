package FileClass;
import java.io.File;
import java.io.IOException;

public class ExamFile2 {
	public static void main(String[] args) {
		File dir = new File("dir01");
		System.out.println(dir.exists());
		if(!dir.exists()) {
			System.out.println(dir.mkdir());
		}
		File file = new File(dir, "data.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			//���� �� �ʿ��� �ӽ�����
			File temp = File.createTempFile("temp", ".data", dir);//�ӽ� ����
			
			Thread.sleep(5000);
			
			temp.deleteOnExit(); //���α׷� ���� �� ����
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
	}
}	