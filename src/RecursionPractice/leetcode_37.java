package RecursionPractice;

public class leetcode_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grid[][]= {
				{'5','3','.','.','7','.','.','.','.'},
			    {'6','.','.','1','9','5','.','.','.'},
			    {'.','9','8','.','.','.','.','6','.'},
			    {'8','.','.','.','6','.','.','.','3'},
			    {'4','.','.','8','.','3','.','.','1'},
			    {'7','.','.','.','2','.','.','.','6'},
			    {'.','6','.','.','.','.','2','8','.'},
			    {'.','.','.','4','1','9','.','.','5'},
			    {'.','.','.','.','8','.','.','7','9'}
				
		};
		Print(grid, 0, 0);

	}

	public static void Print(char[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if( col==9) {
			col=0;
			row++;
		}
		
		
		if(row==9) {
			Display(grid);
			return;
		}
		if(grid[row][col]!='.') {
			Print(grid,row,col+1);
		}
		else {
			for(int val='1';val<='9';val++) {
				if(isitsafe(grid,row,col,val)==true) {
					grid[row][col]=(char) val;
					Print(grid,row,col+1);
					grid[row][col]='.';
				}
			}
		}
		
		
		
	}
	public static boolean isitsafe(char[][] grid, int row, int col,int val) {
		// TODO Auto-generated method stub
		//row
		for(int i=0;i<9;i++) {
			if(grid[row][i]==val) {
				return false;
			}
		}
		
		//col
		for(int i=0;i<9;i++) {
			if(grid[i][col]==val) {
				return false;
			}
		}
		//3*3 matrix
		int r=row-row%3;
		int c=col-col%3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Display(char[][] grid) {
		// TODO Auto-generated method stub
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}















//class Solution {
//    public void solveSudoku(char[][] board) {
//        Print(board,0,0);
//    }
//    public static boolean Print(char[][] grid, int row, int col) {
//		// TODO Auto-generated method stub
//		if( col==9) {
//			col=0;
//			row++;
//		}
//		
//		
//		if(row==9) {
//			//Display(grid);
//			return true;
//		}
//		if(grid[row][col]!='.') {
//			return Print(grid,row,col+1);
//		}
//		else {
//			for(int val='1';val<='9';val++) {
//				if(isitsafe(grid,row,col,val)==true) {
//					grid[row][col]=(char) val;
//					if(Print(grid,row,col+1)){
//                        return true;
//                    }
//					grid[row][col]='.';
//				}
//			}
//		}
//		
//	return false;	
//		
//	}
//	public static boolean isitsafe(char[][] grid, int row, int col,int val) {
//		// TODO Auto-generated method stub
//		//row
//		for(int i=0;i<9;i++) {
//			if(grid[row][i]==val) {
//				return false;
//			}
//		}
//		
//		//col
//		for(int i=0;i<9;i++) {
//			if(grid[i][col]==val) {
//				return false;
//			}
//		}
//		//3*3 matrix
//		int r=row-row%3;
//		int c=col-col%3;
//		for(int i=r;i<r+3;i++) {
//			for(int j=c;j<c+3;j++) {
//				if(grid[i][j]==val) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//	// public static void Display(char[][] grid) {
//	// 	// TODO Auto-generated method stub
//	// 	for(int i=0;i<grid.length;i++) {
//	// 		for(int j=0;j<grid[0].length;j++) {
//	// 			System.out.print(grid[i][j]+" ");
//	// 		}
//	// 		System.out.println();
//	// 	}
//		
//	// }
//}











