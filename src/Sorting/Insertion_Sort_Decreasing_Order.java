package Sorting;
                           //Just change > to <
public class Insertion_Sort_Decreasing_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[] = {8,5,3,7,9,1,56,23,45,45,45,45,12,78,95,34,27,98,67,83,67};
		int key = 0;
		for(int i=1;i<arr.length;i++)
		{
			int j = i-1;
			key = arr[i];
			while(j>=0 && arr[j]<key)      //Just change > to <
			{
				arr[j+1] = arr[j]; //Shifting elements till not find shorter element than key 
				j--;
			}
			arr[j+1] = key;   //After shifting j+1 space id vacant 
		}
		
		for(int x : arr)
		{
			System.out.print(x+" ");
		}

	}

}
