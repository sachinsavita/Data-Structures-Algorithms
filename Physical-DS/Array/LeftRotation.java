package Array;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,9,6,2,5,7,11,16};
		System.out.println("Length of the array: "+a.length);
		System.out.print("index/value Before rotating: ");
		
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+",");
		}
		 
		int first =a[0]; //Focus
		
		for(int i=0;i<a.length-1;i++)
		{
		   a[i] = a[i+1];
		}
		a[a.length-1] = first;   //Focus
		System.out.println();
        System.out.print("index/value after rotation: ");
		
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+",");
		}
 
	}

}
