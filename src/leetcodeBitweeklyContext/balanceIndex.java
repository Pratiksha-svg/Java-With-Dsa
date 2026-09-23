package leetcodeBitweeklyContext;

import java.math.BigInteger;

public class balanceIndex {
	public static void main(String[] args) {
		int arr[]= {999,818,984,995,841,822,984,978,960,997,896,926,759,961,1000,562,1,1,1,87,4,1,40};
		System.out.println(print(arr));
	}

	public static int print(int[] arr) {
	    int n = arr.length;

	    int left = 0;

	    for (int i = 0; i < n; i++) {

	        long right = 1;

	        for (int j = i + 1; j < n; j++) {
	            right *= arr[j];

	            if (right > left) {
	            	break;
	            }
	        }

	        if (left == right) {
	        	return i;
	        }

	        left += arr[i];
	    }

	    return -1;
	}
}
