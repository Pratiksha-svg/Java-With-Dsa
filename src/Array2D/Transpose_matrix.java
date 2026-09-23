package Array2D;

public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {
			//	{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
				{1,2,3},{4,5,6}
		};
		
		int n=arr.length;
		int m=arr[0].length;
		int brr[][]=new int[m][n];
		//System.out.println(Transpose(arr));
		Transpose(arr,n,m,brr);
		if(n!=m) {
			for(int i=0;i<brr.length;i++) {
				for(int j=0;j<brr[0].length;j++) {
					System.out.print(brr[i][j]+"  ");
				}
				System.out.println();
			}
		}
		else {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}

	public static int[][] Transpose(int[][] arr,int n,int m,int[][]brr) {
		// TODO Auto-generated method stub
		
		
		
	if(m!=n) {
		
		for(int i=0;i<n;i++) {
			for( int j=0;j<m;j++) {
				brr[j][i]=arr[i][j];
			}
		}
		return brr;
	}
	
	

	
	else {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<m;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	return arr;
	//return brr;
	}
	
}
