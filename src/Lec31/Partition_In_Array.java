package Lec31;

public class Partition_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,7,2,3,8,1,4};
		int idx=Parition(arr,0,arr.length-1);
		System.out.println(idx);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

	public  static int Parition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item=arr[ei];
		int idx=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<=item) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		int temp=arr[ei];
		arr[ei]=arr[idx];
		arr[idx]=temp;
		
		return idx;

	}
	}
