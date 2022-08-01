package Array.SetOperations;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {3,4,5,6,10};

		int B[] = {2,4,5,7,10};

		int C[] = new int[A.length];
		
		int i =0;
		int j = 0;
		int k = 0;
		 
		for(i=0;i<A.length;i++)
		{
			j = 0;
			boolean flag = false;
			while(j<B.length)
			{
				if(A[i]==B[j])
				{
					flag = true;
					break;
				}
				else
					j++;
			}
			
			if(flag==false)
			{
				C[k] = A[i];
				k++;
			}
		}
		System.out.print("[");
		for(int x: C)
		{
			System.out.print(x+",");
		}
		System.out.println("]");
		

	}

}
