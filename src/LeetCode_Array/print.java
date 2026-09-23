package LeetCode_Array;

import java.util.HashMap;
import java.util.Map;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbc";
		System.out.println(ans(s));
	}

	public static boolean ans(String s) {
		// TODO Auto-generated method stub
		char arr[]=s.toCharArray();
		
		Map<Character,Integer>map=new HashMap<>();
		
		for(char ch:arr) {
			 map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		//System.out.println(map);
		
		

	    boolean allSame = true;
	    Integer first = null;
		
		for(Integer value:map.values()) {
			//System.out.println(value);
			 if (first == null) {
		            first = value;  // set only once
		        } else if (!first.equals(value)) {
		            allSame = false;
		            return allSame;
		        }
			
			
		}
		return allSame;
	}

}
