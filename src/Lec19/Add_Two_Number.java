package Lec19;
import java.util.*;
public class Add_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int []arr1= {2,3,4,6};
//		int []arr2= {8,3,5,3,4,7,6};
		
		int []arr1= {6,7,8,9};
		int []arr2= {9,5,3,2,5};
		Add(arr1,arr2);
		
	}
	public static void Add(int []arr1,int []arr2) {
		ArrayList<Integer>ll=new ArrayList<>();
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		while(i>=0 &&j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			ll.add(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum=arr1[i]+carry;
			ll.add(sum%10);
			carry=sum/10;
			i--;
			
		}
		while(j>=0) {
			int sum=arr2[j]+carry;
			ll.add(sum%10);
			carry=sum/10;
			j--;
			
		}
		if(carry>0) {
			ll.add(carry);
		}
		
		for(int k=ll.size()-1;k>=0;k--) {
			System.out.print(ll.get(k)+" ");
		}
	}
	

}
