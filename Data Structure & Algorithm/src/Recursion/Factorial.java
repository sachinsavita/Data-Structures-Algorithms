package Recursion;

public class Factorial {
	
	public static int printFactorial(int n)
	{
		if(n==0)
			return 1;
		else
		return printFactorial(n-1)*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printFactorial(3));
	}

}
