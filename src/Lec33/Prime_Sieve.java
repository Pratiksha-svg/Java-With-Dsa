package Lec33;

import java.util.*;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrimeSieve(100);

	}
	public static  void PrimeSieve(int n) {
		boolean prime[]=new boolean[n+1];
		for(int i=2;i<prime.length;i++) {
			prime[i]=true;
		}
		
		for(int i=2;i*i<prime.length;i++) {
			for(int j=2;j*i<prime.length;j++) {
				prime[i*j]=false;
			}
		}
		
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==true) {
				System.out.print(i+" ");
			}
		}
	}

}
