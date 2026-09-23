package Lec20;
import java.util.*;
public class Kartik_Bhaiya_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String s=sc.next();
		int flip_a=MaxLenOfString(s,'a',k);
		int flip_b=MaxLenOfString(s,'b',k);
		System.out.println(Math.max(flip_a, flip_b));
	}
	
	public static int MaxLenOfString(String s,char ch, int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<s.length()) {
			//growing
			if(s.charAt(ei)==ch) {
				flip++;
			}
			
			//shrinking
			while(flip>k && si<=ei) {
				if(s.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			
			
			
			
			//ans calculate
			ans=Math.max(ei-si+1, ans);
			ei++;
			
		}
		return ans;
	}

}
