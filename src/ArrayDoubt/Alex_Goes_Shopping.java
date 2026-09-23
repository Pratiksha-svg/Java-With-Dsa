//https://hack.codingblocks.com/app/contests/2883/1094/problem

package ArrayDoubt;
import java.util.*;
public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []price=new int[n];
		for(int i=0;i<price.length;i++) {
			price[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		while(q-- >0) {
			int A=sc.nextInt(); //alex ke paise
			int k=sc.nextInt(); //alex ke choice
			System.out.println();
			if(ispossible(price,A,k)==true) {
				//System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		
	}
	public static boolean ispossible(int[]price,int A,int k) {
		int count=0;
		for(int i=0;i<price.length;i++) {
			if(A%price[i]==0) {
				count++;
			}
		}
		if(count>=k) {
			return true;
		}
		else {
			return false;
		}
	}

}
