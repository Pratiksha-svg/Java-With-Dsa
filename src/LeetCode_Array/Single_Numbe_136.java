package LeetCode_Array;

public class Single_Numbe_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,2,1,2,1};
		System.out.println(Single_Number(arr));
	}

	public static int Single_Number(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count ++;
				}
			}
			if(count==1) {
				return  arr[i];
				
			}
			
			
		}
		
		return -1;
	}
}
