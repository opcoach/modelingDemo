package com.city.network.gen.html.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.city.network.City;
import com.city.network.gen.html.GenerateCityPage;
import com.city.network.test.helpers.DefaultCityGenerator;

class TestHtmlGenerator {

	GenerateCityPage gen;
	City city;
	String generatedText;
	
	@BeforeEach
	 void setUpBeforeClass() throws Exception {
		gen = new GenerateCityPage();
		city = DefaultCityGenerator.createDefaultCity();
		generatedText = gen.generateCityPage(city).toString();
	}

	@Test
	@DisplayName("The title of the page must be correct")
	void testTitleIsCorrect() {
		String expectedTitle = "<title>  Home page for TestCity </title>";
		assertTrue(generatedText.contains(expectedTitle), "Title must be " + expectedTitle);
	}

}
