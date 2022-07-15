package LinkedList;

import LinkedList.LL.Node;

public class MaxElement {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			
			this.data = data;
			this.next = null;
		}
	}

	// AddFirst
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxElement ll = new MaxElement();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addFirst(15);

		System.out.println(ll);

		System.out.println(maxNum(head));

	}

}
