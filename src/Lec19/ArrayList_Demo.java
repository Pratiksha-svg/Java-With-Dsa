package Lec19;
import java.util.*;
//import java.util.ArrayList;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> ll=new ArrayList<>();
		System.out.println(ll);
		
		//size()
		System.out.println(ll.size());
		
		
		//add()
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.size());
		
		
		//insert between 20 and 30
		ll.add(2,-6);   //(index,value)
		System.out.println(ll);
	
		
		//sort()
		//Collections.sort(ll);
		//System.out.println(ll);
		
		//get element from given index  size 0 to size
		System.out.println(ll.get(3));
		System.out.println(ll);
		
		
		//reverse
		
//		Collections.reverse(ll);
//		System.out.println(ll);
		
		// set()  -->update
		
		ll.set(3, 90);
		System.out.println(ll);
		
		//remove()
		ll.remove(1);
		System.out.println(ll);
		
	}

}
