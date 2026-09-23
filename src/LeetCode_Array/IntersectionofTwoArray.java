package LeetCode_Array;
import java.util.*;


public class IntersectionofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {4,9,5};
		int nums2[] = {9,4,9,8,4};
		Set<Integer>set=new HashSet<>();
		
		for(int i=0;i<nums1.length ;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					set.add(nums1[i]);
					
				}
			}
			
		}
		System.out.println(set);
		int []res=new int[set.size()];
		int ind=0;
		for(int data:set) {
			res[ind]=data;
			ind++;
		}
		
		for(int a:res) {
			System.out.println(a);
		}
		
	}
	

}
