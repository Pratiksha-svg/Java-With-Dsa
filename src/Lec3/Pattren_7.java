package Lec3;

import java.util.Scanner;

public class Pattren_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-2;
		
		while(row<=n) {
			
			
			//star
			if(row==1 || row==7) {
				int j=1;
				while(j<=n) {
					System.out.print("* ");
					j++;
				}
			}
			else {
				System.out.print("* ");
			}
			
			//space
			int i=1;
			
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			if(row==1 || row==7) {
				System.out.print("");
			}
			else
			   System.out.print("* ");
			
			row++;
			System.out.println();
			
		}
		
			
			
			
		

	}

}
