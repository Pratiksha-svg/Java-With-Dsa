package QueuePractice;

public class Queue_reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CircularQueue q=new CircularQueue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.diplay();
		
		reverse(q);
		q.diplay();
	}

	public static void reverse(CircularQueue q) throws Exception {
		// TODO Auto-generated method stub
		if(q.isEmpty()) {
			return;
		}
		
		int p=q.Dequeue();
		reverse(q);
		q.Enqueue(p);
		
	}

}
