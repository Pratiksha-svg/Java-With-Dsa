package Lec34;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si=10;
		int ei=90;
		
		randomnumber(si,ei);
	}
	public static void randomnumber(int si,int ei) {
		Random ran=new Random();
		int lo=si;
		int hi=ei;
		for(int i=0;i<10;i++) {
			int rn=ran.nextInt(hi-lo+1)+lo;
			System.out.print(rn+" ");
		}
	}

}
