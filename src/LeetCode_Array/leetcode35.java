package LeetCode_Array;

public class leetcode35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,5,6};
		int target=7;
		System.out.println(searchInsertPosition(arr,target));
	}

	private static int searchInsertPosition(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			
			int mid=(hi+lo)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi=mid-1;	
			}
			else {
				lo=mid+1;
			}
			
			
			
		}
		return lo;
	}
	


}
