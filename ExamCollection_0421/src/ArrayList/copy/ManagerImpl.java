package ArrayList.copy;
import java.util.ArrayList;
import java.util.List;

public class ManagerImpl implements Manager{
	private ArrayList<Info> infos;
	private static long sequence = 1;

	public ManagerImpl() {
		infos = new ArrayList<>();
	}
	
	@Override
	public boolean insert(Info info) {
		if(info.getNumber() != 0)
			return false;
		info.setNumber(sequence++);
		infos.add(info);
		return true;
	}

	@Override
	public boolean update(Info info) {
		Info searchInfo = selectOne(info.getNumber());
		if(searchInfo != null) {
			searchInfo.setName(info.getName());
			searchInfo.setBirth(info.getBirth());
			searchInfo.setBloodType(info.getBloodType());
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Long number) { //��ȣ�� ������ ������� �߰�,
		for(int i = 0; i < infos.size(); i++) { //������� �˾ƾ� ������ ������.
			Info tmpInfo = infos.get(i); //info ������ �����ͼ���  ������ �ȵǴϱ�
			if(tmpInfo.getNumber() == number) { //
				infos.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Info selectOne(Long number) {
		for(int i = 0; i < infos.size(); i++) {
			Info tmpInfo = infos.get(i);
			if(number == tmpInfo.getNumber()) {
				return tmpInfo;
			}
		}
		return null;
	}

	@Override
	public List<Info> selectAll() {
		return infos;
	}
	
	
	
}