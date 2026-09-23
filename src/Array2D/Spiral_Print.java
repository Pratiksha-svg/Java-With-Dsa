package Array2D;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= { {1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}, 
				{17,18,19,20}};
		
		Spiral(arr);
	}

	public static void Spiral(int[][] arr) {
		// TODO Auto-generated method stub
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		
		int TotalElement =arr.length *arr[0].length;
		int count=0;
		
		while(count<=TotalElement) {
			
			for(int i=minc;i<=maxc && count<TotalElement;i++) {
				System.out.print(arr[minr][i]+"  ");
				count++;
			
		}
			minr++;

			for(int i=minr;i<=maxr && count<TotalElement;i++) {
				System.out.print(arr[i][maxc]+"  ");
				count++;
		}
			maxc--;

			for(int i=maxc;i>=minc && count<TotalElement;i--) {
				System.out.print(arr[maxr][i]+"  ");
				count++;
			}
			maxr--;
			
			for(int i=maxr;i>=minr && count<TotalElement;i--) {
				System.out.print(arr[i][minc]+"  ");
				count++;
			}
			minc++;
			
			
		}
		
		
	}

}
