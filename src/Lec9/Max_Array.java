package Lec9;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,46,1,51,7,45,50};
		System.out.println(max1(arr));
		System.out.println(max2(arr));
		
	}
	
	public static int max1(int [] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	
	
	//2 way max
	public static int max2(int [] arr) {
		
		int max=Integer.MIN_VALUE;//-2^31
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max=arr[i];
			}
			max=Math.max(max, arr[i]);
			
		}
		
		return max;
		
	}

}

