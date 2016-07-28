/**
 * This will keeps the list of items that has been selected from the MenuItem class
 */
package assignment1;

import java.util.ArrayList;
import java.util.List;

public class OrderedMenu {
	public void displayOrder() {
		System.out.println("Ordered Menu : ");
		List<String> test = new ArrayList<String>();
		test.addAll(ActionableMenuItem.finalOrderList);
		for (String temp : ActionableMenuItem.finalOrderList) {
			System.out.println(temp);
		}
	}
}