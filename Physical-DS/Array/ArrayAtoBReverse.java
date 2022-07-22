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
		int n = A.length;
		System.out.println("Before reversing A");
		for(int i=0;i<n;i++)
		{
            System.out.print(A[i]+" ");
		}
		
		System.out.println();
		//Reversing Array A itself
		
		int start = 0;
		int end = n-1;
		int temp = 0;
		while(start<end)
		{
			temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			
			start++;
			end--;
		}
		for(int i=0;i<n;i++)
		{
            System.out.print(A[i]+" ");
		}
		
		
	}

}
