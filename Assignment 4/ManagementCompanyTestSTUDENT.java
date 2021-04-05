
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	

	ManagementCompany m ; 
	
	@Before
	public void setUp() throws Exception {
		
		m= new ManagementCompany("Railey", "555555555",6);
		
		m.addProperty("Almost Aspen", "Glendale", 4844.00, "Sammy Smith",2,1,2,2);
		m.addProperty("Ambiance", "Lakewood", 4114, "Tammy Taylor",4,1,2,2);
		m.addProperty ("Bear Creek Lodge", "Peninsula", 4905, "Bubba Burley",6,1,2,2);
		
	
	 
	
	}

	@After
	public void tearDown() {
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
	
		 
		assertEquals(m.addProperty("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2),3,0);
		assertEquals(m.addProperty("Mystic Cove", "Lakepointe", 5327, "Joey BagODonuts",4,5,2,2),4,0);
		assertEquals(m.addProperty("Too Many Properties", "Lakepointe", 1000, "Joey BagODonuts",6,5,2,2),-1,0);  //exceeds the size of the array and can not be added, add property should return -1
		
	}
 
	@Test
	public void testMaxRentProp() {
	
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),4905.0,0);
	}

	@Test
	public void testTotalRent() {
		
		assertEquals(m.totalRent(),13863.0,0);
		//student should test if totalRent returns the total rent of properties
	}

 }