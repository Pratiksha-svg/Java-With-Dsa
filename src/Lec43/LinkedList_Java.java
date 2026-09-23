package Lec43;

import java.util.LinkedList;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>ll=new LinkedList<>();
		
		ll.add(10);
		ll.add(70);
		ll.add(560);
		ll.add(40);
		ll.add(0,88);
		System.out.println(ll);
		System.out.println(ll.size());
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
	}

}
