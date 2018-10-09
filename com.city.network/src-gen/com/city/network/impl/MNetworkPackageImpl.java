/**
 */
package com.city.network.impl;

import com.city.network.City;
import com.city.network.Line;
import com.city.network.Location;
import com.city.network.MNetworkFactory;
import com.city.network.MNetworkPackage;
import com.city.network.Station;
import com.city.network.Topology;
import com.city.network.TransportType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MNetworkPackageImpl extends EPackageImpl implements MNetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum topologyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.city.network.MNetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MNetworkPackageImpl() {
		super(eNS_URI, MNetworkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MNetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MNetworkPackage init() {
		if (isInited)
			return (MNetworkPackage) EPackage.Registry.INSTANCE.getEPackage(MNetworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MNetworkPackageImpl theNetworkPackage = registeredNetworkPackage instanceof MNetworkPackageImpl
				? (MNetworkPackageImpl) registeredNetworkPackage
				: new MNetworkPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNetworkPackage.createPackageContents();

		// Initialize created meta-data
		theNetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MNetworkPackage.eNS_URI, theNetworkPackage);
		return theNetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute) cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_Stations() {
		return (EReference) cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_Lines() {
		return (EReference) cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Country() {
		return (EAttribute) cityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Name() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Type() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Office() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_NbOfTicketMachines() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Opened() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_DisabledAccess() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_NbOfElevators() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Zone() {
		return (EAttribute) stationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStation__IsNode() {
		return stationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Name() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Type() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Stations() {
		return (EReference) lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Length() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Topology() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLine__Next__MStation() {
		return lineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLine__Previous__MStation() {
		return lineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Longitude() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Latitude() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Altitude() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportType() {
		return transportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTopology() {
		return topologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MNetworkFactory getNetworkFactory() {
		return (MNetworkFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);
		createEReference(cityEClass, CITY__STATIONS);
		createEReference(cityEClass, CITY__LINES);
		createEAttribute(cityEClass, CITY__COUNTRY);

		stationEClass = createEClass(STATION);
		createEAttribute(stationEClass, STATION__NAME);
		createEAttribute(stationEClass, STATION__TYPE);
		createEAttribute(stationEClass, STATION__OFFICE);
		createEAttribute(stationEClass, STATION__NB_OF_TICKET_MACHINES);
		createEAttribute(stationEClass, STATION__OPENED);
		createEAttribute(stationEClass, STATION__DISABLED_ACCESS);
		createEAttribute(stationEClass, STATION__NB_OF_ELEVATORS);
		createEAttribute(stationEClass, STATION__ZONE);
		createEOperation(stationEClass, STATION___IS_NODE);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__NAME);
		createEAttribute(lineEClass, LINE__TYPE);
		createEReference(lineEClass, LINE__STATIONS);
		createEAttribute(lineEClass, LINE__LENGTH);
		createEAttribute(lineEClass, LINE__TOPOLOGY);
		createEOperation(lineEClass, LINE___NEXT__MSTATION);
		createEOperation(lineEClass, LINE___PREVIOUS__MSTATION);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__ALTITUDE);

		// Create enums
		transportTypeEEnum = createEEnum(TRANSPORT_TYPE);
		topologyEEnum = createEEnum(TOPOLOGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cityEClass.getESuperTypes().add(this.getLocation());
		stationEClass.getESuperTypes().add(this.getLocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_Stations(), this.getStation(), null, "stations", null, 0, -1, City.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCity_Lines(), this.getLine(), null, "lines", null, 0, -1, City.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCity_Country(), ecorePackage.getEString(), "country", null, 0, 1, City.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Station.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Type(), this.getTransportType(), "type", null, 1, 3, Station.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Office(), ecorePackage.getEBoolean(), "office", null, 0, 1, Station.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_NbOfTicketMachines(), ecorePackage.getEInt(), "nbOfTicketMachines", null, 0, 1,
				Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Opened(), ecorePackage.getEBoolean(), "opened", null, 0, 1, Station.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_DisabledAccess(), ecorePackage.getEBoolean(), "disabledAccess", null, 0, 1,
				Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_NbOfElevators(), ecorePackage.getEInt(), "nbOfElevators", null, 0, 1, Station.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Zone(), ecorePackage.getEInt(), "zone", null, 0, 1, Station.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStation__IsNode(), ecorePackage.getEBoolean(), "isNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Name(), ecorePackage.getEString(), "name", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Type(), this.getTransportType(), "type", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Stations(), this.getStation(), null, "stations", null, 0, -1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getLine_Length(), ecorePackage.getEFloat(), "length", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Topology(), this.getTopology(), "topology", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLine__Next__MStation(), this.getStation(), "next", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getStation(), "station", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLine__Previous__MStation(), this.getStation(), "previous", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStation(), "station", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEDouble(), "longitude", null, 0, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Latitude(), ecorePackage.getEDouble(), "latitude", null, 0, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Altitude(), ecorePackage.getEFloat(), "altitude", null, 0, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transportTypeEEnum, TransportType.class, "TransportType");
		addEEnumLiteral(transportTypeEEnum, TransportType.BUS);
		addEEnumLiteral(transportTypeEEnum, TransportType.METRO);
		addEEnumLiteral(transportTypeEEnum, TransportType.TRAIN);
		addEEnumLiteral(transportTypeEEnum, TransportType.TRAMWAY);

		initEEnum(topologyEEnum, Topology.class, "Topology");
		addEEnumLiteral(topologyEEnum, Topology.LINEAR);
		addEEnumLiteral(topologyEEnum, Topology.CIRCULAR);

		// Create resource
		createResource(eNS_URI);
	}

} //MNetworkPackageImpl
