package Array;

public class ArrayAtoBReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {00,11,22,33,44,55,66,77,88,99};
		int B[] = new int[10];
		int j = 0;
		for(int i=A.length-1;i>=0;i--)
		{
			
			B[j] = A[i];
			j++;
		}
		
		for(int x:B)
		{
			System.out.print(x+", ");
		}
	}

}
