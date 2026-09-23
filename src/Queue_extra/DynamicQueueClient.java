package Queue_extra;

public class DynamicQueueClient extends Dynamic_Queue{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		Dynamic_Queue d=new Dynamic_Queue();
		
		d.Enqueue(10);
		d.Enqueue(20);
		d.Enqueue(30);
		d.Enqueue(40);
		d.Enqueue(50);
		d.Enqueue(60);
		d.Enqueue(70);
		d.Enqueue(80);
		d.Enqueue(90);
		d.Enqueue(100);
		
		d.Display();
		
		
		
	}

}
