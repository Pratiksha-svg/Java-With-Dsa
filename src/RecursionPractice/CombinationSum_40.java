package RecursionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum_40 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>list1=new ArrayList<>();
		int arr[]= {10,1,2,7,6,1,5};
		
		int amount =8;
		Arrays.sort(arr);
		
		Combination(arr,amount,0,list,list1);
		System.out.println(list1);
	}

	public static void Combination(int[] arr, int amount, int idx,List<Integer>list,List<List<Integer>>list1) {
		Set<Integer>set=new HashSet<>();
		// TODO Auto-generated method stub
		if(amount==0) {
			
			//System.out.println(list);
			
			list1.add(new ArrayList<Integer>(list));
			
			return;
		}
		if(amount<0) {
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(i>idx && arr[i]==arr[i-1]) continue;
			list.add(arr[i]);
			Combination(arr,amount-arr[i],i+1,list,list1);
			list.remove(list.size()-1);
		}
			
		

	}
}






