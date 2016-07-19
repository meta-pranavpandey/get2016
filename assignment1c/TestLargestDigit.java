package assignment1c;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestLargestDigit {

	LargestDigit largestObjet= new LargestDigit();



	@Test
	public void test() {
		assertEquals(1, largestObjet.calculateLargest(11));
		assertEquals(2, largestObjet.calculateLargest(2));
		assertEquals(4, largestObjet.calculateLargest(444));
		assertEquals(9, largestObjet.calculateLargest(12369));
		
	}

}
