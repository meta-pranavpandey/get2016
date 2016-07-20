/**
 * Perform Permutation of characters using the Recursion Approach 
 * File Name : CharacterPermutation.java  
 * Test File : TestCharacterPermutation.java
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class holds a function combination which will perform the Permutation
 * task output will displayed as different possible outcomes
 * 
 * @author Nikhil
 *
 */

public class CharacterPermutation {

	static String word; // it will store the input string on which the
	// Permutation Action be performed

	// list to store the combination of String
	static List<String> combinationList = new ArrayList<String>();

	// method called by user
	public List<String> combinations(String inputstring) {
		combinations("", inputstring);
		return combinationList;
	}

	// method called with 2 parameter containing prefix as null string
	private List<String> combinations(String prefix, String str) {
		int stringLength = str.length(); // length of string

		// if length is 0 than add prefix
		if (stringLength == 0)
			combinationList.add(prefix);
		else {
			for (int index = 0; index < stringLength; index++) {
				/*
				 * call function recursively by change the position of each
				 * character
				 */
				combinations(
						prefix + str.charAt(index),
						str.substring(0, index)
								+ str.substring(index + 1, stringLength));
			}
		}
		return combinationList;
	}

	public static void main(String args[]) {

		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the string");
			word = input.next();
			CharacterPermutation permutation = new CharacterPermutation();
			permutation.combinations(word);
			for (int index = 0; index < combinationList.size(); index++) {
				System.out.println(combinationList.get(index));
			}
			input.close();
		}

		catch (Exception exp) {
			System.out.println("Wrong Input");
		}
	}

}
