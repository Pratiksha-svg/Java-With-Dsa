package Practice;
import java.util.*;
public class DecimalToOcatl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(DecimalToOcatl(n));
	}

	public static int DecimalToOcatl(int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%8;
			sum=sum+rem*mul;
			mul=mul*10;
			n=n/8;
		}
		return sum;
	}
}
