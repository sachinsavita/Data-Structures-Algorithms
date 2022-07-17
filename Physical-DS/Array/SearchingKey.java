package Array;

public class SearchingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3,9,6,2,5,11,16,7};
		int key = 11;
		int count = 0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==key) //Focus
			{
				System.out.println("Element is at position : "+i);
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("Element not found.");
		}

	}

}
