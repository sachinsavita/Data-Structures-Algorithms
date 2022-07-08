package Recursion;



public class PrintNnumber {
	
	public static void printNumb(int n)
	{
		if(n>0)
		{
			
			printNumb(n-1);
			System.out.print(n+" ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNnumber.printNumb(3);

	}

}
