package Array2D;

public class leetcode1351 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{4,3,2,-1},
				{3,2,1,-1},
				{1,1,-1,-2},
				{-1,-1,-2,-3}
		};
		System.out.println(NegativeCount(arr));
	}

	public static int NegativeCount(int[][] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]<0) {
					count++;
				}
			}
		}
		return count;
	}
	
	

}
