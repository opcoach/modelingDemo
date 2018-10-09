/*
 * generated by Xtext 2.15.0
 */
package com.city.network.xtext.formatting2

import com.city.network.MCity
import com.city.network.xtext.services.CityDslGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class CityDslFormatter extends AbstractFormatter2 {
	
	@Inject extension CityDslGrammarAccess

	def dispatch void format(MCity city, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (station : city.stations) {
			station.format
		}
		for (line : city.lines) {
			line.format
		}
	}
	
	// TODO: implement for 
}
