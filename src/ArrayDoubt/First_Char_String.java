package ArrayDoubt;
import java.util.*;
public class First_Char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		FirstChar( s);
		
	}
	
	public static void FirstChar(String s) {
		
		String [] A=s.split(" ");
		
		for(String p:A) {
			System.out.println(p.charAt(0));
		}
	}

}
