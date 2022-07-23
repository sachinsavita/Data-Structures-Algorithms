package Array;

public class CheckArraySorted {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		int A[] = { 3, 4, 6, 12, 1, 111, 116, 117 };
		boolean flag = true;
		for(int i=0;i<A.length-1;i++)
		{
			if(A[i+1]<A[i])
			{
				flag = false;
			}
			
		}
		
		if(flag == true)
		{
			System.out.println("Sorted");
		}
		else
			System.out.println("Array Not Sorted");
	}

}
