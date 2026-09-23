package Lec23;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=4;
			BoardPath(n,0,"");
			System.out.println();
			System.out.println(count);
	}
	static int count=0;
	public static void BoardPath(int n,int curr,String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			count++;
			return;
			
		}
		if(curr>n) {
			return ;
		}
//		 BoardPath(n,curr+1,ans+1);
//		 BoardPath(n,curr+2,ans+2);
//		 BoardPath(n,curr+3,ans+3);
		 
		 for(int dice=1;dice<=3;dice++) {
			 BoardPath(n,curr+dice,ans+dice);
		 }
		
	}
}
