package Lec9;

public class SecondMax_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {51,2,52,3,46,1,7,45,50};
		SecondMax(arr);
	}
	public static void SecondMax(int []arr) {
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max2=max;
				max=arr[i];
			}
			else if(arr[i]<max && arr[i]>max2) {
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}

}
