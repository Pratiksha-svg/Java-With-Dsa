package Lec6;

import java.util.Scanner;

public class Char_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//ch =sc.next().charAt(0);
				
		char ch='a';
		char ch1='b';
		char ch2=';';
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println((int)(ch));
		System.out.println((int)(ch1));
		System.out.println((int)(ch2));
		System.out.println(ch+ch1);

		
		
		
		int x=19;
		x++; //(int)(x+1)
		System.out.println(x);
		
		ch++; // always implicit typecasting  ch= (char)(ch+1) 
		System.out.println(ch);
		
		
		ch=(char)(ch+1);
		System.out.println(ch);
		
		ch+=1;//ch=(char)(ch+1);//implicit
		
	}

}
