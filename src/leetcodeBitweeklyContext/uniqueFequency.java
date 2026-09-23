package leetcodeBitweeklyContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqueFequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>map=new HashMap<>();
		int nums[]={20,10,30,30};
		//Arrays.sort(nums);
		System.out.println(frequencyCount(map,nums));
		//frequencyCount(map,nums);
	}

	public static int frequencyCount(Map<Integer, Integer> map, int[] nums) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>set=new HashSet<>();
		
		for(int data:nums) {
			map.put(data,map.getOrDefault(data, 0)+1);
		}
		System.out.println(map);
		
		Map<Integer,Integer>fr=new HashMap<>();
		
		for(int f:map.values()) {
			fr.put(f, fr.getOrDefault(f, 0)+1);
		}
		System.out.println(fr);
		
		for(int a:nums) {
			if(fr.get(map.get(a))==1) {
				return a;
			}
		}
		return -1;
	}

}
