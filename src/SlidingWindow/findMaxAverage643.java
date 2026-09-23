package SlidingWindow;

public class findMaxAverage643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(maxAvg(arr,4));
	}

	public static double maxAvg(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum=0;
		double ans=0;
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		
		ans=sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=Integer.max((int) ans, sum);
		}
		
		return (ans/k);
		}

}
