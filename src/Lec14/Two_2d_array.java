package Lec14;

public class Two_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int [3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		System.out.println(arr[1][2]);
		display(arr);
	}

	public static void display(int[][]arr) {
		int r=arr.length;//row
		int c=arr[0].length;//column
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
