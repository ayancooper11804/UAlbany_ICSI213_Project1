

import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTest {

	
	// ------ Salaried Employee Class Tests ------
	
	/*
	 * Tests if salaried employee is created correctly
	 */
	@Test
	public void test11() throws Exception {
		SalariedEmployee employee0 = new SalariedEmployee("Cal", "Jun", 9000);
		assertEquals("Cal", employee0.getFirstName());
		assertEquals("Jun", employee0.getLastName());
		assertEquals("9000.0", String.valueOf(employee0.getSalary()));
		assertEquals("Salaried, Base : $9000.0; Id:0 - Jun, Cal", employee0.toString());
	}
	
	/*
	 * Tests if salaried employee's name changes correctly
	 */
	
	@Test
	public void test12() throws Exception {
		SalariedEmployee employee1 = new SalariedEmployee("Kid", "Bills", 150000);
		assertEquals("Kid", employee1.getFirstName());
		assertEquals("Bills", employee1.getLastName());
		employee1.setFirstName("Kiddy");
		employee1.setLastName("Billfred");
		assertEquals("Kiddy", employee1.getFirstName());
		assertEquals("Billfred", employee1.getLastName());
	}
	
	/*
	 * Tests if salaried employee's paycheck is returned properly
	 */
	@Test
	public void test13() throws Exception {
		SalariedEmployee employee2 = new SalariedEmployee("Jacob", "Kyan", 20000);
		assertEquals(String.valueOf((float)20000/26), String.valueOf(employee2.GetPaycheck()));
	}
	
	/*
	 * Tests if salaried employee's yearly pay is returned properly
	 */
	@Test
	public void test14() throws Exception {
		SalariedEmployee employee3 = new SalariedEmployee("Max", "Kuph", 15600);
		assertEquals(String.valueOf(15600.0), String.valueOf(employee3.getSalary()));
	}
	
	/*
	 * Tests if salaried employee's yearly pay changes properly
	 */
	@Test
	public void test15() throws Exception {
		SalariedEmployee employee4 = new SalariedEmployee("Mike", "Foo", 75600);
		assertEquals(String.valueOf(75600.0), String.valueOf(employee4.getSalary()));
		assertEquals(String.valueOf((float)75600/26), String.valueOf(employee4.GetPaycheck()));
		assertEquals("Salaried, Base : $75600.0; Id:4 - Foo, Mike", employee4.toString());
		employee4.setSalary((float)87654);
		assertEquals(String.valueOf(87654.0), String.valueOf(employee4.getSalary()));
		assertEquals(String.valueOf((float)87654/26), String.valueOf(employee4.GetPaycheck()));
		assertEquals("Salaried, Base : $87654.0; Id:4 - Foo, Mike", employee4.toString());
	}
	
	
	// ------ Hourlyployee Class Tests ------
	
	/*
	 * Tests if hourly employee is created properly
	 */
	@Test
	public void test16() throws Exception {
		HourlyEmployee employee5 = new HourlyEmployee("Mike", "Long", 600000);
		assertEquals("Mike", employee5.getFirstName());
		assertEquals("Long", employee5.getLastName());
		assertEquals("600000.0", String.valueOf(employee5.getPayRate()));
		assertEquals("Hourly: $600000.0; Id:5 - Long, Mike", employee5.toString());
	}
	
	/*
	 * Tests if hourly employee's name changes correctly
	 */
	
	@Test
	public void test17() throws Exception {
		HourlyEmployee employee6 = new HourlyEmployee("Red", "Pill", 150000);
		assertEquals("Red", employee6.getFirstName());
		assertEquals("Pill", employee6.getLastName());
		employee6.setFirstName("Blue");
		employee6.setLastName("Pull");
		assertEquals("Blue", employee6.getFirstName());
		assertEquals("Pull", employee6.getLastName());
	}
	
	/*
	 * Tests if hourly employee's hours worked is set correctly
	 */
	
	@Test
	public void test18() throws Exception {
		HourlyEmployee employee7 = new HourlyEmployee("Blue", "Fin", 19800);
		assertEquals(String.valueOf((float)0), String.valueOf(employee7.getHours()));
		employee7.setHours(15);
		assertEquals(String.valueOf((float)15), String.valueOf(employee7.getHours()));
		assertEquals("Hourly: $19800.0; Id:7 - Fin, Blue", employee7.toString());
	}
	
	/*
	 * Tests if hourly employee's pay check is returned properly
	 */
	@Test
	public void test19() throws Exception {
		HourlyEmployee employee8 = new HourlyEmployee("Jaob", "Kan", 20000);
		employee8.setHours(17);
		assertEquals(String.valueOf((float)20000*17), String.valueOf(employee8.GetPaycheck()));
	}
	
	/*
	 * Tests if hourly employee's pay rate changes correctly
	 */
	@Test
	public void test20() throws Exception {
		HourlyEmployee employee9 = new HourlyEmployee("Aob", "Ani", 14500);
		assertEquals(String.valueOf(14500.0), String.valueOf(employee9.getPayRate()));
		employee9.setPayRate(15500);
		assertEquals(String.valueOf(15500.0), String.valueOf(employee9.getPayRate()));
		assertEquals("Hourly: $15500.0; Id:9 - Ani, Aob", employee9.toString());
	}
	
	
	// ------ Commission Employee Class Tests ------
	
	float[][] cs = {{(float)0.0, (float)2.5}, {(float)12.0, (float)3.2}, {(float)25.0,
		(float)4.1}, {(float)33.0, (float)4.9}, {(float)42.0, (float)5.2}};
	
	/*
	 * Tests if commission employee is created properly
	 */
	@Test
	public void test21() throws Exception {
		CommissionedEmployee employee10 = new CommissionedEmployee("Billy", "Bobby", cs, 15000);
		assertEquals("Billy", employee10.getFirstName());
		assertEquals("Bobby", employee10.getLastName());
		employee10.setUnits(22);
		assertEquals(String.valueOf(((float)15000.0/(float)26.0) + (float)(22.0*3.2)), String.valueOf(employee10.GetPaycheck()));
		assertEquals("Commission: Base : $15000.0; Id:10 - Bobby, Billy", employee10.toString());
	}
}