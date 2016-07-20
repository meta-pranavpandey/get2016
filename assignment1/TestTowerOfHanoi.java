/**
 * Test Cases for performing and validating the Tower of Hanoi 
 */
package assignment1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Nikhil
 *
 */
public class TestTowerOfHanoi {

	/**
	 * @throws java.lang.Exception
	 */
	TowerOfHanoi disks;

	@Before
	public void setUp() throws Exception {
		disks = new TowerOfHanoi();
	}

	@Test
	public void testTransfer() {

		// list of movement of disk
		List<String> expected = Arrays.asList("MoveDisk 1 From A to C",
				"MoveDisk 2 From A to B", "MoveDisk 1 From C to B",
				"MoveDisk 3 From A to C", "MoveDisk 1 From B to A",
				"MoveDisk 2 From B to C", "MoveDisk 1 From A to C");

		// assert check
		assertEquals(expected, disks.transferDisks("A", "B", "C", 3));
	}

}
