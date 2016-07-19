package assignment1a;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRemainder {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Remainder remainderObject = new Remainder();
		assertEquals(0, remainderObject.calculateRemainder(2,1));
		assertEquals(1, remainderObject.calculateRemainder(100,3));
		//assertEquals(0, remainderObject.calculateRemainder(2, 0));
	}

}
