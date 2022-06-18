package examspring01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao{
	//시퀀스 역할
	private static long nextId = 0;
	//데이터베이스 역할
	private Map<String, Member> map = new HashMap<String, Member>();
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	// 생성자를 통해 의존 객체를 주입하는 방식
	public Collection<Member> selectAll(){
		return map.values();
	}
	
}
