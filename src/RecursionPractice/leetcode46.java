package RecursionPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>list1=new ArrayList<>();
		int arr[]={1,2,2};
		boolean []used=new boolean[arr.length];
		Permutation(arr,"",used,list,list1,0);
		System.out.println(list1);
	}

	private static void Permutation(int[] arr, String ans,boolean []used,List<Integer>list,List<List<Integer>>list1,int idx) {
		// TODO Auto-generated method stub
		if(list.size()==arr.length) {
			//System.out.println(ans)
			
			list1.add(new ArrayList<Integer>(list));
			//System.out.println(list);
			return;
		}
			for(int i=idx;i<arr.length;i++) {
			if(used[i]) continue;
			used[i]=true;
			int ch=arr[i];
			
			list.add(ch);
			
			
			Permutation(arr,ans+ch,used,list,list1,idx);
			used[i]=false;
			list.remove(list.size()-1);
			
			
			
		}
		
	}

}
