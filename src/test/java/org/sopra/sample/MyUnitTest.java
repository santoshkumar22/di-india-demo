package org.sopra.sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("one", "two");
		assertEquals("onetwo", result);
	}
	
	@Test
	public void testConcatenate1() {
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("Santosh ", "Kumar");
		assertEquals("Santosh Kumar", result);
	}
}
