package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.softserve.lv219.homework.Exercise87_1;

public class Test87_1 {

	Exercise87_1 test;
	

	@Before
	public void setUp() throws Exception {
		test = new Exercise87_1();
	}

	@After
	public void tearDown() throws Exception {
		test=null;
	}

	@Test
	public void testCountSum() {
		assertEquals(0, test.countSum(20, 1));
		assertEquals(3, test.countSum(111, 3));
	}
	
}
