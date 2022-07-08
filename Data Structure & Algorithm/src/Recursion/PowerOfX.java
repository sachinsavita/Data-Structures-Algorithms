package Recursion;

public class PowerOfX {

	public static int powerof(int m, int n)
	{
		 
		if (n == 0)
		{

			return 1;
		}
                
		return powerof(m, n - 1)*m;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerof(2, 9));

	}

}
