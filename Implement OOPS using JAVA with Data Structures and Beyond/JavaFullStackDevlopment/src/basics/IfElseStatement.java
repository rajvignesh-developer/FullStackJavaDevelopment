package basics;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Arthematic Operation using IfElse Statement");
		System.out.println("********************************************");
		System.out.println("Enter First Number:");
		int num1 = in.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = in.nextInt();
		System.out.println("Enter the type of operation you want to:");
		System.out.println("1. Addition:");
		System.out.println("2. Subtraction:");
		System.out.println("3. Multiplication:");
		System.out.println("4. Division:");
		
		int i = in.nextInt();
		
		if(i == 1)
		{
			System.out.println("The Sum is: "+(num1+num2));
		}
		else if(i==2)
		{
			System.out.println("The Subtracted value is: "+(num1-num2));
		}
		else if(i==3)
		{
			System.out.println("The Multiplied value is: "+(num1*num2));
		}
		else if(i==4)
		{
			System.out.println("The Multiplied value is: "+(num1/num2));
		}
		in.close();
	}

}
