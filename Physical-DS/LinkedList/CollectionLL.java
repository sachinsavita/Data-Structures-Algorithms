package LinkedList;

import java.util.LinkedList;

public class CollectionLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		
		
		ll.add("is");
		ll.add("a");
		ll.addFirst("This");
		ll.addLast("list");
		System.out.println(ll);
		System.out.println(ll.size() );
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		ll.removeFirst();
		ll.remove(0);
		System.out.println();
		System.out.println(ll);
		
		

	}

}
