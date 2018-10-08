package com.city.network;

import com.city.network.impl.NetworkFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface NetworkFactory extends MNetworkFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	NetworkFactory eINSTANCE = NetworkFactoryImpl.init();
				
	public City createCity();
	public Station createStation();
	public Line createLine();
	public Location createLocation();
}
