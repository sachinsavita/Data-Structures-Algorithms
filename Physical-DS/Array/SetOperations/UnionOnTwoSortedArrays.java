package Array.SetOperations;

public class UnionOnTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = { 3, 4,5,6,10};

		int B[] = { 2,4,5,7,12};

		int C[] = new int[10];
		
		int i = 0;
		int k = 0;
		int j = 0;
		
		while(i<A.length && j<B.length)
		{
			if(A[i]<B[j])
			{
				C[k] = A[i];
				i++;
				k++;
			}
			
			else if(B[j]<A[i])
			{
				C[k] = B[j];
				k++;
				j++;
			}
			else if(A[i]==B[j])
			{
				C[k] = A[i];
				k++;
				i++;
				j++;
			}
		}
		//If elements left in any arrays
		for(;i<A.length;i++)
		{
			C[k] = A[i];
		}
		for(;j<B.length;j++)
		{
			C[k] = B[j];
		}
		
		for(int x: C)
		{
			System.out.print(x+" ");
		}

	}

}
