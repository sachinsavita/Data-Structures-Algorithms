package Array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {00,11,22,33,44,55,66,77,88,99};
		String S = "abba";
		char [] ch = S.toCharArray();
		int n = ch.length;
		System.out.println("Before reversing Array");
		for(int i=0;i<n;i++)
		{
            System.out.print(ch[i]+" ");
		}
		
		System.out.println();
		//Reversing Array A itself
		
		int start = 0;
		int end = n-1;
		char temp = 0;
		while(start<end)
		{
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("After reversing Array");
		for(int i=0;i<n;i++)
		{
            System.out.print(ch[i]+" ");
		}
		
		String st = new String(ch);    //Right w ay
		
		String str = ch.toString();   //Wrong way
		
		if(S.equals(st))
			System.out.println(true);
		else
			System.out.println(false );
	}

}
