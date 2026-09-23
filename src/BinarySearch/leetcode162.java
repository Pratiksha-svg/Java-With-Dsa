package BinarySearch;

public class leetcode162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={2,1,2};
		System.out.println(peek(arr));
	}

	public static int peek(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int lo=1;
		int hi=arr.length-2;
		int ans=0;
		if(arr.length==1 ) {
			return 0;
		}
		else if(arr[0]>arr[1]) {
			return 0;
		}
		else if(arr[arr.length-1]>arr[arr.length-2]) {
			return arr.length-1;
		}
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
