/**  Perform Tower of Hanoi Using Recursion 
 * File name : TowerOfHanoi.java 
   Test case File : TestTowerofHanoi.java
 */
package assignment1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TowerOfHanoi {

	static int totalDisks;

	// list to store the disk movement
	static List<String> storeDiskMovement = new ArrayList<String>();

	// method to find disk movement
	public List<String> transferDisks(String source, String aux, String des,
			int totalDisks) {
		if (totalDisks == 1) // if there is only one disk then disk will move
		// from source
		// peg to end peg
		{
			storeDiskMovement.add("MoveDisk " + totalDisks + " From " + source
					+ " to " + des);
		}

		else {
			/**
			 * totalDisks-1 have move to auxiliary peg so that only one disk in
			 * source till there is only one disk in source peg Therefore
			 * auxiliary peg will become the destination peg
			 */
			transferDisks(source, des, aux, totalDisks - 1);

			// movement of peg is stored
			storeDiskMovement.add("MoveDisk " + totalDisks + " From " + source
					+ " to " + des);

			/**
			 * n-1 had been move to auxiliary peg therefore Auxiliary peg will
			 * become the source peg and move the disk to destination peg
			 */
			transferDisks(aux, source, des, totalDisks - 1);
		}

		// return the list containing the movement of peg
		return storeDiskMovement;

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks");
		try {
			totalDisks = input.nextInt();
			TowerOfHanoi disks = new TowerOfHanoi();
			storeDiskMovement = disks.transferDisks("A", "B", "C", totalDisks);
			for (int index = 0; index < storeDiskMovement.size(); index++) {
				System.out.println(storeDiskMovement.get(index));
			}
			input.close();
		} catch (Exception exp) {
			System.out.println("Wrong Input");
		}
	}
}