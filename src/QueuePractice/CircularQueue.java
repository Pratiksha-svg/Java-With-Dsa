package QueuePractice;

public class CircularQueue {

	private int arr[];
	private int front=0;
	private int size=0;
	
	
	public CircularQueue() {
		arr=new int[5];
	}
	
	public CircularQueue(int n) {
		arr=new int[n];
	}
	
	//empty
	
	public boolean isEmpty() {
		return size==0;
	}
	
	//full
	public boolean isFull() {
		return size==arr.length;
	}
	
	//enqueue
	
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full.. ");
		}
		
		int idx=(front+size)%arr.length;
		arr[idx]=item;
		size++;
	}
	
	//dequeue
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty.. ");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}
	
	//getfront
	
	public int getFront() {
		return arr[front];
	}
	
	//display
	public void diplay() {
		for(int i=0;i<size;i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
