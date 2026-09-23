package Lec28;
import java.util.*;
public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]coin= {2,1,3,5};
		int amount=4;
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>ans=new ArrayList<>();
		Combination(coin,amount,list,0,ans);
		System.out.println(ans);

	}

	public static void Combination(int[] coin, int amount, List<Integer>list,int idx,List<List<Integer>>ans) {
		// TODO Auto-generated method stub
		if(amount==0) {
			//System.out.println();
			
			ans.add(new ArrayList<Integer>(list));
			return ;
		}
		
		
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				list.add(coin[i]);
				Combination(coin,amount-coin[i],list,i,ans);
				list.remove(list.size()-1);
				
				
			}
		}
	}

}
