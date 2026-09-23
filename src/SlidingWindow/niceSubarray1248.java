package SlidingWindow;

public class niceSubarray1248 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,1,1};
		int k=3;
		
		System.out.println(subarrtotal(arr,k));

		
	}
	public static int subarrtotal(int[]arr,int k){
		int  a=(subarr(arr,k));
		int b=(subarr(arr,k-1));
		return a-b;
	}

	public static int subarr(int[] arr,int k) {
		// TODO Auto-generated method stub
		int sum=0;
		int ei=0;
		int si=0;
		int total=0;
		if(k<0) {
			return 0;
		}
		while(ei<arr.length) {
			sum=sum+(arr[ei]%2);
			while(sum>k){
				sum=sum-(arr[si]%2);
				si++;
			}
			
			
				total=total+(ei-si+1);
			
			
			ei++;
		}
		
		return total;
				
	}

}
