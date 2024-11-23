package LinkedList;

public class LinkedListRewiseNov2024 {

	static Node head;
	static int size;

	class Node {

		String data;
		Node next;

		Node() {
		}

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// Printing list
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node p = head;
		while (p != null) {
			System.out.print(p.data + "->");
			p = p.next;
		}
	}

	// Add at first
	public void addAtFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;

		}
		newNode.next = head;
		head = newNode;
		size++;

	}
	
	//Add at last 
	public void addAtLast(String data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			return;
		}
		Node p = head;
		while(p.next!=null)
		{
			p = p.next;
		}
		p.next = newNode;
		size++;
	}

	public static void main(String[] args) {

		LinkedListRewiseNov2024 ll = new LinkedListRewiseNov2024();
		ll.addAtFirst("list");
		ll.addAtFirst("a");
		ll.addAtFirst("is");
		ll.printList();

	}

}
