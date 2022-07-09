package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,7,9,22,33,44,55,66,77,88,99,102,104,444,567};
		int li=0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;
		System.out.println(mi);
		int search = 77;
		
		while(li<=hi)
		{
			if(arr[mi]== search)
			{
				System.out.println("element is at "+mi+" index position.");
				break;
			}
			else if(arr[mi] < search)
			{
				li = mi+1;
			}
			else
			{
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}
		
		if(li>hi)
		{
			System.out.println("Item not found.");
		}

	}

}


//public static int search(int arr[], int x) 
//{ 
//    int n = arr.length; 
//    for(int i = 0; i < n; i++) 
//    { 
//        if(arr[i] == x) 
//            return i; 
//    } 
//    return -1; 
//} 
//  
//public static void main(String args[]) 
//{ 
//    int arr[] = { 2, 3, 4, 10, 40 };  
//    int x = 10; 
//      
//    int result = search(arr, x); 
//    if(result == -1) 
//        System.out.print("Element is not present in array"); 
//    else
//        System.out.print("Element is present at index " + result); 
//}
