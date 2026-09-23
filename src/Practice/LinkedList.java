package Practice;

public class LinkedList {

	public class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void addfirst(int item){
		Node nn=new Node();
		nn.val=item;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
			
		}
		else {
			nn.next=head;
			head=nn;
			size++;
		}
		
	}
	
	public void addlast(int item) {
		if(size==0) {
			addfirst(item);
		}
		else {
			Node nn=new Node();
			nn.val=item;
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	
	public void addatIndex(int item,int k) throws Exception {
		if(k==0) {
			addfirst(item);
		}
		else if(k==size) {
			addlast(item);
		}
		else {
			Node nn=new Node();
			nn.val=item;
			Node k_1th=GetNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			size++;
		}
	}
	
	private Node GetNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("k out of range");
		}
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	
	public int getfirst() throws Exception {
		if(size==0) {
			throw new Exception("head is null");
		}
		return head.val;
	}
	
	public int getlast() throws Exception {
		if(size==0) {
			throw new Exception("head is null");
		}
		return tail.val;
	}
	
	
	public int getatIndex(int k) throws Exception {
		return GetNode(k).val;
	}
	
	public int removefirst() {
		Node temp=head;
		if(size==1) {
			head=null;
			tail=null;
			
		}
		else {
			head=head.next;
			temp.next=null;
		}
		size--;
		return temp.val;
	}
	
	public int removelast() throws Exception {
		if(size==1) {
			return removefirst();
		}
		else {
			Node prev=GetNode(size-2);
			Node temp=tail;
			tail=prev;
			tail.next=null;
			size--;
			return temp.val;
		}
	}
	
	public int removeatIndex(int k) throws Exception {
		if(k==0) {
			return removefirst();
		}
		else if(k==size) {
			return removelast();
		}
		else {
			Node prev=GetNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
			
		}
		
	}
}
