package Practice;

public class PrintAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-1,0,3,5,9,12};
		int item=9;
		System.out.println(print(arr,item));
		
		
	}
	
public static int print(int[] arr,int item) {
		
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<hi) {
			int mid=(hi+lo)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
			
		
	}
		return -1;
}
}
