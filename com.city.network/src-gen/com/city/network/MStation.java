/**
 */
package com.city.network;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.city.network.MStation#getName <em>Name</em>}</li>
 *   <li>{@link com.city.network.MStation#getType <em>Type</em>}</li>
 *   <li>{@link com.city.network.MStation#isOffice <em>Office</em>}</li>
 *   <li>{@link com.city.network.MStation#getNbOfTicketMachines <em>Nb Of Ticket Machines</em>}</li>
 *   <li>{@link com.city.network.MStation#isOpened <em>Opened</em>}</li>
 *   <li>{@link com.city.network.MStation#isDisabledAccess <em>Disabled Access</em>}</li>
 *   <li>{@link com.city.network.MStation#getNbOfElevators <em>Nb Of Elevators</em>}</li>
 *   <li>{@link com.city.network.MStation#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see com.city.network.MNetworkPackage#getStation()
 * @model
 * @generated
 */
public interface MStation extends Location {
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
	 * @see com.city.network.MNetworkPackage#getStation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link com.city.network.TransportType}.
	 * The literals are from the enumeration {@link com.city.network.TransportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see com.city.network.TransportType
	 * @see com.city.network.MNetworkPackage#getStation_Type()
	 * @model required="true" upper="3"
	 * @generated
	 */
	EList<TransportType> getType();

	/**
	 * Returns the value of the '<em><b>Office</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' attribute.
	 * @see #setOffice(boolean)
	 * @see com.city.network.MNetworkPackage#getStation_Office()
	 * @model
	 * @generated
	 */
	boolean isOffice();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#isOffice <em>Office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office</em>' attribute.
	 * @see #isOffice()
	 * @generated
	 */
	void setOffice(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Of Ticket Machines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Ticket Machines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Ticket Machines</em>' attribute.
	 * @see #setNbOfTicketMachines(int)
	 * @see com.city.network.MNetworkPackage#getStation_NbOfTicketMachines()
	 * @model
	 * @generated
	 */
	int getNbOfTicketMachines();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#getNbOfTicketMachines <em>Nb Of Ticket Machines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Ticket Machines</em>' attribute.
	 * @see #getNbOfTicketMachines()
	 * @generated
	 */
	void setNbOfTicketMachines(int value);

	/**
	 * Returns the value of the '<em><b>Opened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opened</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opened</em>' attribute.
	 * @see #setOpened(boolean)
	 * @see com.city.network.MNetworkPackage#getStation_Opened()
	 * @model
	 * @generated
	 */
	boolean isOpened();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#isOpened <em>Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opened</em>' attribute.
	 * @see #isOpened()
	 * @generated
	 */
	void setOpened(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Access</em>' attribute.
	 * @see #setDisabledAccess(boolean)
	 * @see com.city.network.MNetworkPackage#getStation_DisabledAccess()
	 * @model
	 * @generated
	 */
	boolean isDisabledAccess();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#isDisabledAccess <em>Disabled Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled Access</em>' attribute.
	 * @see #isDisabledAccess()
	 * @generated
	 */
	void setDisabledAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Of Elevators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Elevators</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Elevators</em>' attribute.
	 * @see #setNbOfElevators(int)
	 * @see com.city.network.MNetworkPackage#getStation_NbOfElevators()
	 * @model
	 * @generated
	 */
	int getNbOfElevators();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#getNbOfElevators <em>Nb Of Elevators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Elevators</em>' attribute.
	 * @see #getNbOfElevators()
	 * @generated
	 */
	void setNbOfElevators(int value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(int)
	 * @see com.city.network.MNetworkPackage#getStation_Zone()
	 * @model
	 * @generated
	 */
	int getZone();

	/**
	 * Sets the value of the '{@link com.city.network.MStation#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * returns true if this station is on different lines.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isNode();

} // MStation
