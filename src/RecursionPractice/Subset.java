package RecursionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		int arr[]= {1,2,2};
		Arrays.sort(arr);
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>list1=new ArrayList<>();
		Print(arr,0,list,list1);
		System.out.println(list1);
	}

	private static void Print(int[] arr,int idx,List<Integer>list,List<List<Integer>>list1) {
		int n=arr.length;
		if(idx==n) {
			
			//System.out.println(list);
			
			list1.add(new ArrayList<>(list));
			
		}
		if(idx>=arr.length) {
			return;
		}
		
	
			int ch=arr[idx];
			
				Print(arr,idx+1,list,list1);
				
			
		
			list.add(ch);
			if(idx>0 && arr[idx]==arr[idx-1]) {
			Print(arr,idx+1,list,list1);
			}
			list.remove(list.size()-1);
			
		
		
	}

}
