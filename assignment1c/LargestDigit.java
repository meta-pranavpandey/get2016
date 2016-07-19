/* Evaluate Largest Digit Using Recursion 
 * File name : LargestDigit.java 
   Test case File : TestLargestDigit.java
 */

package assignment1c;

import java.util.Scanner;

public class LargestDigit {
	// LargestDigit class evaluates the largest digit among the number 
	int max=0;
	
	public int calculateLargest(int x){
		if(x==0){
			return max;
		}
		if(max< (x%10))
		{
			max= x%10;
			return calculateLargest(x/10);
		}
		else{ 
			return calculateLargest(x/10);
			}
	}
	
	public static void main(String[] args) {
		//Object Declaration
		LargestDigit largestObject = new LargestDigit();
		//Variable Declaration
		int number,largest;
		Scanner Input = new Scanner(System.in);
		
	
			try{
		System.out.print("Enter the Number :");
		number = Input.nextInt();
		largest = largestObject.calculateLargest(number);
		System.out.print("\nLargest digit in "+number +"is : "+largest);
		Input.close();
			}

	
		catch(Exception exp)
		{
			System.out.println("Wrong Input");
		}

		
		}
}
