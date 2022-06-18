package ExamClass_0415;

public class InfoManager {
	private Info[] infos;
	private int index;
	private int sequence;
	public static int DEFAULT_SIZE = 5;
	public static int START = 1;
	
	private void init(int size, int start) {
		infos = new Info[size];
		sequence = START;
		index = 0;
	}
	
	private boolean isIndexAvailable(int index) {
		return index < this.index && infos[index] != null;
	}
	
	public InfoManager() {
		this.init(DEFAULT_SIZE, START);
	}
	
	public InfoManager(int size, int start) {
		this.init(size, start);
	}
	
	// 등록
	public boolean insertInfo(Info info) {
		boolean result = false;
		if(!(index == infos.length)) {
			infos[index++] = new Info(sequence++, info.getName(), info.getAge());
			result = true;
		}
		return result;
	}
	
	public boolean insertInfo(String name, int age) {
		return this.insertInfo(new Info(-1, name, age));
	}
	// 목록보기
	public Info[] selectAll() {
		Info[] result = new Info[index];
		for(int i = 0; i < index; i++) {
			result[i] = new Info(infos[i]); //이해 안감.
		}
		return result;
	}
	
	// 검색하기
	public int indexOfSearchInfoName(int start, String name) {
		int result = -1;
		if(!isIndexAvailable(start)) {
			return result;
		}
		for(int i = start; i < index; i++) {
			if(infos[i].getName().equals(name)) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public int indexOfSearchInfoName(String name) {
		return indexOfSearchInfoName(0, name);
	}
	
	public Info searchInfo(int index) {
		Info result = null;
		if(isIndexAvailable(index)) {
			result = new Info(infos[index]);
		}
		return result;
	}
	
	public boolean editInfo(Info info) {
		boolean result = false;
		int searchIdx = indexOfSearchInfoName(info.getName());
		if(searchIdx != -1) {
			infos[searchIdx] = new Info(infos[searchIdx].getNumber(), info.getName(), info.getAge());
			result = true;
		}
		return result;
	}
	
	public boolean removeInfo(String name) {
		int removeIdx = indexOfSearchInfoName(name);
		if(removeIdx == -1) 
			return false;
		infos[removeIdx] = null;
		trim();
		infos[--index] = null;
		return true;
	}
	
	private void trim() {
		for(int i = 0; i < index; i++) {
			if(infos[i] == null) {
				for(int j = i+1; j < index; j++) {
					infos[j-1] = infos[j];
				}
				break;
			}
		}
	}
	
	public void removeAll() {
		//1. 배열을 초기화
		//this.init(DEFAULT_SIZE, START);
		
		//2. 배열에 Info객체를 참조하는 값을 모두 null로 변경
		for(int i = 0; i < infos.length; i++) {
			infos[i] = null;
		}
		index = 0;
	}
}
