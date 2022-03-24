package practice;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Number");
	int numOne = sc.nextInt();
	System.out.println("Enter the second Number");
	int numTwo = sc.nextInt();
	System.out.println("Select Symbol (+ , - , * , /)");
	String symbol = sc.next();
	int result;
	switch(symbol)
	{
	   case "+" : result = numOne + numTwo;
	              System.out.println("Addition is " + result);
	              break;

	  case "-" : result = numOne - numTwo;
	              System.out.println("Subtration is " + result);
	              break;


	  case "*" : result = numOne * numTwo;
	              System.out.println("Multipication is " + result);
	              break;

	  case "/" : result = numOne / numTwo;
	              System.out.println("Division is " + result);
	              break;

	  default : System.out.println("Invalid Number");
	            break;

	   
	}



	}

}
