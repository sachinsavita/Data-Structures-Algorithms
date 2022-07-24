
package LinkedList;

public class AllAboutLinkedList {
	//Define head
	static Node head;
	static Node head2;
	static int size = 0;
	
	//Defining node class
	class Node
	{
		int data;
		Node next;
//		Node(){}
		Node(int data) 
		{
			this.data = data;
			this.next = null;
		}
		
	}
	
	//AddAtFirst
	
	public void addAtFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println("Node with data " + newNode.data+ " is added at first! ");
		size++;
	}
	
	//AddAtFirst in second linked list for concatination
	
		public void addAtFirst2(int data)
		{
			Node t = new Node(data);
			t.next = head2;
			head2 = t;
			System.out.println("Node is added at first in head2! "+ t.data);
			size++;
		}
	
	//Add at a position
	
	public void addAt(int data, int pos)
	{
		Node newNode = new Node(data);
		
		Node p = head;
		for(int i=1;i<pos;i++)
		{
			p=p.next;
		}
		newNode.next = p.next;
		p.next = newNode;
		
		System.out.println("Node added at position:"+pos+" and data is:"+p.data);
		size++;
	}
	
	//AddLast
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		int x = newNode.data;
		if(head==null)
		{
			head = newNode;
			return;
		}
		Node p = head;
		while(p.next!=null)
		{
			p=p.next;           //just traverse till the last node and ass new node
		}
		p.next = newNode;
		System.out.println("Node added at last: "+x);
		size++;
	}
	
	//Display linked list
	
	public void displayLL()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	//Displaying head2 linked list
	
		public void displayh2()
		{
			if(head2==null)
			{
				System.out.println("List is empty");
				return;
			}
			Node temp = head2;
			while(temp!=null)
			{
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	
	//Searching for an element
	
	public void search(int key)
	{
		Node t = head;
		int pos = 0;
		System.out.println("Searching.......");    //you can delay this by seconds using exception handling
		while(t.data!=key)
		{
			t = t.next;
			pos++;
		}
		System.out.println("Key "+t.data+" is at position:"+pos);
	}
	 
	//Find maximum data node
	
	public void findMax()
	{
		int max = 0;
		Node p = head;
		while(p!=null)
		{
			if(p.data>max)
			{
				max = p.data;
			}
			p = p.next;
		}
		
		System.out.println("maximum value node is: " +max);
	}

	//Deleting firstNode
	
	public void deleteFirst()
	{
		int x = head.data;
		head = head.next;
		System.out.println("First node with data :"+x+" deleted.");
		
		displayLL();
	}
	
	//Deleting lastNode
	
		public void deleteLast()
		{
			Node p = head;
			while(p.next.next!=null)
			{
				p=p.next;
			}
		    int d = p.next.data;
			p.next= null;
			System.out.println("Last node with data :"+d+" deleted.");
			
			displayLL();
		}
		
		//Deleting node at given position
		
			public void deleteAt(int pos)
			{
				Node p = head;
				Node q = null;
				System.out.println(p.data);
				for(int i=0;i<pos;i++)
				{
					q=p;
					p=p.next;
				}
			    int d = p.data;
				q.next = p.next;
				System.out.println("Node at position:"+pos+ " with data :"+d+" deleted.");
				
				displayLL();
			}
			
			//Remove duplicates
			public void removeDup()
			{
				Node p = head;
				Node q = head.next;
				while(p.next!=null)
				{
				 
				}
				
				
			}
			
			//Check for sorted linked list
			public void sorted(Node p)
			{
				Node q = p.next;
				int flag = 0;
				while(p.next!=null)
				{
					if(p.data>q.data)
					{
						flag++;
					}
					p=p.next;
					q=q.next;
				}
				if(flag==0)
				{
					System.out.println("List is sorted");
				}
				else 
					System.out.println("List is NOT sorted");
			}
			
			//Printing linked list in reverse order 
			public void reverseLL(Node p)
			{
				if(p!=null)
				{
					reverseLL(p.next);
					System.out.print(p.data+" -> ");
				}
			}
			
			//Reversing a linked list
			public void reverseLL()
			{
				Node p =  head;
				Node q = null;
				Node r = null;
				
				while(p!=null)
				{
					r= q;
					q=p;
					p = p.next;
					q.next = r;
				}
				head = q;
			}
			
			//Concatinating two LL
			public void concatinate()
			{
				Node p = head;
				while(p.next!=null)
				{
					p = p.next; 
				}
				p.next = head2;
				head2= null;
			}
			
			//Merging two LL
			public void mergeLL()
			{
			    	
			}
			
			//Check for LOOP in a LL
			public void LoopedLL()
			{
				
			}
			
			//Find middle node
			public int findMid(Node head)
			{
				Node p = head;
				Node q = head;
				while(p!=null && p.next!=null)
				{
					p = p.next.next;
					q=q.next;
				}
				
				return q.data;
			}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllAboutLinkedList obj = new AllAboutLinkedList();
		obj.addAtFirst(10);
		obj.addAtFirst(15);
		obj.displayLL();
		obj.addAtFirst(20);
		obj.addLast(5);
		obj.addLast(2);
//		obj.displayLL();
		obj.addAt(8, 3);  
		obj.addAt(36, 5);
		obj.addAt(13, 2);
		obj.displayLL();
		System.out.println("Number of nodes: "+size);
		obj.search(13);
		obj.findMax();
		System.out.println("Delete first....................................................................................");
		obj.deleteFirst();
		System.out.println("Delete last....................................................................................");
		obj.deleteLast();
		System.out.println("Delete at position....................................................................................");
		obj.deleteAt(2);
		System.out.println("At position....................................................................................");
		obj.deleteAt(2);
		System.out.println("List sorted or not....................................................................................");
		obj.sorted(head);
		System.out.println("Reverse LL....................................................................................");
		obj.addAtFirst(10);
		obj.addLast(100);
		obj.displayLL();
		obj.reverseLL(head);
		System.out.println();
		obj.addAtFirst2(200);
		obj.addAtFirst2(190);
		obj.addAtFirst2(180);
		obj.addAtFirst2(170);
		obj.addAtFirst2(150);
		obj.addAtFirst2(120);
		obj.displayh2();
		obj.sorted(head2);
		System.out.println("Concatenate two LL....................................................................................");
		obj.displayLL();
		obj.displayh2();
		obj.concatinate();
		System.out.println("List after concatenation::::::::::::");
		obj.displayLL();
		obj.reverseLL();
		System.out.println("Reversing LL....................................................................................");
		obj.displayLL();
		
		System.out.println(obj.findMid(head));
		

	}

}
