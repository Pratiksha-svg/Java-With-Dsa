package LeetCode_Array;

public class Move_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,3,12};
		MoveZeros(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void  MoveZeros(int []arr) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					count++;
				}
		}
			
		for(int j=0;j<count;j++) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==0) {
				arr[i-1]=arr[i];
				arr[i]=0;
			}
		}
		}
	}
	
	

}
