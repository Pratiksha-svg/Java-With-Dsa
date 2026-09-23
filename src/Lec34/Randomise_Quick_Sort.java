package Lec34;

import java.util.Random;

public class Randomise_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,2,11,4};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int[] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int idx=Parition(arr,si,ei);
		sort(arr,si,idx-1);
		sort(arr,idx+1,ei);
	}
	public  static int Parition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		
		//random index ko last element ke sath swap kr denge(nlogn)
		RandomIndexSwapping(arr,ei,si);
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
	public static void RandomIndexSwapping(int[]arr,int si,int ei) {
		Random ran=new Random();
		int rn=ran.nextInt(si-ei+1)+ei;
		int temp=arr[ei];
		arr[ei]=arr[rn];
		arr[rn]=temp;
	}

}
