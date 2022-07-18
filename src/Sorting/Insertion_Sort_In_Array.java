package Sorting;

public class Insertion_Sort_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,5,3,7,9,1};
		int key = 0;
		for(int i=1;i<arr.length;i++)
		{
			int j = i-1;
			key = arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for(int x : arr)
		{
			System.out.println(x+" ");
		}

	}

}
