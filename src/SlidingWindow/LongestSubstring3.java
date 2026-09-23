package SlidingWindow;

import java.util.ArrayList;

public class LongestSubstring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="abcabc";
	System.out.println(count(s));
	}

	public static int count(String s) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int max=0;
		
		ArrayList<Character> list=new ArrayList<>();
		while(ei<s.length()) {
			if(!list.contains(s.charAt(ei))) {
				list.add(s.charAt(ei));
				ei++;
				max=Math.max(max, list.size());
			}
			else {
				list.remove(Character.valueOf(s.charAt(si)));
				si++;
				
			}
		}
		return max;
		
	}

}
