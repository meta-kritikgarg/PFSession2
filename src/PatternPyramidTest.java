// Test for Assignment 1
import static org.junit.Assert.*;

import org.junit.Test;


public class PatternPyramidTest {

	PatternPyramid patternpyramid = new PatternPyramid();
	
	@Test
	public void testSpace() {
		String output="    ";
		assertEquals(output, patternpyramid.space(1, 5));
		assertEquals("   ", patternpyramid.space(8, 5));
	}
	
	
	@Test
	public void testNumbers() {
		String output="1234321";
		assertEquals(output, patternpyramid.numbers(4, 5));
		assertEquals("12321", patternpyramid.numbers(7, 5));
	}
	
	@Test
	public void testPyrimid() {
		String[] output={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		assertEquals(output, patternpyramid.Pyramid(5));
		
	}
	
	

}
