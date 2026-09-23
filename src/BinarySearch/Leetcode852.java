package BinarySearch;

public class Leetcode852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0};
		
		System.out.println(peakIndexIn_MountainArray(arr));
		//peakIndexIn_MountainArray(arr);
		
	}

	public static int peakIndexIn_MountainArray(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		int lo=1;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid+1]<arr[mid]&& arr[mid-1]<arr[mid]) {
				//System.out.println(mid);
				ans=mid;
				break;
				
			}
			else if(arr[mid]<arr[mid+1]) {
				lo=mid+1;
				
				
			}
			else {
				hi=mid-1;
			}
			
			//System.out.println(mid);
			
		}
		return ans;
		 
	}

}
