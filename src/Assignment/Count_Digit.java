//https://hack.codingblocks.com/app/contests/5038/64/problem

//Take the following as input.
//A number
//A digit
//Write a function that returns the number of times digit is found in the number. Print the value returned.
//
//
//Input Format
//Integer (A number) Integer (A digit)
//
//
//Constraints
//0 <= N <= 1000000000 0 <= Digit <= 9
//
//
//Output Format
//Integer (count of times digit occurs in the number)

package Assignment;
import java.util.*;
public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(num(n,d));
    }

    public static int num(int n,int d){
        int count=0;
        while(n>0){
            int r=n%10;
            if(d==r){
                count++;
            }
            n/=10;
        }
        return count;
    }

	

}
