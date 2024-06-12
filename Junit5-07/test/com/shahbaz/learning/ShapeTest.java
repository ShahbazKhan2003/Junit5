package com.shahbaz.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {
	Shapes sp = new Shapes();

	@Test
	void testSquareArea() {
		assertNotEquals( 586 , sp.computeSquareArea(24));
	}
	@Test
	public void testSquareAreaWithMessge() {
		assertNotEquals( 576 , sp.computeSquareArea(24) , ()-> "This is the right output");
	}

}