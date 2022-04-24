package basics;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Arthematic Operation using SwitchCase Statement");
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
		
		switch (i) {
		case 1:
			System.out.println("The Sum is: "+(num1+num2));
		break;
		
		case 2:
			System.out.println("The Subtracted value is: "+(num1-num2));
		break;

		case 3:
			System.out.println("The Multiplied value is: "+(num1*num2));
		break;

		case 4:
			System.out.println("The Multiplied value is: "+(num1/num2));
		break;

		default:
			System.out.println("Enter Above options only");
		}
		
		
		
		
		in.close();
		
	}

}
