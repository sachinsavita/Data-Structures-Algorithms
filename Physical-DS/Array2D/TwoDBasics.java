package Array2D;

public class TwoDBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int b[][];
		b = new int [3][];
		b[0] = new int [5];
		b[1] = new int [3];
		b[2] = new int [7];
		
		 
		//Using for loop
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			} 
			System.out.println();
		}
		System.out.println("...................................................");
		//Using for each
		for(int x[] : a)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		

	}

}
