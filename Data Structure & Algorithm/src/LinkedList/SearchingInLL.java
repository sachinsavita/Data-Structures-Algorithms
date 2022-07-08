package LinkedList;

import java.util.LinkedList;

import LinkedList.LL.Node;

public class SearchingInLL extends LL {
	
	static Node head;
		
		//Searching
		public int search(int key, Node p)
		{
			if(p == null)
			{
				System.out.println("List is empty.");
			}
			while(p!=null)
			{
				if(p.idata == key)
				{
				   return p.idata;
				}
				p = p.next;
			}
			return 0;
			
		}
		//RecursiveSearching
				public int Rsearch(int key, Node p)
				{
					if(p == null)
					{
						System.out.println("List is empty.");
					}
					if(p.next!=null)
					{
					if(p.idata== key)
						return p.idata;
					
					else
						return Rsearch(key, p.next);
					}
					return 0;
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchingInLL ll =new SearchingInLL();
		ll.addAtFirst(20);
		ll.addAtFirst(15);
		ll.addAtFirst(9);
		ll.addAtFirst(7);
		ll.addAtFirst(3);
		ll.addAtFirst(8);
//	    ll.printList();
	    System.out.println();
	    int temp = ll.search(3 ,head);
	    if(temp==0 && head!=null)
	    	System.out.println("Key not found.");
	    else if(head!=null)
	    	System.out.println("Key found.");
	    
		

	}

}
