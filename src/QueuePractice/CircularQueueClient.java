package QueuePractice;

public class CircularQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CircularQueue q=new CircularQueue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		
		q.diplay();
		System.out.println(q.Dequeue());
		q.diplay();
		System.out.println(q.Dequeue());
		q.diplay(); 
		q.Enqueue(60);
		q.Enqueue(70);
		q.diplay();
	}

}
