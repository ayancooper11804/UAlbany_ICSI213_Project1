/**
 * SUNY UAlbany ICSI 213 Project 1: Payroll System
 * In this assignment, I have started working on a payroll system. I've built classes that represent 
 * the various ways different groups of employees might be paid.
 * @author Ayan Cooper, CS Major, Class of 2026
 *
 */

// Class for employees with an commission schedule. Inherits from the SalariedEmployee class.
public class CommissionedEmployee extends SalariedEmployee{

	// 2D array for commission schedule
	private float[][] commissionSchedule;
	// Units sold
	private float unitsSold;
	
	/**
	 * CommissionedEmployee class constructor used to create CommissionedEmployee object.
	 * @param firstName: The employee's first name.
	 * @param lastName: The employee's last name.
	 * @param schedule: The commission schedule for the employee.
	 * @param baserate: The pay rate of the employee.
	 */
	public CommissionedEmployee(String firstName, String lastName, float[][] schedule, float baserate) {
		super(firstName, lastName, baserate);
		commissionSchedule = schedule;
	}
	
	// Accessor and mutator for units
	public float getUnits() {
		return unitsSold;
	}
	public void setUnits(float units) {
		this.unitsSold = units;
	}
	
	// Accessor and mutator for commission schedule. They use a copy method to copy the contents of 
	// of one 2D array to another 2D array.
	public float[][] getCommSched(float[][] original) {
		float[][] copy = new float[original.length][original[0].length];
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[0].length; j++) {
				copy[i][j] = original[i][j];
			}
		}
		return copy;
	}
	public void setCommSched(float[][] original) {
		float[][] copy = new float[original.length][original[0].length];
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[0].length; j++) {
				copy[i][j] = original[i][j];
			}
		}
		this.commissionSchedule = copy;
	}
	
	/**
	 * Implement GetPaycheck method from the SalariedEmployee class. It is used to calculate the employee's pay by 
	 * dividing the base pay rate by 26, then finding the highest value per unit where the number of units sold is 
	 * greater than the minimum units. Afterward, we multiply the units sold by the value per unit and add that 
	 * to the base pay.
	 */
	public float GetPaycheck() {
		float highest = 0;
		
		for (int i = 0; i < commissionSchedule.length; i++) {
			if (unitsSold < commissionSchedule[i][0]) {
				if (i == 0) {
					highest = commissionSchedule[0][1];
				}
				else {
					highest = commissionSchedule[i - 1][1];
				}
				break;
			}
		}
		if (unitsSold > commissionSchedule[commissionSchedule.length-1][0]) {
			highest = commissionSchedule[commissionSchedule.length-1][1];
		}
		
		return super.GetPaycheck() + (unitsSold * highest);
 	}
	
	// Override toString method from SalariedEmployee class. It replaces the annual pay with the employee's commission pay.
	@Override
	public String toString() {
		return "Commission: Base : $" + getSalary() + "; Id:" + getCurrentID() + " - " + getLastName() + ", " + getFirstName();
	}
	
}
