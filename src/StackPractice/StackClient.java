package StackPractice;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		
		st.push(10);
		st.Display();
		st.push(20);
		st.Display();
		st.push(30);
		st.Display();
		st.push(40);
		st.Display();
		st.push(50);
		st.Display();
		
		System.out.println(st.isFull());
		System.out.println(st.isEmpty());
		
		System.out.println(st.pop());
		st.Display();
		System.out.println(st.pop());
		st.Display();
		
		
		System.out.println(st.size());
		
		
	}		


}
