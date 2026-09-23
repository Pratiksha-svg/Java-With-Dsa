package LeetCode_Array;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		int len=Remove_Duplicate(arr);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int Remove_Duplicate(int[] arr) {
		if(arr.length==0)
			return 0;
		int j=1;
		for(int i=1;i<arr.length;i++) {
			if( arr[i]!=arr[i-1]){
				arr[j]=arr[i];
				j++;
			}
		}
		return j;
	}
	

}
