package Array;

import java.util.HashSet;

public class FindUnionLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,0,4,5,6,7};
		int b[] = {8,9,10,3,5,6,8};
		HashSet<Integer> hs = new HashSet<>();

		for (int x : a) {
			hs.add(x);
		}
		for (int x : b) {
			hs.add(x);
		}

		System.out.println(hs.size());
	}

}
