package Lec18;
import java.util.*;
public class Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="81615";
		System.out.println(PrintSubstring(s));
	}
	public static int  PrintSubstring(String s) {
		int count =0;
		boolean []visited=new boolean[s.length()];
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				String s1=s.substring(i,j);
				//Integer.parseInt(s1);num wali string ko integer me convert karna ho to
				
				if(IsCbNumber(Long.parseLong(s1))==true && Isvalid(visited,i,j)==true) {
					count++;
					// i to j-1 --> mark ye cb number bana chuka hai
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return count;
	}
	
	public static boolean Isvalid(boolean[] visited,int i,int j) {
		for(;i<j;i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean IsCbNumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int arr[]= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
