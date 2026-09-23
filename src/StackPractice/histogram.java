package StackPractice;

import java.util.Stack;

public class histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,6,2,3}; 
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer>st=new Stack<>();
		int ans=0;
		
		for(int i=0;i<arr.length;i++) {
			int r=i;
			while(!st.isEmpty()&&arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				
				if(!st.isEmpty()) {
					int l=st.peek();
					int area=h*(r-l-1);
					ans=Integer.max(ans, area);
				}
				else {
					int area=h*r;
					ans=Integer.max(ans, area);
				}
				
				
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			
			if(!st.isEmpty()) {
				int l=st.peek();
				int area=h*(r-l-1);
				ans=Integer.max(ans, area);
			}
			else {
				int area=h*r;
				ans=Integer.max(ans, area);
			}
			
			
		}
		return ans;
		
	}

}
