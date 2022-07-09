package Sorting;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int length = scan.nextInt();
        
        int[] a = new int[length];
        
        System.out.print("Enter "+length+" numbers for sorting: ");
        
        for(int i=0; i<length;i++)
        {
          a[i] = scan.nextInt();	
        }
        scan.close();
		
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}
		}
		System.out.print("Sorted values are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
	}
	
	

}
