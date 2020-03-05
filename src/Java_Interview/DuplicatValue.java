package Java_Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatValue {

	public static void main(String[] args) {
		
		String lang[] = {"Java","C++","Python","Java"};
	
		// Compare each element
		for(int i=0; i<lang.length;i++) {
			for(int j=i+1;j<lang.length;j++) {
				if(lang[i].equals(lang[j])) {
					System.out.println("By Comparing elements======> "+lang[i]);
				}
			}
		}
		
		//2. using Hashset

		Set<String> st = new HashSet<>();
		for(String ele:lang) {
			if(st.add(ele)==false){
				System.out.println("By using Hashset=====> "+ele);
			}
		}
		
		//3. Using HashMap
		
		Map<String, String> mp = new HashMap<>();
		
		for(String s:lang) {
		if(mp.containsKey(s)) {
			System.out.println("By using HashMap=====> "+s);
		}	
		mp.put(s, s);
		}
		

	}
}
