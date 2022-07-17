package Array;

public class ArraySizeIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1,2,3,4,5};
		System.out.println(A.length);
		//Increasing the size
		int B[] = new int[2*A.length];  //Focus
		
		//Copying
		for(int i=0;i<A.length;i++)
		{
			B[i] = A[i];
		}
		
		
		
		//Assigning bigger array to A
		A = B;                               //Assigned B to A
		System.out.println(A.length);
		System.out.println("Array now: ");
		for(int x : A)
		{
			System.out.print(x+ ", ");
		}
		
		
		
	}

}
