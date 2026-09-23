package LeetCode_Array;

import java.util.Arrays;

public class Maximize_Greatness_2592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,3,5,2,1,3,1};
		int[]arr= {1,2,3,4};
		
		
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length;i++) {
			//int j=0;
			if(arr[i]>arr[j]) {
				j++;
			}
		}
		System.out.println(j);
		

	}
	
}