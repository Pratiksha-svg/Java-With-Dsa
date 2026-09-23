package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Longestabc1358 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabc";
		System.out.println(count(s));
	}

	public static int count(String s) {
		// TODO Auto-generated method stub
		//int ei=0;
		int count =0;
		int lastA=-1;
		int lastB=-1;
		int lastC=-1;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a') {
				lastA=i;
			}
			if(ch=='b') {
				lastB=i;
			}
			if(ch=='c') {
				lastC=i;
			}
			
			if(lastA!=-1&&lastB!=-1&&lastC!=-1) {
				count=count+1+Math.min(lastA,Math.min(lastC, lastB));
			}
			
			
		}
		
		
		return count;
	
		
		
//		for( ei=0;ei<s.length();ei++) {
//			String ans="";
//			for(int j=ei;j<s.length();j++) {
//				ans=ans+s.substring(ei,j+1);
//				System.out.println(ans);
//				
//				if(ans.contains("a")&&ans.contains("b")&&ans.contains("c")) {
//				  max++;
//			}
//			}
			
//		}
//		System.out.println(max);

		
	}

}
