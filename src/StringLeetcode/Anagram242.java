package StringLeetcode;
import java.util.*;
public class Anagram242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character>sSet=new ArrayList<>();
		ArrayList<Character>tSet=new ArrayList<>();
		String  s = "anagram", t = "nagaram";
		System.out.println(Anagram(s,t,sSet,tSet));
		

	}
	public static boolean Anagram(String s,String t,ArrayList<Character>sSet,ArrayList<Character>tSet) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			sSet.add(ch);
			
		}
		
		Collections.sort(sSet);
		//System.out.println(sSet);
		
		for(int j=0;j<t.length();j++) {
			char ch=t.charAt(j);
			tSet.add(ch);
			
		}
		
		Collections.sort(tSet);
		//System.out.println(tSet);
		
		if(sSet.equals(tSet)) {
			return true;
		}
		return false;
		
	}
	

}
