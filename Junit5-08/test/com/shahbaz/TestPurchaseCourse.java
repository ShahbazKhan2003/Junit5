package com.shahbaz;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.shahbaz.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testproceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();

		assertTrue(pc.proceedWithCourse(new JavaCourse()));
	}

}
