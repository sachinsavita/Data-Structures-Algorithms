package Array;

import java.util.Collection;

public class Test {

	public static void main(String args[])
	{
		
		String x = "aabbaa";
		
		int length = x.length();
		System.out.println(length);
        int start = 0;
        int end = length-1;
        
        System.out.println(x.charAt(start));
        System.out.println(x.charAt(end));
        if(length%2!=0)
        {
            System.out.println("Not balanced");
        }
        else if(length%2==0)
        {
            for(int i=0;i<length/2;i++)
            {
                if(x.charAt(start)!=x.charAt(end))
                {
                	System.out.println("Not balanced");
                }
                start++;
                end--;
            }
        }
        
        	
        
		
		
	     
	}
}
