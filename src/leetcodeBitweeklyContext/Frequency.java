package leetcodeBitweeklyContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Frequency {
	public static void main(String[] args) {
		Map<Integer,Integer>map=new HashMap<>();
		int nums[]={20,10,30,30};
		Arrays.sort(nums);
		System.out.println(frequencyCount(map,nums));
	}

	private static boolean frequencyCount(Map<Integer, Integer> map, int[] nums) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>unique=new HashMap<>();
		HashSet<Integer>set=new HashSet<>();
		
		for(int data:nums) {
			map.put(data,map.getOrDefault(data, 0)+1);
		}
		System.out.println(map);
		
		
		for(Integer data:map.values()) {
			if(set.contains(data)) {
				return false;
			}
			set.add(data);
		}
		System.out.println(set);
		return true;
	}
	
}
