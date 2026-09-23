package Lec43;

import java.util.Iterator;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder();//16
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("hellohelloelloee");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("a");
		System.out.println(sb.capacity());
		//System.out.println(sb.reverse());
		//System.out.println(sb.delete(1, 2));
		
		
		//stringbuilder ko string
		
		String s=sb.toString();
		
		//string ko stringbuilder
		
		StringBuilder sb1=new StringBuilder(s);
		
		
		for (int i = 0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i)+" ");
		}
		System.out.println();
	}
	

}
