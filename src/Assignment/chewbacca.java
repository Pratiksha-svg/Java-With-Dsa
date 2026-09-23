//Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.
//
//Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
//
//
//Input Format
//The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.




package Assignment;
import java.util.*;
public class chewbacca {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        long n=sc.nextLong();


	         long sum=0;
	        long mul=1;
	        while(n>0){
	        long d = n%10;
	           if(d!=9 && d>=5){
	               d=9-d;
	           }

	           sum=sum+d*mul;
	           mul*=10;
	           n/=10;
	           
	}
	        System.out.println(sum);
	
		
	}
}


