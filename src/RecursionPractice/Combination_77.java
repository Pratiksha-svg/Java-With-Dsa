package RecursionPractice;

import java.util.*;

public class Combination_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>list1=new ArrayList<>();
		
		int n=1;
		int num=1;
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=num;
			num++;
		}
		 boolean[]arr=new boolean[n];
	
		
		
	int k=1;
	Combination(nums,arr,k,0,0,list,list1);
	
	System.out.println(list1);

	}

	public static void Combination(int[] nums,boolean[] arr, int tn, int npsf,int idx,List<Integer> list,List<List<Integer>>list1) {
		// TODO Auto-generated method stub
		if(tn==npsf) {
			//System.out.println(list);
			list1.add(new ArrayList<Integer>(list));
			
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(arr[i]==false) {
				arr[i]=true;
				list.add(nums[i]);
				Combination(nums,arr,tn,npsf+1,i+1,list,list1);
				arr[i]=false;
				list.remove(list.size()-1);
			}
		}
	}

	

}
