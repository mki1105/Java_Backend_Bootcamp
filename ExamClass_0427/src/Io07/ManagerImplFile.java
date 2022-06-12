package Io07;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

public class ManagerImplFile extends ManagerImpl{
	private File file;
	private ObjectOutputStream oos;
	
	private static final String FILE_NAME = "info.data";
	
	public ManagerImplFile() {
		file = new File(FILE_NAME);
	}
	
	public void load() {
		if(!file.exists()) {
			System.out.println("기존 데이터가 존재하지 않음");
			return;
		}
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			HashMap<Long, Info> readMap = (HashMap<Long, Info>)ois.readObject();
			long readSequence = ois.readLong();
			Set<Long> keys = readMap.keySet();
			for(Long key : keys) {
				super.insert(readMap.get(key));
			}
			super.setSequence(readSequence);
			System.out.println("로딩 완료!");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			oos.writeObject(super.getInfos());
			oos.writeLong(super.getSequence());
			System.out.println("저장 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}