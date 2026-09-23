package LeetCode_Array;

public class runningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int sarr[]=new int[arr.length];
		Sum(arr,sarr);
		for(int i=0;i<sarr.length;i++) {
			System.out.print(sarr[i]+" ");
		}
	}

	private static int[] Sum(int[] arr, int[] sarr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			sarr[i]=sum;
		}
		return sarr;
	}

}
