package Practice;
import java.util.*;
public class bTod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(BinaryToDecimal(n));
	}
	public static int BinaryToDecimal(int n) {
	int sum=0;
	int mul=1;
	while(n>0) {
		int rem=n%10;
		sum=sum+rem*mul;
		mul=mul*2;
		n=n/10;
	}
	return sum;
}
}
