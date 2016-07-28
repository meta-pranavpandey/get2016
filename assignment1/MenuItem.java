/**
 * This class holds the all the Menu Items present in our Menu.Txt
 */

package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {
	List<String> menuOrdered = new ArrayList<String>();
	OrderedMenu menuObject = new OrderedMenu();
	
	/**
	 * Following function Displays the main menu on console by reading the text file..
	 */
	public void displayMenu() {
		try{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int menuitem;
		do {
			@SuppressWarnings("resource")
			BufferedReader buffer = new BufferedReader(
					new FileReader(
							"E:\\Workspace\\Oops-S4\\src\\assignment1\\Menu.txt"));
			String thisLine = "";
			String[] commaSeparatedValues;
			System.out.println("Main Menu: ");//Print the MAIN MENU on the console
			while ((thisLine = buffer.readLine()) != null) {
				commaSeparatedValues = thisLine.split("[.]");
				if (commaSeparatedValues[1].charAt(0) == '	')
					System.out.println(thisLine);
			}
			System.out.println("Enter choice : ");
			menuitem = input.nextInt();
			input.nextLine();
			subMenu(menuitem);
		} while (menuitem != 4);
	}
		catch (Exception exp){
			System.out.println("Wrong Input");
		}
	}
	/**
	 * Following Function displays the submenu according to the given choice in main menu
	 * @param menuitem option under which the Sub content is present
	 */
	public void subMenu(int menuitem) {
		try{
		List<String> menuTemp = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String thisLine = "";
		String[] commaSeparatedValues;
		BufferedReader buffer = new BufferedReader(
				new FileReader(
						"E:\\Workspace\\Oops-S4\\src\\assignment1\\Menu.txt"));
		if (menuitem == 1) {
			while ((thisLine = buffer.readLine()) != null) {
				commaSeparatedValues = thisLine.split("[.]");
				if (commaSeparatedValues[0].charAt(0) == '1'
						&& commaSeparatedValues[1].charAt(0) != '	') {
					System.out.println(thisLine);
					menuTemp.add(thisLine);
				}
			}
			System.out.println("How many Veg Choices : ");
			int numberOfItems = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < numberOfItems; i++) {
				System.out.println("Enter choice " + (i + 1) + " : ");
				float item = sc.nextFloat();
				sc.nextLine();
				if ((item + "").equalsIgnoreCase(menuTemp.get(0)
						.substring(0, 3) + "")) {
					ActionableMenuItem.finalOrderList.add(menuTemp.get(0));
				} else {
					ActionableMenuItem.finalOrderList.add(menuTemp.get(1));
				}
			}
		} else if (menuitem == 2) {
			while ((thisLine = buffer.readLine()) != null) {
				commaSeparatedValues = thisLine.split("[.]");
				if (commaSeparatedValues[0].charAt(0) == '2'
						&& commaSeparatedValues[1].charAt(0) != '	') {
					System.out.println(thisLine);
					menuTemp.add(thisLine);
				}
			}
			System.out.println("How many Non-Veg Choices : ");
			int numberOfItems = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < numberOfItems; i++) {
				System.out.println("Enter choice " + (i + 1) + " : ");
				float item = sc.nextFloat();
				sc.nextLine();
				if ((item + "").equalsIgnoreCase(menuTemp.get(0)
						.substring(0, 3) + "")) {
					ActionableMenuItem.finalOrderList.add(menuTemp.get(0));
				} else {
					ActionableMenuItem.finalOrderList.add(menuTemp.get(1));
				}
			}
		} else if (menuitem == 3) {
			while ((thisLine = buffer.readLine()) != null) {
				commaSeparatedValues = thisLine.split("[.]");
				if (commaSeparatedValues[0].charAt(0) == '3'
						&& commaSeparatedValues[1].charAt(0) != '	') {
					System.out.println(thisLine);
					menuTemp.add(thisLine);
				}
			}
			System.out.println("How many Drinks : ");
			int numberOfItems = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < numberOfItems; i++) {
				System.out.println("Enter choice " + (i + 1) + " : ");
				float item = sc.nextFloat();
				sc.nextLine();
				if ((item + "").equalsIgnoreCase(menuTemp.get(0)
						.substring(0, 3) + "")) {
					System.out.println("adding for menu:" + (menuTemp.get(0)));
					ActionableMenuItem.finalOrderList.add(menuTemp.get(0));
				} else {
					ActionableMenuItem.finalOrderList.add(menuTemp.get(1));
				}
			}
		} else
			menuObject.displayOrder();
		buffer.close();
	}
		catch (Exception exp){
			System.out.println("Wrong Input");
		}
}
}