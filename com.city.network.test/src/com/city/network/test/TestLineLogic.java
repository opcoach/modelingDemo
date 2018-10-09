package com.city.network.test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.city.network.City;
import com.city.network.Line;
import com.city.network.NetworkFactory;
import com.city.network.Station;
import com.city.network.Topology;
import com.city.network.TransportType;

class TestLineLogic {

	private City city;
	private Line l1, l2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {

		// Initialize a default city for the tests.
		NetworkFactory f = NetworkFactory.eINSTANCE;

		city = f.createCity();
		city.setName("TestCity");

		Station s1 = f.createStation();
		s1.setName("S1");
		s1.setNbOfElevators(2);
		s1.setDisabledAccess(true);

		Station s2 = f.createStation();
		s2.setName("S2");
		s2.setNbOfElevators(4);
		s2.setDisabledAccess(true);

		Station s3 = f.createStation();
		s3.setName("S3");
		s3.setNbOfElevators(2);
		s3.setDisabledAccess(true);

		Station s4 = f.createStation();
		s4.setName("S4");
		s4.setNbOfElevators(0);
		s4.setDisabledAccess(false);

		// Add stations in the city and open them
		city.getStations().addAll(Arrays.asList(s1, s2, s3, s4));
		city.getStations().forEach((s) -> s.setOpened(true));

		// Create 2 lines : one for disabled, one for not disabled
		l1 = f.createLine();
		l1.setName("LineA");
		l1.setTopology(Topology.LINEAR);
		l1.setType(TransportType.METRO);
		l1.getStations().addAll(Arrays.asList(s1, s2, s3));

		l2 = f.createLine();
		l2.setName("LineB");
		l2.setTopology(Topology.LINEAR);
		l2.setType(TransportType.METRO);
		l2.getStations().addAll(Arrays.asList(s1, s3, s4));

		city.getLines().addAll(Arrays.asList(l1, l2));

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
