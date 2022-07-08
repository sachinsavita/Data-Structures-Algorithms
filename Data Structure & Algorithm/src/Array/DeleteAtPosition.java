package Array;

import java.util.Scanner;

public class DeleteAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] =new int [20];
		a[0] = 2;
		a[3] = 9;
		a[5] = 19;
		a[7] = 62;
		a[9] = 70;
		System.out.print("Elements before inserting (index/value): ");
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+", ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter the index (< 20) at which you want to delete: ");
	    int index = sc.nextInt();
	    for(int i=index;i<a.length-1;i++)
	    {
	    	a[i] = a[i+1];
	    }
	    System.out.println("Array after deleting the element: ");
	    for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+", ");
		}
	}

}
