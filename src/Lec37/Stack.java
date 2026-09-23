package Lec37;

public class Stack {
	protected int[]arr;
	protected int top=-1;

	public Stack() {
		arr=new int[5];
	}
	
	
	public Stack(int n) {
		arr=new int[n];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	
	//push
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		
		top++;
		arr[top]=item;	
	}
	//pop
	public int pop()throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv=arr[top];
		top--;
		return rv;
	}
	//peek
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv=arr[top];
		return rv;
	}
	
	//size
	public int size() {
		return top+1;
	}
	
	//display
	
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
}
