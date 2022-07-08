package Sorting;
public class MergeSort {
	
	int[]array;
	int[] tempMergeArray;
	int length;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] inputArr = {48,36,13,52,19,94,21};
		MergeSort ms= new MergeSort();
		ms.sort(inputArr);
		for(int i:inputArr)
		{
			System.out.print(i+" ");
		}
	}
	public void sort(int inputArr[])
	{
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArray = new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex +(higherIndex - lowerIndex)/2;
			
			//it will start the left side of the array
			divideArray(lowerIndex , middle);
			//it will sort right side of the array
			divideArray(middle+1, higherIndex);
			mergeArray(lowerIndex,middle,higherIndex);
		}
		
	}
	
	  public void mergeArray(int lowerIndex, int middle, int higherIndex)
	  {
		  for(int i = lowerIndex;i<=higherIndex;i++)
		  {
			  tempMergeArray[i] = array[i];
		  }
		  int i = lowerIndex;
		  int j = middle+1;
		  int k = lowerIndex;
		  
		  while(i<=middle && j<=higherIndex)
		  {
			  if(tempMergeArray[i]<= tempMergeArray[j])
			  {
				  array[k] = tempMergeArray[i];
				  i++;
			  }
			  else
			  {
				  array[k] = tempMergeArray[j];
				  j++;
			  }
			  k++;
		  }
		  while(i<=middle)
		  {
			  array[k] = tempMergeArray[i];
			  k++;
			  i++;
		  }
	  }

}
