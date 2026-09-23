package Practice;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(DecimalToBinary(n));
	}
	public static int DecimalToBinary(int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%2;
			 sum=sum+rem*mul;
			mul=mul*10;
			n=n/2;
		}
		return sum;
	}

}
