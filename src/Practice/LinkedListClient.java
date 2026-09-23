
package Practice;

public class LinkedListClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.addfirst(10);
		l.addfirst(20);
		l.addfirst(30);
		
		l.display();
		
		l.addlast(5);
		l.addlast(3);
		l.display();
		
		l.addatIndex(40, 2);
		l.display();
		

		System.out.println(l.getfirst());
		System.out.println(l.getlast());
		
		
		System.out.println(l.getatIndex(2));
		
		System.out.println(l.removefirst());
		l.display();
		
		System.out.println(l.removelast());
		l.display();
		
		System.out.println(l.removeatIndex(1));
		l.display();
		
	}

}
