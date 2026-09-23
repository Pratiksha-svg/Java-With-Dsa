package BinarySearch;

public class Searchrange_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {};
		int n=arr.length;
		int brr[]=range(arr,n,6);
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
	}

	public static int[] range(int[] arr,int n,int target) {
		// TODO Auto-generated method stub
		//int brr[]=new int[2];
		int lb=lowerbound(arr,n,target);
		if(lb==n ||arr[lb]!=target) {
			
			return new int []{-1,-1};
		}
		//int up=Upperbound(arr,n,target);
		return new int[] {lb,Upperbound(arr,n,target)-1};
		
	}
	
	//lowerbound
	
	public static int lowerbound(int[] arr, int n, int target) {
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
		return ans;
		
	}
	
	//upperbound
	
	public static int Upperbound(int[] arr, int n, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=n-1;
		int ans=n;
		while(lo<=hi) {
			int mid=(hi+lo)/2;
			if(arr[mid]>target) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
		
	}

}
