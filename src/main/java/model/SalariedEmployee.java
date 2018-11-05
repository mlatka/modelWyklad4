package model;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class SalariedEmployee extends Employee
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private double weeklySalary;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SalariedEmployee(){
		super();
	}

	public SalariedEmployee(String firstName, String lastName, String socilaSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socilaSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double earnings() {
		return weeklySalary;
	}

}

