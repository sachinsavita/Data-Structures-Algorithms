package LinkedList;


public class LinkedListRevision {
	
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(){}
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	//At first
	public void addAtFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	//Add last
	public void addAtLast(int data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//DeleteFirst
	
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		head = head.next;
	}
	
	//delete last
	public void deletelast()
	
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		Node secondLast = head;
		Node lastNode =head.next;
		while(lastNode.next!=null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	//print nodes
	
	public void printNode(LinkedListRevision ll)
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.print("|"+currNode.data+"|ref-|-->");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListRevision ll = new LinkedListRevision();
		
		ll.addAtFirst(5);
		ll.addAtFirst(4);
		ll.addAtFirst(3);
		ll.addAtFirst(2);
		ll.addAtFirst(1);
		ll.addAtFirst(0);
		ll.addAtLast(6);
		ll.addAtLast(7);
		ll.printNode(ll);
		ll.deleteFirst();
		ll.deletelast();
		ll.deletelast();
		ll.deletelast();
		ll.deletelast();
		ll.deletelast();
		ll.deletelast();
				
		System.out.println();
		ll.printNode(ll);
		
		

	}

}
