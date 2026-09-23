package Lec22;

public class First_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,13,7,5,3,4,5,6,3,9,3};
		//int n=arr.length-1;
		System.out.println(First_Index(arr,0,3));
	}
	public static int First_Index(int []arr,int i,int item) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		
		return First_Index(arr,i+1,item);
	}

}
