/**
 * Perform NQueen Problem
 * Filename : NQueen.java
 * TestFile : TestNQueen.java
 */

package assignment3;

import java.util.Scanner;

/**
 * This class is created to solve the N Queen problem, that is to put N number
 * of queens on a N X N squares board such that no queen can attack other queen
 * in horizontal, vertical or diagonal direction
 * 
 * @author Nikhil
 *
 */
public class NQueen {

	int Places = 1;
	int Solutions = 0;

	/**
	 * This method puts the queen on the 2D array by finding the position of
	 * queen and returns 1 if valid position is found
	 */
	int arrangeQueen(int row, int column, int position[]) {
		// check for invalid entries
		for (int index = 1; index < row; index++) {
			if ((position[index] == column || (Math.abs(row - index) == Math
					.abs(column - position[index])))) {
				return 0;
			}
		}
		return 1;
	}

	public int[][][] queen(int presentRow, int totalRow, int position[],
			int result[][][]) {

		// check possible places for queen at current row
		for (int index = 1; index <= totalRow; index++) {
			if (arrangeQueen(presentRow, index, position) == 1) {
				position[presentRow] = index;
				// Base condition and get result for each row
				if (presentRow == totalRow) {
					for (int index2 = 1; index2 <= totalRow; index2++) {
						result[Solutions][index2][position[index2]] = 1;
					}
					Solutions++;
					return result;
				}
				// if more number of row present then check solution for then
				// also
				else {
					queen(presentRow + 1, totalRow, position, result);
				}
			}
		}
		return result;
	}

	Scanner input = new Scanner(System.in);

	public int inputMethod() {
		int inputNumber = 0;
		try {
			inputNumber = input.nextInt();
		} catch (Exception exp) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args) {
		int MAX_POSSIBLE = 100000;
		NQueen nQueen = new NQueen();
		int boardSize;
		// get the size of board
		System.out.println("Enter the size of board");
		boardSize = nQueen.inputMethod();
		// define size of array according to board size
		int position[] = new int[boardSize + 1]; // store position of queen for
													// each
		// row
		int result[][][] = new int[MAX_POSSIBLE][boardSize + 1][boardSize + 1];

		// Call method to get all possible solution
		result = nQueen.queen(1, boardSize, position, result);

		// show all the possible solutions;
		for (int k_index = 0; k_index < nQueen.Solutions; k_index++) {
			for (int index = 1; index <= boardSize; index++) {
				for (int J_index = 1; J_index <= boardSize; J_index++) {
					if (result[k_index][index][J_index] == 1) {
						System.out.print("Q" + "\t");
					} else {
						System.out.print("0" + "\t");
					}
				}
				System.out.println();
			}
			System.out.println("total result " + nQueen.Solutions
					+ " this solution " + (k_index + 1));
		}
	}

}