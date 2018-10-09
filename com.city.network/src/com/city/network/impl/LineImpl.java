package com.city.network.impl;

import com.city.network.Line;
import com.city.network.Station;

// This class overrides the generated class and will be instantiated by factory
public class LineImpl extends MLineImpl implements Line
{

	@Override
	public boolean disabledAccessible() {
		// Loop on all opened and accessible stations
		for (Station s: getStations())
		{
			if (s.isOpened() && !s.isDisabledAccess())
				return false;
		}
		return true;
	}
}
