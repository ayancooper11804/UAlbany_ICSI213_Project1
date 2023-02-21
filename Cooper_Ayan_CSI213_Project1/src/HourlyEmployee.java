/**
 * SUNY UAlbany ICSI 213 Project 1: Payroll System
 * In this assignment, I have started working on a payroll system. I've built classes that represent 
 * the various ways different groups of employees might be paid.
 * @author Ayan Cooper, CS Major, Class of 2026
 *
 */

// Class for employees with an hourly pay rate. Inherits from the Employee class.
public class HourlyEmployee extends Employee{

	// Hours worked and pay rate
	private float hoursWorked;
	private float payRate;
	
	/**
	 * HourlyEmployee class constructor used to create HourlyEmployee object.
	 * @param firstName: The employee's first name.
	 * @param lastName: The employee's last name.
	 * @param hourlyRate: The employee's hourly pay rate.
	 */
	public HourlyEmployee(String firstName, String lastName, float hourlyRate) {
		super(firstName, lastName);
		payRate = hourlyRate;
	}
	
	/**
	 * Implement GetPaycheck method from the Employee class. It is used to calculate the employee's pay by 
	 * multiplying the hours the employee worked by their pay rate.
	 */
	public float GetPaycheck() {
		return hoursWorked * payRate;
	}
	
	// Accessor and mutator for hours
	public float getHours() {
		return hoursWorked;
	}
	public void setHours(float hours) {
		this.hoursWorked = hours;
	}
	
	// Accessor and mutator for pay rate
	public float getPayRate() {
		return payRate;
	}
	public void setPayRate(float payRate) {
		this.payRate = payRate;
	}
	
	// Override toString method from Employee class. Adds the employee's hourly pay.
	@Override
	public String toString() {
		return "Hourly: $" + payRate + "; Id:" + getCurrentID() + " - " + getLastName() + ", " + getFirstName();
	}

}
