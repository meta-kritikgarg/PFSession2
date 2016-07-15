// Test for Assignment 2

import static org.junit.Assert.*;

import org.junit.Test;


public class PatternNumbersTest {
	PatternNumbers pnObject= new PatternNumbers();

	@Test
	public void testPrinter() {
		String[] output={"12345"," 1234","  123","   12","    1"};
		assertEquals(output, pnObject.Printer(5));
	}

	@Test
	public void testSpace() {
		
		assertEquals("    ", pnObject.space(5, 5));
		
	}

	@Test
	public void testNumbers() {
		assertEquals("12345", pnObject.numbers(1, 5));
		
	}

}
