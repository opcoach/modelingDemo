/**
 */
package com.city.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.city.network.MNetworkFactory
 * @model kind="package"
 * @generated
 */
public interface MNetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.city.network/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "network";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MNetworkPackage eINSTANCE = com.city.network.impl.MNetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.city.network.impl.MLocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.city.network.impl.MLocationImpl
	 * @see com.city.network.impl.MNetworkPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALTITUDE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.city.network.impl.MCityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.city.network.impl.MCityImpl
	 * @see com.city.network.impl.MNetworkPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LONGITUDE = LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LATITUDE = LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ALTITUDE = LOCATION__ALTITUDE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STATIONS = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LINES = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__COUNTRY = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.city.network.impl.MStationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.city.network.impl.MStationImpl
	 * @see com.city.network.impl.MNetworkPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LONGITUDE = LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LATITUDE = LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ALTITUDE = LOCATION__ALTITUDE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__TYPE = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Office</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__OFFICE = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Of Ticket Machines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NB_OF_TICKET_MACHINES = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__OPENED = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__DISABLED_ACCESS = LOCATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Of Elevators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NB_OF_ELEVATORS = LOCATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ZONE = LOCATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION___IS_NODE = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.city.network.impl.MLineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.city.network.impl.MLineImpl
	 * @see com.city.network.impl.MNetworkPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STATIONS = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TOPOLOGY = 4;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE___NEXT__MSTATION = 0;

	/**
	 * The operation id for the '<em>Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE___PREVIOUS__MSTATION = 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.city.network.TransportType <em>Transport Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.city.network.TransportType
	 * @see com.city.network.impl.MNetworkPackageImpl#getTransportType()
	 * @generated
	 */
	int TRANSPORT_TYPE = 4;

	/**
	 * The meta object id for the '{@link com.city.network.Topology <em>Topology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.city.network.Topology
	 * @see com.city.network.impl.MNetworkPackageImpl#getTopology()
	 * @generated
	 */
	int TOPOLOGY = 5;

	/**
	 * Returns the meta object for class '{@link com.city.network.MCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see com.city.network.MCity
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MCity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.city.network.MCity#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.city.network.MCity#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see com.city.network.MCity#getStations()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.city.network.MCity#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see com.city.network.MCity#getLines()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Lines();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MCity#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.city.network.MCity#getCountry()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Country();

	/**
	 * Returns the meta object for class '{@link com.city.network.MStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see com.city.network.MStation
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.city.network.MStation#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.city.network.MStation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see com.city.network.MStation#getType()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#isOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office</em>'.
	 * @see com.city.network.MStation#isOffice()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Office();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#getNbOfTicketMachines <em>Nb Of Ticket Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Ticket Machines</em>'.
	 * @see com.city.network.MStation#getNbOfTicketMachines()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NbOfTicketMachines();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#isOpened <em>Opened</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opened</em>'.
	 * @see com.city.network.MStation#isOpened()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Opened();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#isDisabledAccess <em>Disabled Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled Access</em>'.
	 * @see com.city.network.MStation#isDisabledAccess()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_DisabledAccess();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#getNbOfElevators <em>Nb Of Elevators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Elevators</em>'.
	 * @see com.city.network.MStation#getNbOfElevators()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NbOfElevators();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MStation#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see com.city.network.MStation#getZone()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Zone();

	/**
	 * Returns the meta object for the '{@link com.city.network.MStation#isNode() <em>Is Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Node</em>' operation.
	 * @see com.city.network.MStation#isNode()
	 * @generated
	 */
	EOperation getStation__IsNode();

	/**
	 * Returns the meta object for class '{@link com.city.network.MLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see com.city.network.MLine
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.city.network.MLine#getName()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.city.network.MLine#getType()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Type();

	/**
	 * Returns the meta object for the reference list '{@link com.city.network.MLine#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see com.city.network.MLine#getStations()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Stations();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLine#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.city.network.MLine#getLength()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Length();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLine#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topology</em>'.
	 * @see com.city.network.MLine#getTopology()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Topology();

	/**
	 * Returns the meta object for the '{@link com.city.network.MLine#next(com.city.network.MStation) <em>Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Next</em>' operation.
	 * @see com.city.network.MLine#next(com.city.network.MStation)
	 * @generated
	 */
	EOperation getLine__Next__MStation();

	/**
	 * Returns the meta object for the '{@link com.city.network.MLine#previous(com.city.network.MStation) <em>Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Previous</em>' operation.
	 * @see com.city.network.MLine#previous(com.city.network.MStation)
	 * @generated
	 */
	EOperation getLine__Previous__MStation();

	/**
	 * Returns the meta object for class '{@link com.city.network.MLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.city.network.MLocation
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLocation#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see com.city.network.MLocation#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLocation#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see com.city.network.MLocation#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link com.city.network.MLocation#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see com.city.network.MLocation#getAltitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Altitude();

	/**
	 * Returns the meta object for enum '{@link com.city.network.TransportType <em>Transport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Type</em>'.
	 * @see com.city.network.TransportType
	 * @generated
	 */
	EEnum getTransportType();

	/**
	 * Returns the meta object for enum '{@link com.city.network.Topology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Topology</em>'.
	 * @see com.city.network.Topology
	 * @generated
	 */
	EEnum getTopology();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MNetworkFactory getNetworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.city.network.impl.MCityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.city.network.impl.MCityImpl
		 * @see com.city.network.impl.MNetworkPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__STATIONS = eINSTANCE.getCity_Stations();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__LINES = eINSTANCE.getCity_Lines();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__COUNTRY = eINSTANCE.getCity_Country();

		/**
		 * The meta object literal for the '{@link com.city.network.impl.MStationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.city.network.impl.MStationImpl
		 * @see com.city.network.impl.MNetworkPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__TYPE = eINSTANCE.getStation_Type();

		/**
		 * The meta object literal for the '<em><b>Office</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__OFFICE = eINSTANCE.getStation_Office();

		/**
		 * The meta object literal for the '<em><b>Nb Of Ticket Machines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NB_OF_TICKET_MACHINES = eINSTANCE.getStation_NbOfTicketMachines();

		/**
		 * The meta object literal for the '<em><b>Opened</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__OPENED = eINSTANCE.getStation_Opened();

		/**
		 * The meta object literal for the '<em><b>Disabled Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__DISABLED_ACCESS = eINSTANCE.getStation_DisabledAccess();

		/**
		 * The meta object literal for the '<em><b>Nb Of Elevators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NB_OF_ELEVATORS = eINSTANCE.getStation_NbOfElevators();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__ZONE = eINSTANCE.getStation_Zone();

		/**
		 * The meta object literal for the '<em><b>Is Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATION___IS_NODE = eINSTANCE.getStation__IsNode();

		/**
		 * The meta object literal for the '{@link com.city.network.impl.MLineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.city.network.impl.MLineImpl
		 * @see com.city.network.impl.MNetworkPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__NAME = eINSTANCE.getLine_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__TYPE = eINSTANCE.getLine_Type();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__STATIONS = eINSTANCE.getLine_Stations();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__LENGTH = eINSTANCE.getLine_Length();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__TOPOLOGY = eINSTANCE.getLine_Topology();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE___NEXT__MSTATION = eINSTANCE.getLine__Next__MStation();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE___PREVIOUS__MSTATION = eINSTANCE.getLine__Previous__MStation();

		/**
		 * The meta object literal for the '{@link com.city.network.impl.MLocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.city.network.impl.MLocationImpl
		 * @see com.city.network.impl.MNetworkPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ALTITUDE = eINSTANCE.getLocation_Altitude();

		/**
		 * The meta object literal for the '{@link com.city.network.TransportType <em>Transport Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.city.network.TransportType
		 * @see com.city.network.impl.MNetworkPackageImpl#getTransportType()
		 * @generated
		 */
		EEnum TRANSPORT_TYPE = eINSTANCE.getTransportType();

		/**
		 * The meta object literal for the '{@link com.city.network.Topology <em>Topology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.city.network.Topology
		 * @see com.city.network.impl.MNetworkPackageImpl#getTopology()
		 * @generated
		 */
		EEnum TOPOLOGY = eINSTANCE.getTopology();

	}

} //MNetworkPackage
