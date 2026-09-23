package LeetCode_Array;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,15};
		
		System.out.println(citation(arr));
	}

	 public static int citation(int[] arr) {
	        Arrays.sort(arr); // sort ascending
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            int h = n - i;  // possible H-index

	            if (arr[i] >= h) {
	                return h;
	            }
	        }
	        return 0;
	    }

}
