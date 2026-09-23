package Array2D;

public class Leetcode_566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2},{3,4}};
		int r=2;int c=2;
		int reshape[][]=new int [r][c];
		int cc=0;
		int cr=0;
		Reshape(arr,reshape,r,c,0,0);
		for(int i=0;i<reshape.length;i++) {
			for(int j=0;j<reshape.length;j++) {
				System.out.print(reshape[i][j]+" ");
			}
			System.out.println();
		}
		

	}

	public static void Reshape(int[][] arr, int[][] reshape,int r,int c,int cr,int cc) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
				reshape[cr][cc]=arr[i][j];
				
				cc++;
			}
			cr++;
		}
	}

}
