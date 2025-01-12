package com.shahbaz.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	Shapes sp = new Shapes();

	@Test
	void testForSquare() {
		assertEquals( 16, sp.computeSquareArea(4) );
	}
	@Test
	public void testForCircle() {
		assertEquals( 314, sp.computeCircleArea(10) , "Area of circle is wrong");
	}
	@Test
	public void testForCircle_Supplier() {
		assertEquals( 78.5, sp.computeCircleArea(5) ,()-> "Area of circle is wrong");
	}
	

}
