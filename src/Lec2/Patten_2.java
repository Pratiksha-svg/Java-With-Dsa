package Lec2;
import java.util.*;
public class Patten_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// next row prep
			row++;
			star++;
			System.out.println();
		}
		
		
	}
		

}
