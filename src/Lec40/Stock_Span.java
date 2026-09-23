package Lec40;

import java.util.Stack;

public class Stock_Span {
//lec45
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {30,35,40,38,35};   
		int[]ans=calSpan(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

	public static int[] calSpan(int[] arr) {
		// TODO Auto-generated method stub
		int ans[]=new int[arr.length];
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek(); 
			}
			st.push(i);
		}
		return ans;
	}

}
