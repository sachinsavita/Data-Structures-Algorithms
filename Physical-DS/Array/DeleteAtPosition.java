package Array;

import java.util.Scanner;

public class DeleteAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] =new int [10];
		a[0] = 2;
		a[1] = 9;
		a[2] = 19;
		a[3] = 62;
		a[4] = 70;
		a[5] = 80;
		a[8] = 100;
		a[6] = 990;
		a[7] = 670;
		a[9] = 480;
		int n = a.length;
		System.out.println("Lenghth: "+n);
		System.out.println("Elements before deleting (index/value): ");
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+", ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter the index (< 10) at which you want to delete: ");
	    int index = sc.nextInt();
	    
	    if(index==a.length-1)
	    {
	    a[index] = 0;
	    }
	    else
	    {
	    for(int i=index;i<a.length-1;i++)
	    {
	    	a[i] = a[i+1];
	    }
	      a[a.length-1] = 0;
	    }
	    System.out.println("Array after deleting the element: ");
	    for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+", ");
		}
	}

}
