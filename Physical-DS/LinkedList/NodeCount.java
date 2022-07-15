package LinkedList;

import LinkedList.MaxElement.Node;

public class NodeCount {
	
	static Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{


		}
	}
	
	//Add first
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public static void display(Node tnode)
	{
		while(tnode!=null)
		{
			System.out.print(tnode.data);
			tnode = tnode.next;
		}
	}
	
	//Recursive display
	
	static void dis(Node rnode)
	{
		if(rnode!=null)
		{
			
			dis(rnode.next);
			System.out.print(rnode.data+" ");
		}
	}
	
	//count node
	
	public static int countNode(Node cnode)
	{
		int c = 0;
		while(cnode!=null)
		{
			c++;
			cnode = cnode.next;
		}
		return c;
	}
	
	//Sum of all Nodes
	
	public static int sumOFNodes(Node sumNode)
	{
		int sum = 0;
		while(sumNode!=null)
		{
			sum = sum + sumNode.data;
			sumNode = sumNode.next;
		}
		
		return sum;
	}
	
	//Recursively Sum of Nodes
	
	public static int RsumOFNodes(Node sumNode)
	{
//		int sum = 0;
		if(sumNode==null)
			return 0;
		else
			return RsumOFNodes(sumNode.next)+sumNode.data;
			
			
		
	}
	// Find maximum

		public static int maxNum(Node n) {
			n = head;
			int max = -1;
			if (head == null) {
				System.out.println("Lis is empty.");
			} else {
				while (n.next != null) {
					if (n.data > max)

						max = n.data;
					n = n.next;
				
				}
			}
			return max;
		}
		
		
		
//recursively find max 
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeCount node = new NodeCount();
		
		node.addFirst(1);
		node.addFirst(2); 
		node.addFirst(3);
		node.addFirst(4);
		node.addFirst(5);
		
		node.addFirst(80);
		
		
		
		display(head);
		System.out.println();
		System.out.println("recursive");
		System.out.println();
		dis(head);
		System.out.println(countNode(head));

		System.out.println(RsumOFNodes(head));
		
		System.out.println(maxNum(head));
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
