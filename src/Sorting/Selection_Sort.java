package Sorting;

import java.util.Scanner;

public class Selection_Sort {
	
	public static void main(String[] args) {
		
		int i,j,min;
		int temp=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array: ");
		int length = scan.nextInt();
		int[]a = new int[length];
		System.out.print("Enter the "+length+ " numbers to Sort using Selection Sort: ");
		
		for(i=0;i<length;i++)
		{
			a[i] = scan.nextInt();
		}
		scan.close();
		
		
		
		
		for(i=0;i<a.length;i++)
		{
			min=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			temp = a[i];
			a[i]= a[min];
			a[min]= temp;
			
		}
		System.out.print("Sorted Array is: ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
