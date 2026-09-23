package StringLeetcode;

import java.util.ArrayList;

import java.util.List;

public class Fizzfuzz412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		List<String>list=new ArrayList<>();
		System.out.println(print(n,list));
	}

	public static List<String> print(int n, List<String>list) {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i<n) {
			
			if((i+1)%3==0 && (i+1)%5==0) {
				list.add("FizzBuzz");
				
			}
			else if((i+1)%3==0) {
				list.add("Fizz");
				
			}
			else if((i+1)%5==0) {
				list.add("Buzz");
				
			}
			else {
				list.add(String.valueOf(i+1));
				
			}
			i++;
		}
		return list;
	}

}
