package QueuePractice;

public class LinearQueue {
	
	private int arr[];
	private int front=0;
	private int size=0;
	
	
	public LinearQueue() {
		arr=new int[5];
	}
	
	public LinearQueue(int n) {
		arr=new int[n];
	}
	
	//empty
	
	public boolean isEmpty() {
		return size==0;
	}
	
	//full
	public boolean isFull() {
		return front+size==arr.length;
	}
	
	//enqueue
	
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full.. ");
		}
		
		int idx=(front+size);
		arr[idx]=item;
		size++;
	}
	
	//dequeue
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty.. ");
		}
		int rv=arr[front];
		front++;
		size--;
		return rv;
	}
	
	//getfront
	
	public int getFront() {
		return arr[front];
	}
	
	//display
	public void diplay() {
		for(int i=front;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
