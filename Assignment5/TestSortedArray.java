package Assignment5;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSortedArray {

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
	public void testAsec() {
		SortedOrder S= new SortedOrder();
		
		assertEquals(1,S.sort(new int[] {1,2}));
		assertEquals(0,S.sort(new int[] {2,1,2}));
		assertEquals(2,S.sort(new int[] {2,1}));
	}

}
