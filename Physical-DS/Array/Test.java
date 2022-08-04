package Array;

import java.util.Arrays;
import java.util.Collection;

public class Test {

	public static void main(String args[])
	{
		
		 
		int A[] = {1,2,3,4,5};
		int B[] = new int [10];
		
		for(int i=0;i<A.length;i++)
		{
			B[i] = A[i];
			
		}  
		A = B;
		System.out.println(A.length);
		
		for(int x: A)
		{
			System.out.print(x+" ");
		}
	     
	}
}
