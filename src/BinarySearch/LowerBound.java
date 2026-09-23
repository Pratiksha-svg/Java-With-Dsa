package BinarySearch;

public class LowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,3,5,8,8,10,10,11};
		int n=arr.length;
		int target=8;
		lowerbound(arr,n,target);
	}

	public static void lowerbound(int[] arr, int n, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=n-1;
		int ans=n;
		while(lo<=hi) {
			int mid=(hi+lo)/2;
			if(arr[mid]>=target) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(ans);
		
	}

}
