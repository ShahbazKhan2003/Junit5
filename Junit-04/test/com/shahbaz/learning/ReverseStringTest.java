package com.shahbaz.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString r = new ReverseString();

	@Test
	void testForSingleWord() {
		
		assertEquals("avaJ"  , r.reverseString("Java"));
	}
	@Test
	public void testForMultipleWord() {
		
		assertEquals("hguot si avaJ"  , r.reverseString("Java is tough"));
	}

}
