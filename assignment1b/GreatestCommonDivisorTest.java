package assignment1b;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GreatestCommonDivisorTest {

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
		GreatestCommonDivisor greatestObject = new GreatestCommonDivisor();
		assertEquals(1, greatestObject.calculateGcd(2,1));
		assertEquals(6, greatestObject.calculateGcd(12,18));
		assertEquals(1, greatestObject.calculateGcd(100,3));
	}

}
