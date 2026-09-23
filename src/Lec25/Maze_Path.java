package Lec25;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=5;
		System.out.println(PrintPath(0,0,n-1,m-1,""));
	}
	//cc-->current colum  cr-->current  row  er-->end row  ec-->end column
	public static int PrintPath(int cc,int cr,int er,int ec,String ans) {
		if(cr==er && cc==ec) {
			System.out.println(ans);
			return 1;
		}
		if(cc>ec || cr>er) {
			return 0;
		}
		int s1=PrintPath(cc+1,cr,er,ec,ans+"H");
		int s2=PrintPath(cc,cr+1,er,ec,ans+"V");
		return s1+s2;
	}

}
