package Queue;

public class LinkedListQueue {
	
	//Defining Node
	static class Node{
		int data;    //removed static
		Node next;
		 Node(int data){
			this.data = data;
			next= null;
			
		}
	}
		//Defining Queue
		static class Queue
		{
			static Node head = null;  //Head
			static Node tail = null;   //Tail
		
		
		//isEmpty()
		public static boolean isEmpty()
		{
			return head == null && tail == null;
		}
		
		//Enqueue
		public static void enqueue(int data)
		{
		    Node t = new Node(data);
		    
		    if(isEmpty())
		    {
		    	tail = head = t;
		    	System.out.println(data+" added @ position: "+tail);
		    }
		    else {
		    tail.next = t;
		    tail = t;
		    System.out.println(data+" added @ position: "+tail);
		    }
		}
		
		//Dequeue
		public static int dequeue()
		{
			int x = -1;
			if(isEmpty())
			{
				System.out.println("Queue is Empty.");
				return -1;
			}
			
			x = head.data; 
			//Single Node
			if(head==tail)
			{
				tail=null;
			}
				
				head = head.next;
//				System.out.println("Dequeuing..... "+x );
			    return x;
		}
		
		//Peek
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty.");
				return -1;
			}
			
				return head.data;
		}
		
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		Queue.enqueue(5);
		Queue.enqueue(10);
		Queue.enqueue(20);
		Queue.enqueue(25);
		Queue.enqueue(35);
		
		while(!Queue.isEmpty())
		{
			System.out.println(q.peek());
			Queue.dequeue();
		}
		q.dequeue();		
	}

}
