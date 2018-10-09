package com.city.network.test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.city.network.City;
import com.city.network.Line;
import com.city.network.test.helpers.DefaultCityGenerator;

class TestLineLogic {

	private City city;
	private Line l1, l2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		city = DefaultCityGenerator.createDefaultCity();
		l1 = city.getLines().get(0);
		l2 = city.getLines().get(1);

		
	}

	@Test
	@DisplayName("The line 1 is accessible to disabled people")
	void testDisabledAccessibleOnLine1() {
		assertTrue(l1.disabledAccessible(), "The Line 1 has disabled access");
	}

	@Test
	@DisplayName("The line 2 is not disabled accessible")
	void testDisabledAccessibleOnLine2() {
		assertFalse(l2.disabledAccessible(), "The Line 2 has not disabled access");
	}

	@Test
	void testGetLength() {
		// Test the length 
		// fail("Not yet implemented");
	}

}
