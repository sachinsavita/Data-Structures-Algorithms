package Array;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,9,6,2,5,11,16,7};
		int max1, max2;
		max1 = max2 =a[0];
		for(int i=0;i<a.length-1;i++)
		{
		   if(a[i]>max1)
		   {
			   max2 = max1;
			   max1 = a[i];
			   
		   }
		   else if(a[i]>max2)
		   {
			   max2 = a[i];
			   
			   
		   }
			
		}
		System.out.println("The second maximum value of this Array is: "+max2);

	
	}

}
