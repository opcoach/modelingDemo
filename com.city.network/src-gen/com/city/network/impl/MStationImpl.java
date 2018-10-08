/**
 */
package com.city.network.impl;

import com.city.network.MNetworkPackage;
import com.city.network.Station;
import com.city.network.TransportType;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.city.network.impl.MStationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#isOffice <em>Office</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#getNbOfTicketMachines <em>Nb Of Ticket Machines</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#isOpened <em>Opened</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#isDisabledAccess <em>Disabled Access</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#getNbOfElevators <em>Nb Of Elevators</em>}</li>
 *   <li>{@link com.city.network.impl.MStationImpl#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MStationImpl extends LocationImpl implements Station {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportType> type;

	/**
	 * The default value of the '{@link #isOffice() <em>Office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OFFICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOffice() <em>Office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffice()
	 * @generated
	 * @ordered
	 */
	protected boolean office = OFFICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbOfTicketMachines() <em>Nb Of Ticket Machines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfTicketMachines()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_TICKET_MACHINES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfTicketMachines() <em>Nb Of Ticket Machines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfTicketMachines()
	 * @generated
	 * @ordered
	 */
	protected int nbOfTicketMachines = NB_OF_TICKET_MACHINES_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpened() <em>Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpened()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPENED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpened() <em>Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpened()
	 * @generated
	 * @ordered
	 */
	protected boolean opened = OPENED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisabledAccess() <em>Disabled Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabledAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabledAccess() <em>Disabled Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabledAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean disabledAccess = DISABLED_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbOfElevators() <em>Nb Of Elevators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfElevators()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_ELEVATORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfElevators() <em>Nb Of Elevators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfElevators()
	 * @generated
	 * @ordered
	 */
	protected int nbOfElevators = NB_OF_ELEVATORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final int ZONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected int zone = ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MStationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MNetworkPackage.Literals.STATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportType> getType() {
		if (type == null) {
			type = new EDataTypeUniqueEList<TransportType>(TransportType.class, this, MNetworkPackage.STATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOffice() {
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice(boolean newOffice) {
		boolean oldOffice = office;
		office = newOffice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__OFFICE, oldOffice, office));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfTicketMachines() {
		return nbOfTicketMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfTicketMachines(int newNbOfTicketMachines) {
		int oldNbOfTicketMachines = nbOfTicketMachines;
		nbOfTicketMachines = newNbOfTicketMachines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__NB_OF_TICKET_MACHINES,
					oldNbOfTicketMachines, nbOfTicketMachines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpened() {
		return opened;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpened(boolean newOpened) {
		boolean oldOpened = opened;
		opened = newOpened;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__OPENED, oldOpened, opened));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabledAccess() {
		return disabledAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledAccess(boolean newDisabledAccess) {
		boolean oldDisabledAccess = disabledAccess;
		disabledAccess = newDisabledAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__DISABLED_ACCESS,
					oldDisabledAccess, disabledAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfElevators() {
		return nbOfElevators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfElevators(int newNbOfElevators) {
		int oldNbOfElevators = nbOfElevators;
		nbOfElevators = newNbOfElevators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__NB_OF_ELEVATORS,
					oldNbOfElevators, nbOfElevators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(int newZone) {
		int oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MNetworkPackage.STATION__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNode() {
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
		case MNetworkPackage.STATION__NAME:
			return getName();
		case MNetworkPackage.STATION__TYPE:
			return getType();
		case MNetworkPackage.STATION__OFFICE:
			return isOffice();
		case MNetworkPackage.STATION__NB_OF_TICKET_MACHINES:
			return getNbOfTicketMachines();
		case MNetworkPackage.STATION__OPENED:
			return isOpened();
		case MNetworkPackage.STATION__DISABLED_ACCESS:
			return isDisabledAccess();
		case MNetworkPackage.STATION__NB_OF_ELEVATORS:
			return getNbOfElevators();
		case MNetworkPackage.STATION__ZONE:
			return getZone();
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
		case MNetworkPackage.STATION__NAME:
			setName((String) newValue);
			return;
		case MNetworkPackage.STATION__TYPE:
			getType().clear();
			getType().addAll((Collection<? extends TransportType>) newValue);
			return;
		case MNetworkPackage.STATION__OFFICE:
			setOffice((Boolean) newValue);
			return;
		case MNetworkPackage.STATION__NB_OF_TICKET_MACHINES:
			setNbOfTicketMachines((Integer) newValue);
			return;
		case MNetworkPackage.STATION__OPENED:
			setOpened((Boolean) newValue);
			return;
		case MNetworkPackage.STATION__DISABLED_ACCESS:
			setDisabledAccess((Boolean) newValue);
			return;
		case MNetworkPackage.STATION__NB_OF_ELEVATORS:
			setNbOfElevators((Integer) newValue);
			return;
		case MNetworkPackage.STATION__ZONE:
			setZone((Integer) newValue);
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
		case MNetworkPackage.STATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MNetworkPackage.STATION__TYPE:
			getType().clear();
			return;
		case MNetworkPackage.STATION__OFFICE:
			setOffice(OFFICE_EDEFAULT);
			return;
		case MNetworkPackage.STATION__NB_OF_TICKET_MACHINES:
			setNbOfTicketMachines(NB_OF_TICKET_MACHINES_EDEFAULT);
			return;
		case MNetworkPackage.STATION__OPENED:
			setOpened(OPENED_EDEFAULT);
			return;
		case MNetworkPackage.STATION__DISABLED_ACCESS:
			setDisabledAccess(DISABLED_ACCESS_EDEFAULT);
			return;
		case MNetworkPackage.STATION__NB_OF_ELEVATORS:
			setNbOfElevators(NB_OF_ELEVATORS_EDEFAULT);
			return;
		case MNetworkPackage.STATION__ZONE:
			setZone(ZONE_EDEFAULT);
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
		case MNetworkPackage.STATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MNetworkPackage.STATION__TYPE:
			return type != null && !type.isEmpty();
		case MNetworkPackage.STATION__OFFICE:
			return office != OFFICE_EDEFAULT;
		case MNetworkPackage.STATION__NB_OF_TICKET_MACHINES:
			return nbOfTicketMachines != NB_OF_TICKET_MACHINES_EDEFAULT;
		case MNetworkPackage.STATION__OPENED:
			return opened != OPENED_EDEFAULT;
		case MNetworkPackage.STATION__DISABLED_ACCESS:
			return disabledAccess != DISABLED_ACCESS_EDEFAULT;
		case MNetworkPackage.STATION__NB_OF_ELEVATORS:
			return nbOfElevators != NB_OF_ELEVATORS_EDEFAULT;
		case MNetworkPackage.STATION__ZONE:
			return zone != ZONE_EDEFAULT;
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
		case MNetworkPackage.STATION___IS_NODE:
			return isNode();
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
		result.append(", office: ");
		result.append(office);
		result.append(", nbOfTicketMachines: ");
		result.append(nbOfTicketMachines);
		result.append(", opened: ");
		result.append(opened);
		result.append(", disabledAccess: ");
		result.append(disabledAccess);
		result.append(", nbOfElevators: ");
		result.append(nbOfElevators);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //MStationImpl
