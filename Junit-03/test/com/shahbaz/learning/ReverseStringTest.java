package com.shahbaz.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString r = new ReverseString();
		assertEquals("avaJ" , r.reverseString("Java"));
		assertEquals("neilA" , r.reverseString("Alien"));
	}

}
