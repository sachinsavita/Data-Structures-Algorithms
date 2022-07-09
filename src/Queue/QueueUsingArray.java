package Queue;

public class QueueUsingArray {
	
	//Initializing queue
	static class Queue
	{
		
			static int size = 0;
			static int arr[] = new int[size];
			static int Rear = -1;
	
		
		//Queue constructor
		Queue(){}
		Queue(int n)
		{
			Queue.size = n;    //first assign size then assign to array
			arr = new int[n];
			
		}
		
		//isEmpty()
		public static boolean isEmpty()
		{
			return Rear == -1;
		}
		
		//isFull
		public static boolean isFull()
		{
			return Rear == size -1;
		}
		
		//Enqueue
		public static void enqueue(int data)
		{
			if(Rear==size-1) {
				System.out.println("Queue is full......");
				return;
			}
		
				Rear++;
				arr[Rear] = data;
				System.out.println("Element added @ position: "+Rear);
			
		}
		
		//Dequeue
		public static int dequeue()
		{
			if(isEmpty()) {
				
				System.out.println("Queue is empty......");
				return -1;
			}
			else
			{
				int front = arr[0];
				System.out.println("Dequeuing....."+front );
				
				for(int i = 0;i<Rear;i++)  //Shifting element towords left
				{
					arr[i] = arr[i+1];
				}
				
				Rear--;
				return front;
			}			
		}
		
		//Peek
		public static int peek()
		{
			if(isEmpty())
				return -1;
			else
			{
				return arr[0];
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue(5);
		
		Queue.enqueue(1);
		Queue.enqueue(3);
		Queue.enqueue(5);
		Queue.enqueue(7);
		Queue.enqueue(9);
		Queue.enqueue(11);
		
		while(!Queue.isEmpty())
		{
			Queue.dequeue();
		}	
		 
		Queue.dequeue();
		
		

	}

}
