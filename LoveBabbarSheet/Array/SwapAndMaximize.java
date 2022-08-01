package Array;

import java.util.Arrays;

public class SwapAndMaximize {

	public static void main(String args[])
	{
		
	
	long arr[] = {80 ,40, 76, 100, 36, 20, 49, 92, 8};
	int n = 9;
	
	
	Arrays.sort(arr);
	
	for(long i : arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
       
	 long ARR[] = new long[n];    // For rearranging array
     int start = 0;   //will help in rearranging
     int end = n-1;    //will help in rearranging
     long sum = 0;
       
       for(int i=0;i<n-1;i++)    //Rearranging elements {min, max, secondMin, secondMax..........}
       {
    	
           ARR[i] = arr[start];
           i++;
           ARR[i] = arr[end];
           start++;
           end--;
       }
       if(n%2!=0)    //if elemets are not even
       {
    	   ARR[n-1] = arr[start];
       }
       
       
       for(long x: ARR)
       {
    	   System.out.print(x+" ");
       }
       System.out.println();
       
       for(int i=0;i<n-1;i++)
       {
           sum = sum +(Math.abs(ARR[i]-ARR[i+1]));   //Math.abs() for converting -ve into +ve
       }
       
       start = 0;
       end = n-1;
       
       sum = sum +Math.abs(ARR[end]-ARR[start]);
    	
    System.out.println(sum);
}   
}
