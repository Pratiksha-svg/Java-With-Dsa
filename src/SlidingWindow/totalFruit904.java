package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class totalFruit904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,2,1,3,3,5,5,3,5};
		int k=2;
		System.out.println(TotalFruit(arr,k));
	}

	public static int TotalFruit(int[] arr, int k) {
		// TODO Auto-generated method stub
		int ei=0;
		int si=0;
		int max=0;
	
		
		Map<Integer,Integer>map=new HashMap<>();
		while(ei<arr.length) {
			map.put(arr[ei], map.getOrDefault(arr[ei], 0)+1);
			
			if(map.size()>k) {
				map.put(arr[si], map.get(arr[si])-1);
				if(map.get(arr[si])==0) {
					map.remove(arr[si]);
				}
				si++;
			}
			if(map.size()<=k) {
				max=Math.max(max, ei-si+1);
			}
			ei++;
		}
		return max;
	}

}
