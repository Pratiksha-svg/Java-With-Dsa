package LeetCode_Array;

import java.util.Arrays;

public class Boat_To_Save_peep_881 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,2};
		int limit=6;
		Arrays.sort(arr);
		
		System.out.println(SavePeople(arr,limit));
		//SavePeople(arr,limit);
	}

	public static int SavePeople(int[] arr,int limit) {
		int boat=0;
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]>limit) {
				boat++;
				j--;
				
			}
		
			else if(arr[i]+arr[j]<=limit) {
				boat++;
				i++;
				j--;
			}
			else {
				boat++;
				j--;
			}
			
		}
		return boat;
		
	}

}
