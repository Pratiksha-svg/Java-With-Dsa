package QueuePractice;

public class LinearQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinearQueue q=new LinearQueue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		
		q.diplay();
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.diplay();
		q.Enqueue(35);
	}

}
