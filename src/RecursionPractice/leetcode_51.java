package RecursionPractice;
import java.util.*;
public class leetcode_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character>list=new ArrayList<>();
		List<List<Character>>list1=new ArrayList<>();
		int n=4;
		char[][]board=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='.';
			}
		}
//		char[][]board= {
//				{'.','.','.','.'},
//				{'.','.','.','.'},
//				{'.','.','.','.'},
//				{'.','.','.','.'}
//		};
		int tq=n;
		Queen(board,0,tq,list,list1);
		System.out.println(list1);
	}
	public static void Queen(char[][] board, int row, int tq,List<Character>list,List<List<Character>>list1) {
		if (tq == 0) {
			Display(board,list,list1);
			System.out.println(list);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (IsItSafe(board, row, col)==true) {
				board[row][col] = 'Q';
				list.add(board[row][col]);
				Queen(board, row + 1, tq - 1,list,list1);
				board[row][col] = '.';
				//list.remove(board[row][col]);
//				list.remove(col);
//				list.add('.');
				list.remove(list.size()-1);
						}
		}
	}

	public static boolean IsItSafe(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// up side wala
		int r = row;
		while (r >= 0) {
			if (board[r][col]=='Q') {
				return false;
			}
			r--;
		}
		// left diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]=='Q') {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal

		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c]=='Q') {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void Display(char[][] board,List<Character>list,List<List<Character>>list1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
				//list.add(board[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
