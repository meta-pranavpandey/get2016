package Assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMergeSortedArray {

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

	int a[] = {1,2,3,4,5,6};
	int b[] = {7,8,9};
	@Test
	public void test() {
		MergeSortedArray Ms= new MergeSortedArray();
		
		assertTrue(Ms.merging(a,b));
	}

}
