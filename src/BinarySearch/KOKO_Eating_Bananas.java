package BinarySearch;

public class KOKO_Eating_Bananas {

	
		   public static void main(String[] args) {
		        int arr[] = {3, 6, 7, 11};
		        int h = 8;

		        int ans = eatinghr(arr, h);
		        System.out.println(ans);
		    }

		    
		    public static int eatinghr(int[] arr, int h) {
		        int lo = 1;
		        int hi = maxElement(arr);

		        while (lo < hi) {
		            int mid = lo + (hi - lo) / 2;

		            if (canEat(arr, h, mid)) {
		                hi = mid;  
		            } else {
		                lo = mid + 1; 
		            }
		        }

		        return lo;
		    }

		  
		    public static int maxElement(int[] arr) {
		        int max = 0;
		        for (int i = 0; i < arr.length; i++) {
		            max = Math.max(max, arr[i]);
		        }
		        return max;
		    }

		    // Check function
		    public static boolean canEat(int[] arr, int h, int mid) {
		        int totalhr = 0;

		        for (int i = 0; i < arr.length; i++) {
		            totalhr += (arr[i] + mid - 1) / mid; // ceil
		        }

		        return totalhr <= h;
		
	}
	
	
}
