package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LLHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter five numbers and I will remove which will be greater than 25: ");
		for(int i=0;i<5;i++)
		{
			ll.addLast(sc.nextInt());
		}
		
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i)>25)
			{
				ll.remove(i);
			}
		}
		System.out.println();
		System.out.print(ll);

	}

}
