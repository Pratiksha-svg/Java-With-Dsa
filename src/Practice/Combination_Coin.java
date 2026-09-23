package Practice;

public class Combination_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount =4;
		int[]coin= {2,1,3,5};
		combination(coin,amount,"",0);
	}

	public static void combination(int[] coin, int amount, String ans, int idx) {
		// TODO Auto-generated method stub
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				combination(coin,amount-coin[i],ans+coin[i],i);
			}
		}
	}

}
