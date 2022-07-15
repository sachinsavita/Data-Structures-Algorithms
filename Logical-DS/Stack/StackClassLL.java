package Stack;

public class StackClassLL {
	
	static int smaller = 0;
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	static class Stack
	{
		
		public static Node top;
		//ISEMPTY()
		public static boolean isEmpty()
		{
			return top==null;
		}
		//PUSH
		public static void push(int data)
		{
			Node newNode = new Node(data);
			
			if(isEmpty())
			{
				top = newNode;
				smaller = newNode.data;
				System.out.println("First element in the stack. " +newNode.data);
			}
			else 
			{
				newNode.next = top;
			top = newNode;
			if(newNode.data<smaller)
			{
				smaller = newNode.data;
			}
			System.out.println("New element in the stack."+newNode.data);
			}
		}
		//POP
		public static int pop()
		{
			if(top==null)     //can also use isEmpty() function
			{
				System.out.println("Stack is empty.");
				return -1;
			}
			else 
			{
				int a = top.data;
			top = top.next;
			return a;
			}
		}
		//Peek
		public static int peek()
		{
			if(top==null)
				return -1;
			else
			{
//				System.out.println("Top element is: "+top.data);
				return top.data;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(6);
		s.push(12);
		s.push(3);
		s.push(34);
        s.push(55);
        s.push(44);
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
//		System.out.println(s.peek());
		
		
		System.out.println("Smaller elemet in the stack is: "+smaller);
	}

}
