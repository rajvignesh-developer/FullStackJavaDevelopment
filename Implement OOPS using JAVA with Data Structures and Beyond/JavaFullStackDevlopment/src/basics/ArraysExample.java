package basics;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
				
		System.out.println("Sum of Numbers");
		System.out.println("***************");
		
		System.out.println("input the number of values you want to Sum:");
		int n = in.nextInt();
		int[] num = new int[n];
		int sum = 0;
		
		
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter the "+(i+1)+" numer: ");
			num[i] = in.nextInt();
			
			sum = sum + num[i];
		}
		
		System.out.println("\nThe Sum of Values: "+sum);

		
		
		in.close();
	}

}
