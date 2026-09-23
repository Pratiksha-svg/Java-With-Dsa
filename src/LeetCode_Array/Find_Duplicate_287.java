package LeetCode_Array;

import java.util.Arrays;

public class Find_Duplicate_287 {
	public static void main(String[] args) {
		int arr[]= {3,1,3,4,2};
		Arrays.sort(arr);
		System.out.println(duplicate(arr));
		
	}
	public static int duplicate(int arr[]) {
		int num = 0;
		for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==arr[i+1]) {
					num=arr[i];
				
			}
		}
		return num;
	}
	
}



