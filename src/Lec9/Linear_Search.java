package Lec9;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,-4,7,11};
		Scanner sc=new Scanner(System.in);
		int item =sc.nextInt();
		System.out.println(Search(arr,item));
		
	}
	public static int Search(int[] arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1; 
		
	}

}
