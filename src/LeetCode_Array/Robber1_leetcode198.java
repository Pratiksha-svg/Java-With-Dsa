package LeetCode_Array;

public class Robber1_leetcode198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,2};
		//System.out.println(Robber(arr));
		Robber(arr);
	}

	public static void Robber(int[] arr) {
		// TODO Auto-generated method stub
				int sum=0;
	for(int i=0;i<arr.length;i++) {
		int ans=0;

		int j=i;
		for( j=i;j<arr.length;j=j+2) {
			ans=ans+arr[j];
			
		}
		
		for(  j=j-2;j>=0;j=j-2) {
			ans=ans+arr[j];
			
		}
		
		
		
		sum=sum=Integer.max(ans, sum);
	}
	
	System.out.println(sum);
	
	
	}

}
