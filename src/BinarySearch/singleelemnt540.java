package BinarySearch;

public class singleelemnt540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,3,7,7,10,11,11};
		System.out.println(singleElement(arr));
	}

	public static int singleElement(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		if(arr[0]!=arr[1]) {
			return arr[0];
		}
		if(arr[n-1]!=arr[n-2]) {
			return arr[n-1];
		}
		
		int lo=1;
		int hi=n-2;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) {
				return arr[mid];
			}
			if((mid%2==1 && arr[mid-1]==arr[mid])|| (mid%2==0 && arr[mid]==arr[mid+1])) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return -1;
	}

}
