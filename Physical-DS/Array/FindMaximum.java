package Array;

public class FindMaximum {
	
	public static int max(int a[])
	{
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}

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
		a[6] = 90;
		a[7] = 070;
		a[9] = 480;
		int n = a.length;
		System.out.println("Lenghth: "+n);
		System.out.println("Elements (index/value): ");
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+", ");
		}
		System.out.println();
		System.out.println(FindMaximum.max(a));
		
		
	}

}
