/**
 * Test Cases for performing and validating the Permutation of Characters
 */
package assignment2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCharacterPermutation {

	CharacterPermutation permutation;

	@Before
	public void setUp() throws Exception {
		permutation = new CharacterPermutation();
	}

	@Test
	public void testPermutation() {

		List<String> expected = Arrays.asList("ABC", "ACB", "BAC", "BCA",
				"CAB", "CBA");

		// assert check
		assertEquals(expected, permutation.combinations("ABC"));
	}

}