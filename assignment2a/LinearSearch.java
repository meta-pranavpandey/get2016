/* Perform Linear Search Using Recursion 
 * File name : LinearSearch.java 
   Test case File : TestLinearSearch.java
 */

package assignment2a;

import java.util.Scanner;

public class LinearSearch {
	
// LinearSearch class helps in a searching an element in a array using recursion approach
	
	public int searchElement(int []arrayList, int targetValue,int start){
		System.out.println(start);
		
		 if(start>arrayList.length-1){
			return -1;
		 }
			
		 
		 else if(arrayList[start]==targetValue){
				return start;
			}
		else{
			start++;
			return searchElement(arrayList, targetValue,start);
		}
	}
	

	public static void main(String[] args) {
				//Object Declaration
		LinearSearch searchObject = new LinearSearch();
		//Variable Declaration
		int numberListSize,index,target,targetPosition;
		
		Scanner Input = new Scanner(System.in);
		
		try{
		System.out.print("Enter the Size :");
		numberListSize = Input.nextInt();

		//Array Declaration 
		int []numberList = new int[numberListSize];
		
		//Input the array Elements
		System.out.println("Enter the Elements");
		for(index = 0;index<numberListSize;index++){
			numberList[index]=Input.nextInt();
		}
		
		//Input Target Value
		System.out.println("Enter the Value to be Searched");
		target = Input.nextInt();

		
		//Searching Results
		targetPosition= searchObject.searchElement(numberList,target,0);
		
		//Checking
		if(targetPosition==-1){
			System.out.println("Element Not Found ");
		}
		
		else{
			System.out.println("Element Found at Position "+(targetPosition+1));
		}
	}
		catch(Exception exp)
		{
			System.out.print("Wrong Input");
		}
		Input.close();
	}		

}
