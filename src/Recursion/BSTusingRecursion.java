package Recursion;

// Time complexity f(n) = O(log n)
// Recurrence relation t(n) = t(n/2) + 1

public class BSTusingRecursion {
	
	public static int bstSearch(int []a, int l, int h, int key)
	{
		
		int mid = 0;
		if(l==h)
		{ 
			if(a[l]==key)
			{
				return l;
				 
			}
			else
				return 0;
		}
		else
			mid = (l+h)/2;
		
		    if(a[mid]==key)
		    {
		    	return mid;
		    }
			if(a[mid]>key) 
			{
		     return bstSearch(a, l, mid-1,key);
			}
			else
				return bstSearch(a, mid+1, h, key );
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {0,2,3,5,7,8,9,12,34,56,78,89};
		int key = 12;
		int n = a.length;
		
		System.out.println(n);
		int result = bstSearch(a,0,n-1,key);
		
		if(result == 0)
		{
			System.out.println("Element not in the array.");
			
			
		}
		else
			System.out.println("Element at index: "+result);
			

	}

}
