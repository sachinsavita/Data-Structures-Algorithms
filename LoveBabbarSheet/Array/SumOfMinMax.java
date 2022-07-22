package Array;

public class SumOfMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {-2, 1, -4, 5, 3};
		System.out.println(A.length);
		int sum = 0;
        int min = 100000000;
        int max =0;
        for(int x : A)
        {
            if(x<min)
            min = x;
            else if(x>max)
            max = x;
        }
        System.out.println(max+min);
	}

}
