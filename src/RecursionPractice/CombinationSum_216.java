package RecursionPractice;
import java.util.*;
public class CombinationSum_216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>list1=new ArrayList<>();
		int []arr= {1,2,3,4,5,6,7,8,9};
		int n=9;
		int k=3;
		Combination(arr,n,k,0,list,list1);
		System.out.println(list1);
//		System.out.println(list);

	}

	public static void Combination(int[] arr, int n, int k, int idx, List<Integer> list, List<List<Integer>> list1) {
		// TODO Auto-generated method stub
		if(k==0 && n==0) {
			//list.add(null)
			
			
			System.out.println(list);
			list1.add(new ArrayList<Integer>(list));
			return;
		}
		if(n<0) {
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			list.add(arr[i]);
			Combination(arr,n-arr[i],k-1,i+1,list,list1);
			list.remove(list.size()-1);
			
		}
		
	}

}
