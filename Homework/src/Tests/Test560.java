package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserve.lv219.homework.Exercise560;

public class Test560 {

	Exercise560 test;
	

	@Before
	public void setUp() throws Exception {
		test= new Exercise560();
	}

	@After
	public void tearDown() throws Exception {
		test=null;
	}

	@Test
	public void testDiv() {
	assertEquals(8, test.div(10));
	assertEquals(1, test.div(5));
	assertEquals(1, test.div(13));
	}

}
