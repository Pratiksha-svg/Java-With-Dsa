package SlidingWindow;

import java.util.Scanner;

public class TotalSubarraysum {
	public static void main(String[] args) {
		//int arr[]= {1,-2,4,-5,1};
		//int arr[]= {1,2,3};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		subarrsum(arr);
		
	}

	public static void subarrsum(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum<0) {
					count++;
				}
			}
		
		}
		System.out.println(count);
		
	}
}
