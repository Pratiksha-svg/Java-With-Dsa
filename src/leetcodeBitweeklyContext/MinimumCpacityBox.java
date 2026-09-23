package leetcodeBitweeklyContext;

public class MinimumCpacityBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,7};
		int k=2;
	System.out.println(	print(arr,k));
	}

	public static int print(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int min=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=k  && arr[i] < min) {
				min=arr[i];
				index=i;
			}
		}
		return index;
		}
	
		
		
		
	

}
