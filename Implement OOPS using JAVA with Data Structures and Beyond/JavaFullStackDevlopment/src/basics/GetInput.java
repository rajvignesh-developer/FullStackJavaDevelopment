package basics;

import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		double num1 = in.nextDouble();
		System.out.println("Enter Second Number: ");
		double num2 = in.nextDouble();
		
		double sum, sub, mul, div;
		
		 sum = num1+num2;
		 sub = num1-num2;
		 mul = num1*num2;
		 div = num1/num2;
		
		 System.out.println("The Addition is: "+sum);
		 System.out.println("The Subtraction is: "+sub);
		 System.out.println("The Multiply is: "+mul);
		 System.out.println("The Division is: "+div);
		 
		 in.close();
		 
	}

}
