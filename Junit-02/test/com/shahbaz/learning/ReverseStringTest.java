package com.shahbaz.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString r = new ReverseString();
		assertEquals("avaJ" , r.reverseString("Java"));
	}

}
