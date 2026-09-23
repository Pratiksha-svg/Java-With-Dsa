package LeetCode_Array;

import java.util.Arrays;

public class Leetcode169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,2,1,1,1,2,2};
		System.out.println(majority_Element(arr));
		
		
	}
	public static int majority_Element(int arr[]) {
		Arrays.sort(arr);
		int n=arr.length;
		n=n/2;
		return (arr[n]);
	}

}
