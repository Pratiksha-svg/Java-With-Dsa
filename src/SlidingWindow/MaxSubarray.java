package SlidingWindow;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,1,3,4,5,6,7,8,9,2,3};
		int k=3;
		Max_Subarray(arr,k);
		
	}

	private static void Max_Subarray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum=0;
		int ans=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		ans=sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=Integer.max(ans, sum);
			
		}
		System.out.println(ans);
	}

}
