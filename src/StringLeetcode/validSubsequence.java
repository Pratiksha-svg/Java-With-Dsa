package StringLeetcode;

import java.util.ArrayList;
import java.util.List;



public class validSubsequence {
	public static void main(String[] args) {
		
		String s = "abc";
		String ques="abc";
		System.out.println(isValid(s,ques));
		
	}

	
	
	public static boolean isValid(String s, String ques) {
	    int i = 0; 
	    int j = 0; 

	    while (i < s.length() && j < ques.length()) {
	        if (s.charAt(i) == ques.charAt(j)) {
	            i++;
	        }
	        j++;
	    }

	    return i == s.length();
	}
}
