package Array;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,9,6,2,5,7,11,16};
		System.out.println("Length of the array: "+a.length);
		System.out.print("index/value Before rotating: ");
		
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+",");
		}
		 
		int last =a[a.length-1];    //Focus
		
		for(int i=a.length-2;i>=0;i--)
		{
		   a[i+1] = a[i];
		}
		a[0] = last;    //Focus
		System.out.println();
        System.out.print("index/value after rotation: ");
		
		for(int x=0;x<a.length;x++)
		{
			System.out.print(x+"/"+a[x]+",");
		}
 
	}

}
