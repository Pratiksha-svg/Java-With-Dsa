package StackPractice;
import java.util.Stack;
public class Insert_Bottom_In_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		add_bottom(st,-9);
		System.out.println(st);
		
	}
	public static void  add_bottom(Stack<Integer>st,int item) {
		if(st.isEmpty()) {
			st.push(-9);
			return;
		}
		
		 int r=st.pop();
		 add_bottom(st,item);
		 st.push(r);
		
		
		
	}

}
