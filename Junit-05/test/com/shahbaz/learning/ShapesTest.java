package com.shahbaz.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes sp = new Shapes();

	@Test
	void test_Square() {
		assertEquals(576, sp.computeSquareArea(24));
	}
	@Test
	public void test_Triangle() {
		assertEquals(12.56, sp.computeCircleArea(2) , "Wrong output getting");
	}

}
