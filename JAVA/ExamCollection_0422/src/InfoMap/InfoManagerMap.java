package InfoMap;

import java.util.Collection;
import java.util.HashMap;

public class InfoManagerMap implements Inter {

	HashMap<Integer, Info> hs = new HashMap<>();// <Key, value>

	InfoManagerMap() {
	}

	InfoManagerMap(int id, String name, int age) {

	}

	// ���
	@Override
	public boolean addinfo(Info info) { // info��
		if (info == null) {
			return false;
		}
		hs.put(info.getId(), info);// hs.put(key, value)
		return true;
	}

	// ���
	
	@Override
	public Collection<Info> infoList() {
		return hs.values();

	}

	// �˻�
	@Override
	public Info serchinfo(String name) {
		for (Integer tmp : hs.keySet()) {
			if (hs.get(tmp).getName().equals(name)) {
				return hs.get(tmp);
			}
		}
		return null;
	}

	// ����
	@Override
	public boolean edit(int id, String name, int age) {
		for (Integer tmp : hs.keySet()) {
			if (hs.containsKey(id)) {
				hs.get(id).setName(name);
				hs.get(id).setAge(age);
				return true;
			}
		}
		return false;
	}

	// ����
	@Override
	public boolean delete(int id) {
		for (Integer tmp : hs.keySet()) {
			if (hs.containsKey(id)) {
				hs.remove(id);
				return true;
			}
		}
		return false;
	}

}
