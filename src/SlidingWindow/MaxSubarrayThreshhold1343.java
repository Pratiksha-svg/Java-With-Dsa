package SlidingWindow;

public class MaxSubarrayThreshhold1343 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,13,17,23,29,31,7,5,2,3};
		int k=3;
		int threshold=5;
		System.out.println(num_Of_Subarrays(arr,k,threshold));
	}

	public static int num_Of_Subarrays(int[] arr, int k, int threshold) {
		// TODO Auto-generated method stub
		int sum=0;
		int ans=0;
		int count=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		ans=sum;
		if(ans/k>=threshold) {
			count++;
		}
		
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=sum;
			if(ans/k>=threshold) {
				count++;
			}
		}
		
		
		
		return count;
	}

}
