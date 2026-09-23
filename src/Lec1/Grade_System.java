package Lec1;
import java.util.*;
public class Grade_System {

	public static void main(String[] args) {
		// TODO Auto-genesysorated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m>=75) {
			System.out.println("A");
		}
		else if(m>=65 && m<75) {
			System.out.println("B");
		}
		else if(m>=55 && m<65) {
			System.out.println("C");
		}
		else if(m>=45 && m<55){
			System.out.println("D");
		}
		else {
			System.out.println("fail");
		}
	}

}
