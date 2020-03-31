package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashTable {
	
	
		public static List<List<String>> groupAnagrams(String[] strs) {
	
			HashMap<String, List<String>> hm = new LinkedHashMap<String, List<String>>();
			
			for(String a : strs) {
				char[] aArr = a.toCharArray();
				Arrays.sort(aArr);
				String key = String.valueOf(aArr);
				if(hm.get(key)==null) {
					hm.put(key, new ArrayList<String>());
					hm.get(key).add(a);
				}else {
					List<String> value = hm.get(key);
					value.add(a);
					hm.remove(key);
					hm.put(key, value);
				}
				
			}
			
			System.out.println(hm);
	
	
				List<List<String>> answer = new ArrayList<List<String>>();
				
				for(Entry<String, List<String>> a : hm.entrySet()) {
					answer.add(a.getValue());
				}
				
				return answer;
        
			}
		
		public static void main(String[] args) {
			String[] data = {"eat", "tea", "tan", "ate", "nat", "bat"};
			groupAnagrams(data);
		}
	
}
