package Lec24;
import java.util.*;
public class Generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String>list=new ArrayList<>();
		Parenthesis(n,0,0,"",list);
		System.out.println(list);
	}

	public  static void Parenthesis(int n, int open, int close, String ans,List<String>list) {
		// TODO Auto-generated method stub
		
		if(open==n && close==n) {
			list.add(ans);
			return;
		}
		
		if(open<n) {
			Parenthesis(n,open+1,close,ans+"(",list);
		}
		if(close<open) {
			Parenthesis(n,open,close+1,ans+")",list);
		}
	}

}
