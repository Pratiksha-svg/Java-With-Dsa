package SlidingWindow;

import java.util.HashMap;

public class subarraysWithKDistinct {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4};
		int k=3;
		System.out.println(total(arr,k));
	}
	public static int total(int[] arr, int k) {
		int a=count(arr,k);
		int b=count(arr,k-1);
		return a-b;
	}

	public static int count(int[] arr, int k) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int cnt=0;
		HashMap<Integer,Integer>map=new HashMap<>();
		while(ei<arr.length){
			map.put(arr[ei], map.getOrDefault(arr[ei], 0)+1);
			//System.out.println(map);
			while(map.size()>k) {
				map.put(arr[si], map.get(arr[si])-1);
				if(map.get(arr[si])==0) {
					map.remove(arr[si]);
				}
				si++;
			}
			cnt+=ei-si+1;
			ei++;
		}
		return cnt;
	}
}
