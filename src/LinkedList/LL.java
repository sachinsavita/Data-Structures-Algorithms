package LinkedList;

public class LL {
	
	Node head;
	private int size;
	
	LL()
	{
		this.size = 0;
	}
	//Node define
	class Node
	{
		String data;
		int idata;
		Node next;
		Node(){}
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
		Node(int idata)
		{
			this.idata = idata;
			this.next = null;
		}
		
	}
	//AddFirst
	public void addFirst(String data)
	{
		Node t = new Node(data);
			t.next = head;
		    head = t;
		   size++;
	}
	
	//AddFirst
		public void addAtFirst(int data)
		{
			Node newNode = new Node(data);
				newNode.next = head;
			    head = newNode;
			   size++;
		}
	//AddLast
	
	public void addLast(String data)
	{
		Node newNode =  new Node(data);
		if(head==null)
		{
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
		}
		
		lastNode.next = newNode;
		size++;
	}
	
	//Printlist
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
	}
	
	//Delete first  element
	public void deleteFirst()
	{
		size--;
		if(head == null)
		{
			System.out.println("The list is empty");
			return;
		}
		else 
			head = head.next;
	}
	//delete last
	public void deleteLast()
	{
		size--;
		if(head == null)
		{
			System.out.println("The list is empty");
			return;
		}
		if(head.next == null)
		{
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	public int getSize()
	{
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		LL list = new LL();
		
		list.addFirst("is");
		list.addLast("a");
		list.addLast("list");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		list.addFirst("This");
		
		System.out.println(list.getSize());
		
		

	}  

}
