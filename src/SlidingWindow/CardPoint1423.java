package SlidingWindow;

public class CardPoint1423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,7,7,9,7,7,9};
		int k=7;
		System.out.println(cardPoint(arr,k));
	}

	public static int cardPoint(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int si=0;
		int ei=arr.length-1;
		int sum=0;
		int max=0;
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		max=sum;
		
		for(int i=k-1;i>=0;i--) {
			sum-=arr[i];
			sum+=arr[ei];
			ei--;
			max=Math.max(max, sum);
			
		}
		
		return max;
		
		
		
		
		}
	
	
}
