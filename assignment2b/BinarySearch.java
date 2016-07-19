/* Perform Binary Search Using Recursion 
 * File name : BinarySearch.java 
   Test case File : TestBinaryrSearch.java
 * 
 */
package assignment2b;

import java.util.Scanner;

/**
 *   BinarySearch class helps in a searching an element in a array in a binary fashion using recursion approach
	 This Search requires the sorted array
 		Logic is that break the sorted array into 2 parts.
	 if mid value of an array is less than target search only in 2nd array else 1st array
 *
 */
public class BinarySearch {

	public int searchElement(int[] arrayList, int targetvalue, int firstindex,int lastindex) {
		int mid = (firstindex + lastindex) / 2;
		if (firstindex > lastindex) {
			return 0;
		}
		if (arrayList[mid] == targetvalue) {
			return 1;
		} else{ 
			if (arrayList[mid] < targetvalue) {
				return searchElement(arrayList, targetvalue, mid + 1, lastindex);
			} else  {
				return searchElement(arrayList, targetvalue, firstindex, mid - 1);
			}
		}
	}


	
	public static void main(String[] args) {
		//Object Declaration
		BinarySearch searchObject = new BinarySearch();
		
		//Variable Declaration
		int numberListSize,index,target,targetResult;
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
			targetResult = searchObject.searchElement(numberList, target, 0, (numberListSize-1));
		
			//Checking
			if(targetResult==0){
				System.out.println("Number Not found");
				
			}
			
			else{
				System.out.println("Number Found ");
			}
		}
		
		catch(Exception exp)
		{
			System.out.print("Wrong Input");
		}
		Input.close();
	}		
	

}
