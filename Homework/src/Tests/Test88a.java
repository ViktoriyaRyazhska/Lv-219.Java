package Tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserve.lv219.homework.Exercise88a;

public class Test88a {
	static Exercise88a ex88a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ex88a = new Exercise88a();
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ex88a=null;
	}

	@Test
	public void testPow() {
		assertEquals(ex88a.pow(2, 2),4);
		assertEquals(ex88a.pow(1, 56),1);

	}
	
	@Test
	public void testContainsDigit() {
		assertTrue(ex88a.containsDigit(123, 1));
		assertFalse(ex88a.containsDigit(123, 4));
		assertFalse(ex88a.containsDigit(0, 2));
		assertTrue(ex88a.containsDigit(987, 7));
	}

}
