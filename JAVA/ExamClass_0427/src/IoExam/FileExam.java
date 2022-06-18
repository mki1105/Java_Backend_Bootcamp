package IoExam;
// ����
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileExam {
	public static ArrayList<Info> readFile(File file) throws IOException {
		FileReader filereader = null;
		ArrayList<Info> list = new ArrayList<Info>();

		try {
			filereader = new FileReader(file);
			list = readReader(filereader);// readReader ���� Ȯ���ϱ�
		} finally {
			if (filereader != null)
				filereader.close();
		}
		return list;

	}
}
