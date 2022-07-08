package Sorting;

//Recursion 

public class MergeSortDemo {
	
	static void mergeSort(int arr[], int l, int h)
	{
		int mid = 0;
		if(l<h)
		{
			mid = (l+h)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, h);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,7,3,9,2,6,4,5,9};
		int l =0;
		int h = 8;
		System.out.println();
		

	}

}
