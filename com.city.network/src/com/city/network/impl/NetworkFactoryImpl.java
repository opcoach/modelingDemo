package com.city.network.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.city.network.City;
import com.city.network.Station;
import com.city.network.Line;
import com.city.network.Location;
import com.city.network.NetworkFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class NetworkFactoryImpl extends MNetworkFactoryImpl implements NetworkFactory
{
	
	public static NetworkFactory init() {
		
		try {
			Object fact = MNetworkFactoryImpl.init();
			if ((fact != null) && (fact instanceof NetworkFactory))
					return (NetworkFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkFactoryImpl(); 
		 }
	
	public City createCity()
	{
		City result = new CityImpl();
		return result;
	}
	public Station createStation()
	{
		Station result = new StationImpl();
		return result;
	}
	public Line createLine()
	{
		Line result = new LineImpl();
		return result;
	}
	public Location createLocation()
	{
		Location result = new LocationImpl();
		return result;
	}
}
