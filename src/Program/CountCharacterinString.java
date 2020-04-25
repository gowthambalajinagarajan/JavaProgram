package Program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacterinString {

	public static void main(String[] args) {
		String a="Hello";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=a.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				int x=map.get(c);
				map.put(c,x+1);
			}
			else {
				map.put(c,1);
			}
		}
		Set<Entry<Character,Integer>> s=map.entrySet();
		for(Entry<Character, Integer> entry:s) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
