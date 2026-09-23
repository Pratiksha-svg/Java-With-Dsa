package Assignment;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=a*b;i++){
			if(i%a==0 && i%b==0){
				System.out.println(i);
				break;
			}
			
	}

}
}
