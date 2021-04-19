import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestSTUDENTTest {

	private double[][] studentSet1 = { { 4, 2, 3 }, { 3, 6 }, { 7, 9, 6 } };
	private double[][] studentSet2 = { { 7, 3, 2 }, { 4, 9 }, { 6, 10, 4 } };
	private double[][] studentSet3 = { { 1, 2, 3 }, { 5, 4 }, { 8, 9, 10 } };


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000
	 * as other
	 */
	@Test
	public void testCalculateHolidayBonusSTUDENTA() {

		try {
			double[] result = HolidayBonus.calculateHolidayBonus(studentSet1, 5000, 1000, 2000);
			assertEquals(4000.0, result[0], .001);
			double[] result1 = HolidayBonus.calculateHolidayBonus(studentSet2, 5000, 1000, 2000);
			assertEquals(7000.0, result1[0], .001);
			double[] result2 = HolidayBonus.calculateHolidayBonus(studentSet3, 5000, 1000, 2000);
			assertEquals(3000.0, result2[0], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	/**
	 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as
	 * other
	 */
	@Test
	public void testCalculateHolidayBonusSTUDENTB() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(studentSet1, 1000, 250, 500);
			assertEquals(1000.0, result[0], .001);
			double[] result1 = HolidayBonus.calculateHolidayBonus(studentSet2, 1000, 250, 500);
			assertEquals(1500.0, result1[0], .001);
			double[] result2 = HolidayBonus.calculateHolidayBonus(studentSet3, 1000, 250, 500);
			assertEquals(750.0, result2[0], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	/**
	 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and
	 * 2000 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		
		try {
			double result = HolidayBonus.calculateTotalHolidayBonus(studentSet1, 5000, 1000, 2000);
			assertEquals(22000.0, result, .001);
			double result1 = HolidayBonus.calculateTotalHolidayBonus(studentSet2, 5000, 1000, 2000);
			assertEquals(22000.0, result1, .001);
			double result2 = HolidayBonus.calculateTotalHolidayBonus(studentSet3, 5000, 1000, 2000);
			assertEquals(22000.0, result2, .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	/**
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and
	 * 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		
		try {
			double result = HolidayBonus.calculateTotalHolidayBonus(studentSet1, 1000, 250, 500);
			assertEquals(4750.0, result, .001);
			double result1 = HolidayBonus.calculateTotalHolidayBonus(studentSet2, 1000, 250, 500);
			assertEquals(4750.0, result1, .001);
			double result2 = HolidayBonus.calculateTotalHolidayBonus(studentSet3, 1000, 250, 500);
			assertEquals(4750.0, result2, .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}
}
