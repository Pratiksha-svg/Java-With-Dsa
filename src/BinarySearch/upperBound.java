package BinarySearch;

public class upperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'c','f','j'};
		int n=arr.length;
		 char target='c';
		Upperbound(arr,n,target);
	}

	public static void Upperbound(char[] arr, int n, char target) {
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
		System.out.println(arr[ans]);
		
	}
}
