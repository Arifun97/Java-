import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {
	private GradeBook g1;
	private GradeBook g2;
	@BeforeEach
	public void setUp() {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		//Adding the score to each object.
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(80);
		g2.addScore(95);
	}

	@AfterEach
	public void tearDown()  {
		
			//Setting the both object to null.
			g1 = null;
			g2 = null;
	}


	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("80.0 95.0 "));
	}

	@Test
	public void testSum() {
		assertEquals(125,g1.sum(),0.001);
		assertEquals(175,g2.sum(),0.001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50,g1.minimum(),0.001);
		assertEquals(80,g2.minimum(),0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(75,g1.finalScore(),0.001);
		assertEquals(95,g2.finalScore(),0.001);
	}

}
