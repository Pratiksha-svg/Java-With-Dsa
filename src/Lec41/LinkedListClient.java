package Lec41;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		
		//addfirst
		l.addfirst(10);
		l.addfirst(20);
		l.addfirst(30);
		l.display();
		
		
		//addlast
		l.addlast(55);
		l.addlast(-9);
		l.addlast(11);
		l.display();
		
		//addindex
		l.addatIndex(-88, 2);
		l.display();
		
		
		//getfirst
		System.out.println(l.getfirst());
		
		//getlast
		System.out.println(l.getlast());
		
		//getatIndex
		System.out.println(l.getatIndex(2));
		
		
		//removefirst
		System.out.println(l.removefirst());
		l.display();
		
		
		//removelast
		System.out.println(l.removelast());
		l.display();
		
		
		//removeatIndex
		System.out.println(l.removeatindex(2));
		l.display();
		
		
		
		
	}

}
