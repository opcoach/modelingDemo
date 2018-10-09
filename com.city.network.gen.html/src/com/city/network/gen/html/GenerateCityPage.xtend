package com.city.network.gen.html

import com.city.network.City
import com.city.network.Line
import com.city.network.test.helpers.DefaultCityGenerator

class GenerateCityPage {

	def generateCityPage(City c) '''
		<html>
		 <title>  Home page for «c.name» </title>
		  <body>
		     «FOR l : c.lines»
		     	«l.generateHtml»
		     «ENDFOR» 
		  
		  </body>
		</html>
	'''

	def generateHtml(Line l) '''
		<h1> LINE «l.name» </h1>
		«FOR s : l.stations»
			<h2> STATION : «s.name» </h2>
		«ENDFOR»
	'''

	def static void main(String[] args) {

		val c = DefaultCityGenerator.createDefaultCity
		val gen = new GenerateCityPage
		System.out.println(" --- Code generated for city  \n" + gen.generateCityPage(c))
	}
}
