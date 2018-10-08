/**
 */
package com.city.network.impl;

import com.city.network.Line;
import com.city.network.MNetworkPackage;
import com.city.network.Station;
import com.city.network.Topology;
import com.city.network.TransportType;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.city.network.impl.MLineImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.city.network.impl.MLineImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.city.network.impl.MLineImpl#getStations <em>Stations</em>}</li>
 *   <li>{@link com.city.network.impl.MLineImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.city.network.impl.MLineImpl#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLineImpl extends MinimalEObjectImpl.Container implements Line {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TransportType TYPE_EDEFAULT = TransportType.BUS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TransportType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopology() <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected static final Topology TOPOLOGY_EDEFAULT = Topology.LINEAR;

	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected Topology topology = TOPOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MNetworkPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TransportType newType) {
		TransportType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.LINE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectResolvingEList<Station>(Station.class, this, MNetworkPackage.LINE__STATIONS);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.LINE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topology getTopology() {
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopology(Topology newTopology) {
		Topology oldTopology = topology;
		topology = newTopology == null ? TOPOLOGY_EDEFAULT : newTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.LINE__TOPOLOGY, oldTopology,
					topology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station next(Station station) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station previous(Station station) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MNetworkPackage.LINE__NAME:
			return getName();
		case MNetworkPackage.LINE__TYPE:
			return getType();
		case MNetworkPackage.LINE__STATIONS:
			return getStations();
		case MNetworkPackage.LINE__LENGTH:
			return getLength();
		case MNetworkPackage.LINE__TOPOLOGY:
			return getTopology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MNetworkPackage.LINE__NAME:
			setName((String) newValue);
			return;
		case MNetworkPackage.LINE__TYPE:
			setType((TransportType) newValue);
			return;
		case MNetworkPackage.LINE__STATIONS:
			getStations().clear();
			getStations().addAll((Collection<? extends Station>) newValue);
			return;
		case MNetworkPackage.LINE__LENGTH:
			setLength((Float) newValue);
			return;
		case MNetworkPackage.LINE__TOPOLOGY:
			setTopology((Topology) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MNetworkPackage.LINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MNetworkPackage.LINE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MNetworkPackage.LINE__STATIONS:
			getStations().clear();
			return;
		case MNetworkPackage.LINE__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case MNetworkPackage.LINE__TOPOLOGY:
			setTopology(TOPOLOGY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MNetworkPackage.LINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MNetworkPackage.LINE__TYPE:
			return type != TYPE_EDEFAULT;
		case MNetworkPackage.LINE__STATIONS:
			return stations != null && !stations.isEmpty();
		case MNetworkPackage.LINE__LENGTH:
			return length != LENGTH_EDEFAULT;
		case MNetworkPackage.LINE__TOPOLOGY:
			return topology != TOPOLOGY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MNetworkPackage.LINE___NEXT__MSTATION:
			return next((Station) arguments.get(0));
		case MNetworkPackage.LINE___PREVIOUS__MSTATION:
			return previous((Station) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", length: ");
		result.append(length);
		result.append(", topology: ");
		result.append(topology);
		result.append(')');
		return result.toString();
	}

} //MLineImpl
