package Practice;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,-7,11,-1,3};
		 MaxSubarray(arr);
		

	}
	
	public static void MaxSubarray(int arr[]) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				 ans=Math.max(sum, ans);
			}
			
		}
		System.out.println(ans);
	}

}
