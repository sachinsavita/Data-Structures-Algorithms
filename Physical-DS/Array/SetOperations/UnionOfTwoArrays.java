package Array.SetOperations;

//Union into third array
//Two conditions
//1. When arrays are not sorted it take --  --  O(n^2)

//2. When arrays are sorted it take -- -- O(n)

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = { 3, 8, 16, 20, 25 };
		int B[] = { 4, 8, 25, 30, 50 }; 

		int C[] = new int[A.length + B.length];
		
		
		//When sorted
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i< A.length && j<B.length)
		{
			if(A[i]==B[j])
			{
				i++;           //or j++    not both otherwise will miss the equeal element
			}
			
	        	else if (A[i] < B[j]) {
					C[k++] = A[i++];
					
				}
				else {
					C[k++] = B[j++];
					
				}
			
		}
		for(;i<A.length;i++)
		{
			C[k++] = A[i];
		}
		for(;j<B.length;j++)
		{
			C[k++] = B[j];
		}
		
		for(int x: C)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("If Not Sorted");
		//If not sorted===================================================
		
		int D[] = { 16, 8, 16, 2, 25 };
		int E[] = { 25, 2, 12, 8, 23 }; 

		int F[] = new int[D.length + E.length];
		
		
		 i = 0;
		 j = 0;
		 k = 0;
		 boolean flag = true;
		
		while(i< D.length && j<E.length)
		{
			
		
	        	if (D[i] <E[j]) {
	        		
	        		for(int z = 0;z<F.length;z++)
	        		{
	        			if(D[i]==F[z])
	        				flag = false;
	        		}
	        		if(flag==true)
					F[k++] = D[i++];
	        		else {
	        			i++;}
	        		flag = true;
					
				}
				else {
					
					for(int z = 0;z<F.length;z++)
	        		{
	        			if(E[j]==F[z])
	        				flag = false;
	        		}
	        		if(flag==true)
	        		F[k++] = E[j++];
	        		else {
	        			j++;}
	        		flag = true;
					
					
				}
			
		}
		for(;i<D.length;i++)
		{
			for(int z = 0;z<F.length;z++)
    		{
    			if(D[i]==F[z])
    				flag = false;
    		}
    		if(flag==true)
			F[k++] = D[i++];
    		else {
    			i++;}
    		flag = true;
		}
		for(;j<E.length;j++)
		{
			for(int z = 0;z<F.length;z++)
    		{
    			if(E[j]==F[z])
    				flag = false;
    		}
    		if(flag==true)
    		F[k++] = E[j++];
    		else {
    			j++;}
    		flag = true;
		}
		
		for(int x: F)
		{
			System.out.print(x+" ");
		}

	}

}
