package DoublyLL;


//Do it again 



import LinkedList.AllAboutLinkedList;

public class ReverseDLL  extends AllAboutLinkedList{
	
	static Node head;
	class Node
	{
		int data;
		Node next;
		Node prev;
//		Node(){}
		Node(int data) 
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
	}
	
	//AddAtFirst
	
		public void addAtFirstInDLL(int data)
		{
			Node t = new Node(data);
			t.prev = null;
			t.next = head;
			
			head = t;
			System.out.println("Node is added at first! "+ t.data);
		
		}
	
	
	//Reversing doubly linked list
	public static Node reverse1(Node head)
	{
        Node p = head;
		
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
	    p=head;
	    while(p!=null)
	    {
	        if(p.next==null)
	        {
	        head = p;
	        }
	        Node temp = p.next;
	        p.next = p.prev;
	        p.prev = temp;
	        
	        p = p.prev;
	    }
	    return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDLL obj = new ReverseDLL();
		obj.addAtFirstInDLL(2);
		obj.addAtFirstInDLL(4);
		obj.addAtFirstInDLL(6);
		obj.addAtFirstInDLL(8);
		obj.addAtFirstInDLL(10);
		
	
		obj.reverse1(head);
		
		
		
	    
	    
	   
		
		
	}

}
