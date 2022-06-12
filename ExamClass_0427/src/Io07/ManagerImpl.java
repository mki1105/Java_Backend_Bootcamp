package Io07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ManagerImpl implements Manager{
	private HashMap<Long, Info> infos;
	private static long sequence = 1;
	
	public ManagerImpl() {
		infos = new HashMap<>();
	}
	
	public static void setSequence(long sequence) {
		ManagerImpl.sequence = sequence;
	}
	public static long getSequence() {
		return ManagerImpl.sequence;
	}
	
	public HashMap<Long, Info> getInfos() {
		return infos;
	}
	
	@Override
	public boolean insert(Info info) {
		if(info == null) {
			return false;
		}
		info.setNumber(sequence++);
		infos.put(info.getNumber(), info);
		return true;
	}

	@Override
	public boolean update(Info info) {
		Info searchInfo = infos.get(info.getNumber());
		if(searchInfo != null) {
			infos.put(searchInfo.getNumber(), info);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Long number) {
		return infos.remove(number) != null ? true : false;
	}

	@Override
	public Info selectOne(Long number) {
		return infos.get(number);
	}

	@Override
	public List<Info> selectAll() {
		return new ArrayList<Info>(infos.values());
	}
}