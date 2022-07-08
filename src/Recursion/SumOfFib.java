package Recursion;

public class SumOfFib {
	
	public static int sumFib(int n)
	{
		if(n<=1)
			return n;
		else
			return sumFib(n-1)+sumFib(n-2)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFib(5));

	}

}
