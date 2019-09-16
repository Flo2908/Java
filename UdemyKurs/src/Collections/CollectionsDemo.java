package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(20);
		list.add(1, 15);
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.get(0));
	
		System.out.println(list.size());
		
		Set<String> set = new HashSet<String>();
		
		set.add("tetsxt");
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("BMW", 120);
		map.put("Audi", 8);

		int i = map.get("BMW");
		System.out.println(i);
	}
	
}
