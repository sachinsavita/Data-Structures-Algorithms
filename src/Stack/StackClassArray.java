package Stack;

public class StackClassArray {
	
	//Defines stack class
	static class Stack
	{
		int size=5;
		int top = -1;
		int S[] = new int[size];
		
		//Push
		public void push(int x)
		{
			//isFull()
			if(top==size-1)
			{
				System.out.println("Stack is overflow.");
			}
			else
			{
				top++;
				S[top] = x;
				System.out.println("Element added.");
			}
		}
		
		//Pop
		public int pop()
		{
			int x = -1;
			
			//isEmpty()
			if(top==-1)
			{
				System.out.println("Stack is underflow.");
			}
			else
			{
				x = S[top];
				top--;
				
			}
			return x;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		

	}

}
