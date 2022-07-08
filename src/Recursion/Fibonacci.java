package Recursion;

public class Fibonacci {
	
	public static void printFib(int t0, int t1, int n)
	{

		if(t0==0 && t1 ==1)
		{
			System.out.print(t0+" "+t1+" ");
			n=n-2;
		}
		if(n>0)
		{
			int t2 = t0+t1;
			System.out.print(t2+" ");
			t0 = t1;
			 t1 =  t2;
		
			printFib(t0, t1, n-1);
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFib(0,1,5);

	}

}
