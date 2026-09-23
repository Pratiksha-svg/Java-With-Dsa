package LeetCode_Array;

public class leetcode_31 {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int n=arr.length;
		permutation(arr,"",n);
	}
	
	public static void permutation(int []arr,String  ans,int n) {
		
		if(arr.length==n) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			int ch=arr[i];
		//	permutation(arr,""+arr[i]);
			//permutation(arr,"");
			
			
		}
	}
}
