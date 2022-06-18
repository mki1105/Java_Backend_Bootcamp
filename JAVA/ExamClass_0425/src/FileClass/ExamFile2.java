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
			//실행 중 필요한 임시파일
			File temp = File.createTempFile("temp", ".data", dir);//임시 파일
			
			Thread.sleep(5000);
			
			temp.deleteOnExit(); //프로그램 종료 시 삭제
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
	}
}	