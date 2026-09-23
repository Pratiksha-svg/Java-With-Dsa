package LeetCode_Array;

public class leetcode121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,5,3,6,4};
		System.out.println(profit(arr));
		//profit(arr);
	}

	 public static int  profit(int[] arr) {
			
			// TODO Auto-generated method stub
			int max=0;
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					int sum=arr[j]-arr[i];
					
					max=Integer.max(max, sum);
					
				}
			}
			if(max>0) {
				return max;
			}
			
			return 0;
			
		
	}
	
}
