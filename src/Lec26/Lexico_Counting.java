package Lec26;
import java.util.*;
public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		int n=1000;
		PrintCounting(0,n,list);
		
		System.out.println(list);
	}


	public static void PrintCounting(int curr, int n,List<Integer>list) {
		// TODO Auto-generated method stub
		
		if(curr>n  ) {
			return;
		}
		
			list.add(curr);
		
		//System.out.println(curr);
		
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			
			PrintCounting(curr*10+i,n,list);
		}
	}
}
