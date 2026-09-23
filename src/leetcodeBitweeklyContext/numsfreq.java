package leetcodeBitweeklyContext;

import java.util.HashMap;
import java.util.Map;

public class numsfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {7};
		int res[]=print(nums);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	public static int [] print(int[] nums) {
		
		// TODO Auto-generated method stub
		
		HashMap <Integer,Integer>map=new HashMap<>();
		for(int x:nums) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		//System.out.println(map);
		
		if(map.size()<=2) {
			return new int[] {-1,-1};
			
		}
		
		int a=Integer.MAX_VALUE;
		for(int p:map.keySet()) {
			a=Math.min(a, p);
		}
		
		int x=map.get(a);
		
		
		//System.out.println(a);
		int  b=Integer.MAX_VALUE;
		 for (int key : map.keySet()) {
	            if (key > a && map.get(key) != x) {
	                b = Math.min(b, key);
	            }
	        }
		
		
		if (b == Integer.MAX_VALUE) {
		    return new int[]{-1, -1};
		}
		
		return new int[] {a,b};
		
	}

}




