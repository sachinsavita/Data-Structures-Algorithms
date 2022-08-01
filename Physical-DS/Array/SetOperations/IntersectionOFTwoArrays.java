package Array.SetOperations;

public class IntersectionOFTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {88,32,67,100,333,77,234};

		int B[] = {88,32,67,10,333,77,234};

		int C[] = new int[A.length];
		int k = 0;
		for(int i=0;i<A.length;i++)
		{
			int j = 0;
			while(j<B.length)
			{
				if(A[i]==B[j])
				{
					C[k] = A[i];
					k++;
					break;
				}
				else
					j++;
			}
		}
		
		for(int x: C)
		{
			System.out.print(x+" ");
		}

	}

}
