package InfoMap;

import java.util.Collection;

public interface Inter {
	public abstract boolean addinfo(Info info);

	public abstract Info serchinfo(String name);

	public abstract boolean delete(int id);

	public abstract boolean edit(int id, String name, int age);

	public abstract Collection<Info> infoList();
}
