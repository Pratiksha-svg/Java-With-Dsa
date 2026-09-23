package LeetCode_Array;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,0,1};
		System.out.println(MissingNumber(arr));
		
	}
	public static int MissingNumber(int[]arr) {
		int sum=0;
		int n=arr.length;
		int s=(n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int a=s-sum;
		return a;
	}
	
	
	
}
