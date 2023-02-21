/**
 * SUNY UAlbany ICSI 213 Project 1: Payroll System
 * In this assignment, I have started working on a payroll system. I've built classes that represent 
 * the various ways different groups of employees might be paid.
 * @author Ayan Cooper, CS Major, Class of 2026
 *
 */

// Class for employees with an annual pay rate. Inherits from the Employee class.
public class SalariedEmployee extends Employee{

	// Annual pay for employee.
	protected float salary;
	
	/**
	 * SalariedEmployee class constructor used to create a SalariedEmployee object.
	 * @param firstName: The employee's first name.
	 * @param lastName: The employee's last name.
	 * @param annualPay: The employee's annual paycheck.
	 */
	public SalariedEmployee(String firstName, String lastName, float annualPay) {
		super(firstName, lastName);
		salary = annualPay;
	}
	
	/**
	 * Implement GetPaycheck method from the Employee class. It is used to calculate the employee's pay by 
	 * dividing their annual pay 26 (pay is calculated 26 times a year).
	 */
	public float GetPaycheck() {
		return salary / 26;
	}
	
	// Accessor and mutator for salary
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	// Override toString method from Employee class. Adds the employee's annual pay.
	@Override
	public String toString() {
		return "Salaried, Base : $" + salary + "; Id:" + getCurrentID() + " - " + getLastName() + ", " + getFirstName();
	}
	
}
