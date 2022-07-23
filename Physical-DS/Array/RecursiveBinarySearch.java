package Array;

public class RecursiveBinarySearch {
	
	//Best Case:O(1)   When element found in one comparision only

	//Worst Case:O(log n)   For unsuccessful search or elemnt found at last
	
	public static int RBinarySearch(int arr[], int key, int l, int h) {

		int mid = 0;
		if (l != h) {
			mid = (l + h) / 2;
			if (arr[mid] == key) {
				return mid;
			} else {
				if (arr[mid] > key)
					return RBinarySearch(arr, key, l, mid - 1);
				else if (arr[mid] < key)
					return RBinarySearch(arr, key, mid + 1, h);
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 3, 4, 6, 12, 15, 111, 116, 117 };
		int key = 116;
		int count = 0;
		int l = 0;
		;
		int h = A.length - 1;
		int mid = 0;
		
	   System.out.println("Element is at positionL "+RecursiveBinarySearch.RBinarySearch(A, key, l, h));
	}

}
