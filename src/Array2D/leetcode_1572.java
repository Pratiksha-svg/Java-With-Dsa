package Array2D;

public class leetcode_1572 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(DiagonalSum(arr));
	}

	public static int DiagonalSum(int[][] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				}else if((i+j)==arr.length-1) {
					sum=sum+arr[i][j];
				}
			}
		}
		return sum;
		
	}

}
