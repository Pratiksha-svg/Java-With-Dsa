package Array2D;

public class SpiralMatrix2_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int arr[][]=new int[n][n];
		Spiral_matrix(arr,n);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][]  Spiral_matrix(int[][] arr, int n) {
		// TODO Auto-generated method stub
		
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		
		int TotalElement =arr.length *arr[0].length;
		int count=0;
		int num=1;
		while(count<TotalElement) {
			
			for(int i=minc;i<=maxc && count<TotalElement;i++) {
				arr[minr][i]=num;
				num++;
				count++;
			
		}
			minr++;

			for(int i=minr;i<=maxr && count<TotalElement;i++) {
				arr[i][maxc]=num;
				num++;
				count++;
		}
			maxc--;

			for(int i=maxc;i>=minc && count<TotalElement;i--) {
				arr[maxr][i]=num;
				num++;
				count++;
			}
			maxr--;
			
			for(int i=maxr;i>=minr && count<TotalElement;i--) {
				arr[i][minc]=num;
				num++;
				count++;
			}
			minc++;
			
			
		}
		return arr;
		
	}

}
