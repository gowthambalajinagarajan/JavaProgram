package Program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,3,1,2,5,6,7,3};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int c:a) {
			if(map.containsKey(c)) {
				int x=map.get(c);
				map.put(c,x+1);
			}
			else {
				map.put(c,1);
			}
		}
		Set<Entry<Integer,Integer>> s=map.entrySet();
		for(Entry<Integer,Integer> e:s) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		System.out.println(map);
	}

}
