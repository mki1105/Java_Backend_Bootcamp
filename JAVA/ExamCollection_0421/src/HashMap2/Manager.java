package HashMap2;

import java.util.List;

public interface Manager {
	public abstract boolean insert(Info info);
	public abstract boolean update(Info info);
	public abstract boolean delete(Long number);
	public abstract Info selectOne(Long number);
	public abstract List<Info> selectAll();
}