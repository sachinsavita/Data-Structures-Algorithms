package Array;


public class AllAboutArray {
	
	//Insertion
	public static void insertAt(int arr[],int key,int index)
	{
		if(arr[arr.length-1]>0)
		{
			System.out.println("IndexOutOfBound");
		}

           for(int i=arr.length-1;i>index;i--)
           {
        	   arr[i] = arr[i-1];
           }
           arr[index] = key;
	}
	
	//DisplayAll
	public static void display(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	//Delete
	public static int delete(int arr[],int index)
	{
		if(index>=0 && index<arr.length)
		{
			int x = arr[index];
			for(int i=index;i<arr.length-1;i++)
			{
				arr[i] = arr[i+1];
			}
			
			return x;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int length = 10;
		int arr[] = new int[length];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		int n = arr.length;
		AllAboutArray.display(arr);
		System.out.println();
		System.out.println(n);
		
		AllAboutArray.insertAt(arr, 3, 2);
		AllAboutArray.insertAt(arr, 7, 6);
		AllAboutArray.insertAt(arr, 8, 7);
		AllAboutArray.insertAt(arr, 9, 8);
		AllAboutArray.insertAt(arr, 10, 9);
		
		System.out.println(AllAboutArray.delete(arr, 8));
	
		AllAboutArray.display(arr);
	}

}
