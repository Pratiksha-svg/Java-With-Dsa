package RecursionPractice;

import java.util.*;

public class Subset_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2};
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>list1=new ArrayList<>();
		Print(arr,"",0,list,list1);
		System.out.println(list1);
	}

	private static void Print(int[] arr, String ans,int idx,List<Integer>list,List<List<Integer>>list1) {
		int n=arr.length;
		if(idx==arr.length) {
			System.out.println(ans);
			System.out.println(list);
			list1.add(new ArrayList<>(list));
		}
		if(idx>=arr.length) {
			return;
		}
			int ch=arr[idx];
			
			Print(arr,ans,idx+1,list,list1);
			list.add(ch);
			Print(arr,ans+ch,idx+1,list,list1);
			list.remove(list.size()-1);
			
		
		
	}
}
			
				
				
				
			
	

