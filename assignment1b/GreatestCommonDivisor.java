/* Evaluate Remainder Using Recursion 
 * File name : GreatestCommonDivisor.java 
   Test case File : GreatestCommonDivisorTest.java
 */


package assignment1b;

import java.util.Scanner;

public class GreatestCommonDivisor {
	//GreatestCommonDivisor will Evaluates the GCD of 2 numbers
	//x and y are two numbers 
	
	public int calculateGcd(int x, int y)
	{	
		if(x < y){
			return calculateGcd(y,x);
		}
		if(x % y == 0){ //Base Conditions
			return y;  //when the Base Condition executes, it returns the GCD(Output)
			
		}
		else {
			return calculateGcd(y, x%y);
		}
	}
	public static void main(String[] args) {
		//Object Declaration
		GreatestCommonDivisor greatestObject = new GreatestCommonDivisor();
		//Variable Declaration
		int firstNumber,secondNumber,obtainedGcd;
		Scanner Input = new Scanner(System.in);
		try{
		System.out.print("Enter the First Number :");
		firstNumber = Input.nextInt();
		System.out.print("\nEnter the Second Number :");
		secondNumber = Input.nextInt();
		obtainedGcd = greatestObject.calculateGcd(firstNumber, secondNumber);
		System.out.print("\nObtained GCD : " + obtainedGcd);
		Input.close();
		}
		
		catch(Exception exp)
		{
			System.out.println("Wrong Input");
		}

	}

}
