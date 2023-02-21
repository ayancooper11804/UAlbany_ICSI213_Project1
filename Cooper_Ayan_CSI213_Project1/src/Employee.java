/**
 * SUNY UAlbany ICSI 213 Project 1: Payroll System
 * In this assignment, I have started working on a payroll system. I've built classes that represent 
 * the various ways different groups of employees might be paid.
 * @author Ayan Cooper, CS Major, Class of 2026
 *
 */

// Base employee class
public abstract class Employee {

	// Next employee ID
	private static int nextEmployeeID = 0;
	// Current employee ID
	private int currentEmployeeID = 0;
	
	// First and last name
	private String fname;
	private String lname;
	
	/**
	 * Employee class constructor used to create an Employee object.
	 * @param firstName: The employee's first name.
	 * @param lastName: The employee's last name.
	 */
	public Employee(String firstName, String lastName) {
		fname = firstName;
		lname = lastName;
		currentEmployeeID = nextEmployeeID;
		nextEmployeeID++;
	}
	
	// Accessor and mutator for current employee ID
	public int getCurrentID() {
		return currentEmployeeID;
	}
	public void setCurrentID(int employeeID) {
		this.currentEmployeeID = employeeID;
	}
	
	// Accessor and mutator for first name
	public String getFirstName() {
		return fname;
	}
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	
	// Accessor and mutator for last name
	public String getLastName() {
		return lname;
	}
	public void setLastName(String lname) {
		this.lname = lname;
	}
	
	/**
	 * GetPaycheck method, returns a float that will be used in other classes for getting an employee's paycheck.
	 */
	public abstract float GetPaycheck();
	
	// toString method, outputs the employee's ID, first, and last name.
	public String toString() {
		return "Id:" + currentEmployeeID + " - " + lname + ", " + fname;
	}

}
