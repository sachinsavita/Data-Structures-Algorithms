package Array;

public class KadanesAlgorithm_OR_maxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{-83 -66 100 -77 79 -98 -60 -47 70 -6 -22 98 -17 -100 -1 -99 62 -91 -54 -90 -96 67 37 -60 -61}
		
//      {-1,-2,-3,-4}	
		int arr[] = {-1,-2,-3,-4};
		int n= arr.length;
		
		
		long max_so_far=0;
        long max_ending_here=0;
        long min = -10000000; //if all elements are negative
        for(int i=0;i<n;i++)
        {
            max_so_far = max_so_far+ arr[i];
            
            if(arr[i]>min && arr[i]<0) //if all elements are negative
            {
                min = arr[i];
            }
            if(max_so_far<0)
            {
                max_so_far = 0;
            }
            if(max_ending_here<max_so_far)
            {
                max_ending_here  =  max_so_far;
            }
        }
        if(max_ending_here>0)
        System.out.println(max_ending_here);
        else
        System.out.println(min); //if all elements are negative

	}

}
