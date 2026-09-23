package SlidingWindow;

import java.util.HashMap;

public class MinimumSubstringWindow76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a";
		String t="b";
		
		System.out.println(SubString(s,t));
	}

	public static String SubString(String s, String t) {
		// TODO Auto-generated method stub
		 if (s.length() < t.length()) {
			 return "";
		 }

	        HashMap<Character, Integer> map = new HashMap<>();

	        
	        for (char c : t.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        int si = 0;
	        int count = 0;
	        int minLen = Integer.MAX_VALUE;
	        int start = 0;

	        for (int ei = 0; ei < s.length(); ei++) {

	            char ch = s.charAt(ei);

	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) - 1);

	                if (map.get(ch) >= 0) {
	                    count++;
	                }
	            }

	           
	            while (count == t.length()) {

	                if (ei - si + 1 < minLen) {
	                    minLen = ei - si + 1;
	                    start = si;
	                }

	                char leftChar = s.charAt(si);

	                if (map.containsKey(leftChar)) {
	                    map.put(leftChar, map.get(leftChar) + 1);

	                    if (map.get(leftChar) > 0) {
	                        count--;
	                    }
	                }

	                si++;
	            }
	        }
	        return s.substring(start,start+minLen);
	}

}
