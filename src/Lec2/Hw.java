package Lec2;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=2*n-2;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			System.out.println();
			space -= 2;
			star++;
		}
	}

}
