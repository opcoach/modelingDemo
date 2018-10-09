package com.city.network;

// This interface overrides the generated interface and will be returned by factory
public interface Line extends MLine
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	
	
	/** Check if all stations are available for disabled people 
	 * 
	 * @return true if All stations are accessible
	 */
	default public boolean disabledAccessible() { return false; }

}
