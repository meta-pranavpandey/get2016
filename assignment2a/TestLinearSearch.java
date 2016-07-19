/**
 * 
 */
package assignment2a;

import static org.junit.Assert.*;

//import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * @author admin
 *
 */
public class TestLinearSearch {

	LinearSearch searchObject ;
	int[] numberList = {1,2,3,4};
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		searchObject = new LinearSearch();
	}

	@Test
	public void test() {
		
		assertEquals(0, searchObject.searchElement(numberList, 1,0));
		assertEquals(2, searchObject.searchElement(numberList, 3,0));
		assertEquals(0, searchObject.searchElement(numberList, 1,0));
		
		
	}

}
