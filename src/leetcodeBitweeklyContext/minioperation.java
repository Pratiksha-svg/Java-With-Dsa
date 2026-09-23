package leetcodeBitweeklyContext;

import java.util.Arrays;

public class minioperation {
	public static void main(String[] args) {
		String s="gf";
		System.out.println( minSwaps(s));
	}
	
	
	 public static int minSwaps(String s) {

	        char[] arr = s.toCharArray();
	        char[] sorted = s.toCharArray();
	        Arrays.sort(sorted);

	        int swap=0;
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i]==sorted[i]) {
	        		if(i==arr.length-1) {
	        			return -1;
	        		}
	        	}
	        }
	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] != sorted[i]) {

	                int j = i + 1;

	                while (arr[j] != sorted[i]) {
	                    j++;
	                }

	                char temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;

	                swap++;
	            }
	        }

	        return swap;
	    }

	  
}
