package Array2D;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [][]a = {{3,2,1},{4,5,6},{9,8,7}};
		 int [][]b = {{1,0,0},{0,1,0},{0,0,1}};
		 
		 int[][]c = new int[3][3];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<b.length;j++)
			 {
				 c[i][j] = 0; 
				 for(int k=0;k<c.length;k++)
				 {
					 c[i][j] = c[i][j]+a[i][k]*b[k][j];
				 }
			 }
		 }
		  
		 for(int []x: c)
		 {
			 for(int y: x)
			 {
				 System.out.print(y);
			 }
			 System.out.println();
		 }
		 

	}

}
