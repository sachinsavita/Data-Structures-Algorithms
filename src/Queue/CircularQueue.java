package Queue;

public class CircularQueue {

	
	//Initializing queue
		static class Queue
		{
			
				static int size = 0;
				static int arr[] = new int[size];
				static int Rear = -1;
				static int front = -1;
		
			
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
				return front==Rear;
			}
			
			//isFull
			public static boolean isFull()
			{
				return (Rear+1)%size == front;
			}
			
			//Enqueue
			public static void enqueue(int data)
			{
				if(isFull()) {   //return Rear+1 == front;
					System.out.println("Queue is full......");
					return;
				}
				else if(front==-1) {
					front =0;
				}
					
					Rear = (Rear+1)%size;
					arr[Rear] = data;
					System.out.println(data+" added @ position: "+Rear);
				
			}
			
			//Dequeue
			public static int dequeue()
			{
				int x = -1;
				if(front == Rear) {   //return Rear == front;
					
					System.out.println("Queue is empty......");
					return -1;
				}
				
				else
				{
					front = (front+1)%size;
					 x = arr[front];
//					System.out.println("Dequeuing..... "+x );
					
				}
				return x;
			}
			
			//Peek
			public static int peek()
			{
				if(isEmpty())
					return -1;
				else
				{
					return arr[front];
					
				}
			}
			
			
			
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue(5);
		      Queue.enqueue(5);
		      Queue.enqueue(7);
		      Queue.enqueue(9);
		      Queue.enqueue(13);
		      Queue.enqueue(17);
	
		      
		      System.out.println();
		      for(int i=0;i<size;i++)
		      {
		    	  System.out.print(arr[i]+"@"+i+"  ");
		      }
		      
		      System.out.println();
		      System.out.println();
		      
		      while(!Queue.isEmpty())
		      {
		    	  System.out.println(Queue.peek());
		    	  Queue.dequeue();
		      }
		      
		     
		      
		
	}

}
}
