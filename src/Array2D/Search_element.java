package Array2D;

import java.util.Scanner;

public class Search_element {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		int [][]arr=new int[m][n];
//		for(int i=0;i<arr.length;i++) {
//			for( int j=0;j<arr[0].length;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
		
		int [][]arr= {
				{1,4,7,11,15},
				{2,5,8,12,19},
				{3,6,9,16,22},
				{10,13,14,17,24},
				{18,21,23,26,30}
		};
		int x=sc.nextInt();
		System.out.println(Search(arr,x));
		
	}

	public static boolean Search(int[][] arr, int x) {
		// TODO Auto-generated method stub
		int r=0;
		int c=arr.length-1;
		while(r<arr.length && c>=0) {
			if(arr[r][c]==x) {
				return true;
			}
			else if(arr[r][c]>x) {
				c--;
			}
			else {
				r++;
			}
	}
		return false;
	}

}
