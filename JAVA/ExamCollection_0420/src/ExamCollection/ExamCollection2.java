package ExamCollection;

import java.util.HashSet;
import java.util.Iterator;

public class ExamCollection2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		//System.out.println(hs.add(100));
		//System.out.println(hs.add(500));
		System.out.println(hs.add("String"));
		//System.out.println(hs.add(500));
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String o = it.next();
			System.out.println(o);
		}
	}
}