package Array;


//In case of merging the time complexity will be O(m+n)

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 3, 8, 16, 20, 25 };
		int B[] = { 4, 8, 12, 18, 23 }; 

		int C[] = new int[A.length + B.length];

		
		int i=0, j=0, k = 0;

		while(i< A.length && j<B.length)
		{
			
				if (A[i] < B[j]) {
					C[k] = A[i];
					k++;
					i++;
					
				}
				else {
					C[k] = B[j];
					k++;
					j++;
					
				}
			
		}
		
		//if elements left in any array.
		
		for(;i<A.length;i++)
		{
			C[k++] = A[i];
		}
		for(;j<B.length;i++)
		{
			C[k++] = B[j];
		}
		
		for(int x: C)
		{
			System.out.print(x+" ");
		}

	}

}
