package Lec8;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Is_Armstrong_Number(n));
		
	}
	
	public static int Countdigit(int n) {
		int count=0;
		
		while(n>0) {
			n/=10;
		    count++;
		}
		return count;
	}
	
	public static boolean Is_Armstrong_Number(int n) {
		int d=Countdigit(n);
		int sum=0;
		int p=n;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem,d));  //Typecasting
			n=n/10;
		}
		if(sum==p) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
