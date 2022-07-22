package Array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {00,11,22,33,44,55,66,77,88,99};
		
		int n = A.length;
		System.out.println("Before reversing Array");
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
		System.out.println("After reversing Array");
		for(int i=0;i<n;i++)
		{
            System.out.print(A[i]+" ");
		}
	}

}
