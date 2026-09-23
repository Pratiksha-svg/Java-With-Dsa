package Lec27;

public class Queen_Combination {
	public static void main(String[] args) {
		int n=4;
		boolean []Board=new boolean[n];
		int tq=2;
		int qpsf=0;
		
		
		Combination(Board,tq,qpsf,"",0);
				

	}
	public static void Combination(boolean []Board, int tq, int qpsf, String ans,int idx) {
		// TODO Auto-generated method stub
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx;i<Board.length;i++) {
			if(Board[i]==false) {
				Board[i]=true;
				Combination(Board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				Board[i]=false;  //undo
			}
			
		}
		
	
	}

}
