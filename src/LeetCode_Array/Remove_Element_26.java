package LeetCode_Array;

public class Remove_Element_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,0,4,3,1,3,5,3,3};
		int val=3;
		int dub=Remove_Element(arr,val);
		for(int i=0;i<dub;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int Remove_Element(int []arr,int val) {

		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[j]=arr[i];
				j++;
			}
			
		}
		return j;
		
		
	}

}
