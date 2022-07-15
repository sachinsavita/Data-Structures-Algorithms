package Array;

import java.util.Scanner;

public class InsertAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int [20];
		a[0] = 2;
		a[3] = 9;
		a[5] = 19;
		a[7] = 62;
		a[9] = 70;
		System.out.print("Elements before inserting: ");
		for(int x : a)
		{
			System.out.print(x+", ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
	    int key = sc.nextInt();
	    System.out.println("Enter the index (< 20) at which you want to insert: ");
	    int index = sc.nextInt();
	    if(a[index] == 0)
	    {
	    	a[index] = key;
	    }
	    else
	    	for(int i=a.length-1;i>=index;i--)
	    	{
	    	   // a[i+1]	 = a[i];
	    	    //or
	    	    a[i] = a[i-1];
	    	   
	    	}
	    a[index] = key;
	    
	    for(int x : a)
	    {
	    	System.out.print(x+" ,");
	    }
		

	}

}
