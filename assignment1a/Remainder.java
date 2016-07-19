/* Evaluate Remainder Using Recursion 
 * File name : Remainder.java 
   Test case File : TestRemainder.java
 */

package assignment1a;

import java.util.Scanner;


public class Remainder {
	//Remainder class evaluates Remainder after division between x and y 
	// x is Dividend 
	// y is Divisor
	public int calculateRemainder(int x, int y){
		if(x<y)		 //Base Condition
		{	
			return x; // when the Base Condition executes it returns the Final Remainder(Output)
		}
			
		else{
			return calculateRemainder(x-y,y);	//Rem function calls itself Recursively until it reaches 
												//Base condition
		}
	}

	public static void main(String[] args) {
		//Object Declaration
		Remainder remainderObject = new Remainder();
		//Variable Declaration
		int dividendNumber, divisorNumber,obtainedRemainder;
		Scanner Input = new Scanner(System.in);
		try{
		System.out.print("Enter the Dividend :");
		dividendNumber = Input.nextInt();
		System.out.print("\nEnter the Divisor :");
		divisorNumber = Input.nextInt();
		obtainedRemainder = remainderObject.calculateRemainder(dividendNumber,divisorNumber);
		System.out.print("\nObtained Remainder is : " +obtainedRemainder);
		Input.close();
		}
		catch(Exception exp)
		{
			System.out.println("Wrong Input");
			System.exit(0);
		}
		
		catch (StackOverflowError exp) {
			System.out.println("Wrong Input");
		}

	}

}
