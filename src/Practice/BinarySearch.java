package Practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,8,9,11,12};
		int k=11;
		System.out.println(Binary_Search(arr,k)); 
	}
	public static int Binary_Search(int[]arr,int k) {
		int lo=0;
		int hi=arr.length-1;
		
	while(lo<=hi) {
	int mid=((lo+hi)/2);
		
		if(arr[mid]>k) {
			hi=mid-1;
		}
		else if(arr[mid]==k) {
			return mid;
		}
		else {
			lo=mid+1;
		}
	}
		return -1;
	}

}
