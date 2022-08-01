package Array.SetOperations;

public class UnionOnTwoUnSortedArrays{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 3, 5, 7, 4, 6 };

		int B[] = { 12, 4, 7, 2, 5 };

		int C[] = new int[10];

		for (int i = 0; i < A.length; i++) {
			C[i] = A[i];
		}

		
		int n = A.length;
		
		for (int i = 0; i < B.length; i++)
		{
			int j = 0;
			boolean flag = false;
			while(j<C.length)    //Checking if already present or not
			{
				if(C[j]==B[i])
				{
					flag = true;
					break;
				}
				else
					j++;
			}
			if(flag==false)
			{
				C[n] = B[i];
				n++;
			}
			
			
		}

		for (int x : C) {
			System.out.print(x + " ");
		}
	}

}
