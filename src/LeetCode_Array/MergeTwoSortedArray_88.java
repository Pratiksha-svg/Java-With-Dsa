package LeetCode_Array;

public class MergeTwoSortedArray_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,0,0,0 };
		int[] arr2 = { 2,5,6};
		int m=3;
		int n=3;
		
		MergeTwoSortedArray(arr1,arr2,m,n);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	
	public static void MergeTwoSortedArray(int[]arr1,int[]arr2,int m,int n) {
//		int ans[]=new int[m+n];
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		while(i>=0 && j>=0 ) {
			
			
				if(arr1[i]>arr2[j]) {
					arr1[k]=arr1[i];
					i--;
					k--;
					
				}
				
				else {
					arr1[k]=arr2[j];
					j--;
					k--;
				}
			
			
			}
	
				
		

			while(i>=0  &&k>=0) {
				arr1[k]=arr1[i];
				i--;
				k--;
			}
			while(j>=0  &&k>=0) {
				arr1[k]=arr2[j];
				j--;
				k--;
			}
		
		
		
	
	}

}
