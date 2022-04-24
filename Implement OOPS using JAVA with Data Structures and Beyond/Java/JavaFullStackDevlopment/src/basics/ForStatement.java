package basics;

import java.util.Scanner;

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("This is a Multiplction Table using For Loop");
		System.out.println("Enter The Number to be Multiplied");
		int num1 = in.nextInt();
		System.out.println("Enter the Number of times to Multiply");
		int num2 = in.nextInt();
		
		for(int i=1;i<=num2;i++)
		{
			int num3 = num1*i;
			System.out.println(+num1+"*"+i+"="+num3);
		}
		
		
		
		in.close();
		
	}

}
