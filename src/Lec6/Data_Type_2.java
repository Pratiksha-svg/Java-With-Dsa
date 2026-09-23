package Lec6;
import java.util.*;
public class Data_Type_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x=5;
		byte x1=-5;
		int i=428;
		byte b=10;
		long l=10;
		short s=10;
		b=(byte)(i); //explicit type casting
		System.out.println(b);
		
		
		int a=90;
		int b1=7;
		a=b1; //inplicit
		System.out.println(a);
		
		
	//long
		long l1=100000000000l;
		Scanner sc=new Scanner(System.in);
		l1=sc.nextLong();
		
	}

}
