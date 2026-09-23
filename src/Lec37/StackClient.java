package Lec37;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		
		//push
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		System.out.println(st.isFull());
		
		//st.push(60);
		
		//pop
		System.out.println(st.pop());
		
		st.display();
		//peek
		System.out.println(st.peek());
		
		//size
		System.out.println(st.size());
		
		//display
		
		st.display();
	}

}
