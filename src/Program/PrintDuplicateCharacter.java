package Program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateCharacter {
	public static void main(String[] args) {
		String a="Java Program";
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String  b[]=a.split("");
		for(String c:b) {
			System.out.println(c);
			if(map.containsKey(c)) {
				int x=map.get(c);
				map.put(c,x+1);
			}
			else {
				map.put(c,1);
			}
		}
		Set<Entry<String,Integer>> s=map.entrySet();
		for(Entry<String,Integer> e:s) {
			if(e.getValue()>=2) {
				System.out.println(e.getKey());
			}
		}
		System.out.println(map);
	}

}
