package Searching;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,4,0,33,66,44,98,56,23,43,31};
		int search = 98;
		int temp=0;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]== search)
			{
				System.out.println("element is at "+i+" position.");
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Item not found.");
		}
		

	}

}
