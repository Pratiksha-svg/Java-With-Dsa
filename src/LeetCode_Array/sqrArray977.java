package LeetCode_Array;

import java.util.Arrays;

public class sqrArray977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {-4,-1,0,3,10};
		sqr(nums);
	}

	public static int[] sqr(int[] nums) {
		// TODO Auto-generated method stub
		int ans[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			ans[i]=Math.powExact(nums[i], 2);
		}
		
		Arrays.sort(ans);
		return ans;
	}

}
