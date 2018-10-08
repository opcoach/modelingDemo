/**
 */
package com.city.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.city.network.MLine#getName <em>Name</em>}</li>
 *   <li>{@link com.city.network.MLine#getType <em>Type</em>}</li>
 *   <li>{@link com.city.network.MLine#getStations <em>Stations</em>}</li>
 *   <li>{@link com.city.network.MLine#getLength <em>Length</em>}</li>
 *   <li>{@link com.city.network.MLine#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @see com.city.network.MNetworkPackage#getLine()
 * @model
 * @generated
 */
public interface MLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.city.network.MNetworkPackage#getLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.city.network.MLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.city.network.TransportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.city.network.TransportType
	 * @see #setType(TransportType)
	 * @see com.city.network.MNetworkPackage#getLine_Type()
	 * @model
	 * @generated
	 */
	TransportType getType();

	/**
	 * Sets the value of the '{@link com.city.network.MLine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.city.network.TransportType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransportType value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link com.city.network.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The station list from the first to the last
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see com.city.network.MNetworkPackage#getLine_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lenght of the line in kilometers
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see com.city.network.MNetworkPackage#getLine_Length()
	 * @model derived="true"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link com.city.network.MLine#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Topology</b></em>' attribute.
	 * The literals are from the enumeration {@link com.city.network.Topology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' attribute.
	 * @see com.city.network.Topology
	 * @see #setTopology(Topology)
	 * @see com.city.network.MNetworkPackage#getLine_Topology()
	 * @model
	 * @generated
	 */
	Topology getTopology();

	/**
	 * Sets the value of the '{@link com.city.network.MLine#getTopology <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' attribute.
	 * @see com.city.network.Topology
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(Topology value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation returns the next station on the line according to the opened status of stations or null if none
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Station next(Station station);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation returns the previous station on the line according to the opened status of stations, or null if none.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Station previous(Station station);

} // MLine
