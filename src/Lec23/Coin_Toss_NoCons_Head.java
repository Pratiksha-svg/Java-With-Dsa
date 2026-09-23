package Lec23;

public class Coin_Toss_NoCons_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		CoinToss(n,"");
		System.out.println(count);
		
	}
	static int count=0;
	public static void CoinToss(int n,String ans) {
		
		if(n==0 ) {
			System.out.print(ans+" ");
			count++;
			return ;
		}
		
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			CoinToss(n-1,ans+"H");
		}
		
		CoinToss(n-1,ans+"T");
		
		
	}
}
