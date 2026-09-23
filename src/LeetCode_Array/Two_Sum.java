package LeetCode_Array;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,3};
		int target=6;
		int ans[]=Two_Sum(arr,target);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}
	public static int [] Two_Sum(int arr[],int target) {
		//int sum=0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]+arr[j]==target) {
				return new int[] {i,j};
			}
			
		}
		return null;
}
	}
