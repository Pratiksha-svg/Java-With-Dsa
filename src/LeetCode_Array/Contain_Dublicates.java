package LeetCode_Array;
import java.util.*;
public class Contain_Dublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,4};
		System.out.println(Dublicate(arr));
		//Dublicate(arr);
	}
	public static boolean Dublicate(int []arr) {
		
		Set<Integer>set=new HashSet<>();
		for(int a:arr) {
			set.add(a);
		}
		//System.out.println(set);
		if(set.size()==arr.length) {
			return false;
		}
		return true;
		
		

	}

	

}
