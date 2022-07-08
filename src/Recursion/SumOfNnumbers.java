package Recursion;

public class SumOfNnumbers {
	
	static int sum =0;
	public static int printSum(int m, int n)
	{
	 if(n>m)
	  printSum(m, n-1);
	 
	  return sum = sum +n;
	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(printSum(1,5));
	}

}
