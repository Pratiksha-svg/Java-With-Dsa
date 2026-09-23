package LeetCode_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindDissappearNumber448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,7,8,2,3,1};
		ArrayList<Integer>list=new ArrayList<>();
		Arrays.sort(arr);
		System.out.println(FindDisapper(arr,list));
	}



	public static ArrayList<Integer> FindDisapper(int[] arr,ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		HashSet<Integer>set=new HashSet<>();
		for(int x:arr) {
			set.add(x);
		}
		//System.out.println(set);
		
		//int num=1;
		for(int num=1;num<=arr.length;num++) {
			if(!set.contains(num)) {
				list.add(num);
			
			}
			//num++;
			
					}
		
		return list;
	}

}
