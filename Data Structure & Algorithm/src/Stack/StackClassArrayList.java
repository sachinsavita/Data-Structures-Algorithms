package Stack;

import java.util.ArrayList;

public class StackClassArrayList {
	
	static class Stack
	{
		static ArrayList<Integer> list = new ArrayList<>(); 
		
		//ISEMPTY()
		public static boolean isEmpty()
		{
			return list.size()==0;
		}
		
		//PUSH
		public static void push(int data)
		{
			list.add(data);
//			System.out.println(data);
		}
		//POP
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
//			System.out.println(top);
			return top;
		}
		//PEEK
		public static int peek()
		{ 
			if(isEmpty())
			{
				return -1;
			}
			else
				return list.get(list.size()-1);
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
