package StringLeetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class isomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="egg";
		String t="add";
		System.out.println(print(s,t));
	}

	public static boolean print(String s, String t) {
		// TODO Auto-generated method stub
		  if (s.length() != t.length()) return false;

		    HashMap<Character, Character> map = new HashMap<>();
		    HashMap<Character, Character> reverse = new HashMap<>();

		    for (int i = 0; i < s.length(); i++) {

		        char ch1 = s.charAt(i); // from s
		        char ch2 = t.charAt(i); // from t

		        // check s → t
		        if (map.containsKey(ch1)) {
		            if (map.get(ch1) != ch2) {
		                return false; // mapping changed ❌
		            }
		        } else {
		            map.put(ch1, ch2);
		        }

		        // check t → s (important!)
		        if (reverse.containsKey(ch2)) {
		            if (reverse.get(ch2) != ch1) {
		                return false; // conflict ❌
		            }
		        } else {
		            reverse.put(ch2, ch1);
		        }
		    }

		    return true;
	}
}
