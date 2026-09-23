package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class hasAllBinaryCode1461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00110";
		int k=2;
		
		System.out.println(hasallcode(s,k));

	}

	public static boolean hasallcode(String s, int k) {
		// TODO Auto-generated method stub
		int tn=Math.powExact(2, k);
		//System.out.println(tn);
		
		Set<String>set=new HashSet<>();
		
		
		
		for(int i=k;i<=s.length();i++) {
			String st=s.substring(i-k,i);
			set.add(st);
		}
		if(set.size()==tn) {
			return true;
		}
		
		return false;
	}

}
