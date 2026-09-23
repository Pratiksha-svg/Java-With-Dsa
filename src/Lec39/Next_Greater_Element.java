package Lec39;
import java.util.Stack;
public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,9,13,21,3};
		int[]ans=NGE(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] NGE(int[] arr) {
		// TODO Auto-generated method stub
		int ans[]=new int[arr.length];
		Stack <Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		return ans;
	}

}
