package BinarySearch;

public class SearchinRotateSortedArray33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2};
		int target=3;
		int n=arr.length;
		System.out.println(print(arr,n,target));
	}

	public static int print(int[] arr, int n, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=n-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			
			if(arr[lo]<=arr[mid]) {
				if(arr[lo]<=target && target<=arr[mid]) {
					hi=mid-1;
				}
				else {
					lo=mid+1;
				}
			}
			else {
				if(arr[mid]<=target && target<=arr[hi]) {
					lo=mid+1;
				}
				else {
					hi=mid-1;
				}
			}
		}
		return -1;
	}

}
