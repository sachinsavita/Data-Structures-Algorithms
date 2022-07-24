package Array;

import java.util.Arrays;

public class NegativesOnLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { -3, 4, -6, 12, -1, 111, -116, 117 };
		
		int start = 0;
		int end = A.length-1;
		
		while(start<end)
		{
			if(A[start]>0 && A[end]<0)
			{
				int temp = A[start];
				A[start] = A[end];
				A[end] = temp;
			}
			if(A[start]<0)
			{
			start++;
			}
			if(A[end]>0)
			{
				end--;
			}
		}
		
// Easiest way:     Arrays.sort(A);
		
		for(int x:A)
		{
			System.out.print(x+" ");
		}
		
//Other way======================================================================
		System.out.println();
		int B[] = { -3, 4, -6, 12, -1, 111, -116, 117 };
		
		int i=0;
		int j=B.length-1;
	while(i<j) 
	{	
		while(B[i]<0) {i++;}
		while(B[j]>=0) {j--;}
		
		if(i<j)
		{
			int temp = B[i];
			B[i] = B[j];
			B[j] = temp;
		}
	}
	    for(int y: B) {
		System.out.print(y+" ");
	    }
	}

}
