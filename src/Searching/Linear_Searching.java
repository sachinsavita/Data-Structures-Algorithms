package Searching;

import java.util.Scanner;

public class Linear_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int length = scan.nextInt();
        
        int[] a = new int[length];
        
        System.out.println("Enter "+length+" numbers for searching: ");
        for(int i=0; i<length;i++)
        {
          a[i] = scan.nextInt();	
        }
        scan.close();
        
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==10)
        	{
        		System.out.println("The index value of the "+a[i]+ " is " +i);
        	}
        }
	}

}
