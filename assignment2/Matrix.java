/**
 * Perform Matrix Operations Transpose and Multiplication
 * FileName : Matrix.java
 * TestFlie : TestMatrix.java 
 */
package assignment2;

import java.util.Scanner;

/**
 * @author Nikhil
 *Matrix class holds all the Functionalities to evaluate the Transpose and Multiplication
 */
public class Matrix {

	private static int[][] matrix_1;
	private static int[][] matrix_2;
	private static int[][] transposedMatrix;
	private static int[][] multipleResult;
	static Scanner input = new Scanner(System.in);

	//This method takes the input in matrix
	public int[][] getInput(int firstMatrix[][],int r1,int c1){
		for( int index=0; index<r1;index++){
			for (int index_2 = 0; index_2 <c1; index_2++) {
				firstMatrix[index][index_2] = input.nextInt();
			}
		}
		return firstMatrix;
	}

	//Transpose Operation
	public int[][] transpose(int firstMatrix[][],int r1,int c1){
		int transMatrix[][] =new int[c1][r1];//transMatrix is a temporary Matrix
		for (int index = 0; index <r1; index++) {
			for (int index_2 = 0; index_2 < c1; index_2++) {
				transMatrix[index_2][index] = firstMatrix[index][index_2];

			}
		}

		return transMatrix;
	}
	//Multiplication Operation
	public int[][] multiplication(int first[][], int second[][], int row1,
			int col1, int row2, int col2) {
		int [][]tempMatrix = new int [row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				tempMatrix[i][j] = 0;
				for (int k = 0; k < row2; k++) {
					tempMatrix[i][j] += first[i][k] * second[k][j];
				}
			}
		}
		return tempMatrix;
	}

	//Display Matrix Function
	public void Display(int displayMatrix[][]){
		//Printing 
		for(int index = 0; index<displayMatrix.length; index++ ){
			for (int index_2 = 0; index_2 < displayMatrix[0].length; index_2++) {
				System.out.print(displayMatrix[index][index_2]+"\t");

			}
			System.out.print("\n");
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Matrix matrixOperations = new Matrix();
		//String choiceCharacter = null;
		int row_1,column_1,row_2,column_2,choice;
		do{
			/**************************************************************************************
			 **************************************MAIN MENU*********************************************
			 **************************************************************************************/
			System.out.print("\n\tMatrix Menu \n\t Press 1 for Multiplication  \n\t Press 2 for Transpose ");
			System.out.print("\n\t Press 3 for Display Transpose Result\n\t Press 4 to Display Multiplication\n\t Result Press 5 to Exit");
			System.out.print("\nEnter Your Choice : ");
			choice = input.nextInt();
			switch(choice){

			case 1 : //Multiplication
				//FIRST MATRIX 
				System.out.println("Enter the Row Size :");
				row_1 = input.nextInt();
				System.out.println("Enter the Column Size :");
				column_1 = input.nextInt();
				matrix_1 = new int[row_1][column_1];
				//Input The Matrix_1
				System.out.println("Enter the First Matrix :");
				matrix_1 = matrixOperations.getInput(matrix_1,row_1,column_1);

				System.out.println("Enter the Row size of 2nd Matrix");
				row_2 = input.nextInt();
				System.out.println("Enter the column size of 2nd Matrix");
				column_2 = input.nextInt();
				matrix_2 = new int[row_2][column_2];
				matrix_2 = matrixOperations.getInput(matrix_2, row_2, column_2);
				System.out.println("Enter the Second Matrix :");
				if(column_1!=row_2){
					System.out.println("Multiplication not Possible");
					System.exit(0);
				}
				else{
					multipleResult = new int[row_1][column_2];
					multipleResult= matrixOperations.multiplication(matrix_1, matrix_2, row_1, column_1, row_2, column_1);
					//System.out.println("You wish to continue Y or N");
					//choiceCharacter = input.next();
				}
				break;
			case 2 : //Transpose
				//FIRST MATRIX 
				System.out.println("Enter the Row Size :");
				row_1 = input.nextInt();
				System.out.println("Enter the Column Size :");
				column_1 = input.nextInt();
				matrix_1 = new int[row_1][column_1];
				//Input The Matrix_1
				System.out.println("Enter the First Matrix :");
				matrix_1 = matrixOperations.getInput(matrix_1,row_1,column_1);

				transposedMatrix = new int[column_1][row_1];
				transposedMatrix = matrixOperations.transpose(matrix_1, row_1, column_1);
				//System.out.println("You wish to continue Y or N");
				//choiceCharacter = input.next();
				break;

			case 3 : //Display
				System.out.println("Result");
				matrixOperations.Display(transposedMatrix);
				//System.out.println("You wish to continue Y or N");
				//choiceCharacter = input.next();
				break;

			case 4 : //Display Multiplication
				System.out.println("Result");
				matrixOperations.Display(multipleResult);
				//System.out.println("You wish to continue Y or N");
				//choiceCharacter = input.next();
				break;
			case 5 : // Exit()
				System.exit(0);

			default : System.out.println("Wrong Input") ; 		
			}
		}
		//while(choiceCharacter =="Y"||choiceCharacter =="y");
		while(true);

	}

}
