package Lec27;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean []Board=new boolean[n];
		int tq=2;
		int qpsf=0;
		
		
		Permutation(Board,tq,qpsf,"");
				

	}
	public static void Permutation(boolean []Board, int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<Board.length;i++) {
			if(Board[i]==false) {
				Board[i]=true;
				Permutation(Board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				Board[i]=false;  //undo
			}
			
		}
		
	}
	

}
