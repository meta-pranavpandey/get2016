/**
 * 
 */
package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Nikhil
 *
 */
public class TestMatrix {
		Matrix testObject = new Matrix();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int [][] M1 = {{1,2},{3,4}};
		int [][] M2 = {{2,0},{1,2}};
		int [][] E1 = {{1,3},{2,4}};
		int [][] E2 = {{4,4},{10,8}};
		assertArrayEquals(E1, testObject.transpose(M1, M1.length, M1[0].length));
		assertArrayEquals(E2, testObject.multiplication(M1, M2, 2,2,2,2));
		}
	

}
